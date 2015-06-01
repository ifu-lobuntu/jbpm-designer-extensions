package org.jbpm.designer.extensions.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;

import de.malkusch.whoisServerList.publicSuffixList.PublicSuffixList;
import de.malkusch.whoisServerList.publicSuffixList.PublicSuffixListFactory;

public class NamespacePackageConverter {
    private static PublicSuffixList suffixList;
    static {
        PublicSuffixListFactory factory = new PublicSuffixListFactory();
        suffixList = factory.build();
    }

    public static void main(String[] args) throws Exception{
        System.out.println(urlToPackage(new URL("http://www.jbpm.org/designer/test/cmmn")));
        System.out.println(urlToNamespace("za.co.fiefie.kaploems.skwadams"));
        System.out.println(urlToNamespace("com.fiefie.kaploems.skwadams"));
        System.out.println(urlToNamespace("fiefie.kaploems.skwadams"));
        System.out.println(urlToNamespace("org.fiefie.kaploems.skwadams"));
        System.out.println(urlToPackage(urlToNamespace("za.co.fiefie.kaploems.skwadams")));
        System.out.println(urlToPackage(urlToNamespace("com.fiefie.kaploems.skwadams")));
        System.out.println(urlToPackage(urlToNamespace("fiefie.kaploems.skwadams")));
        System.out.println(urlToPackage(urlToNamespace("org.fiefie.kaploems.skwadams")));
    }

    public static URL urlToNamespace(String packageName) throws MalformedURLException {
        String uri=null;
        String[] split = packageName.split("\\.");
        if (split.length == 1) {
            uri="http://" + split[0];
        } else if (split.length == 2) {
            if (suffixList.isPublicSuffix(split[0])) {
                uri="http://" + split[1] + "." + split[0];
            } else {
                uri="http://" + split[0] + "/" + split[1];
            }
        } else {
            String twoPartDomain = split[1] + "." + split[0];
            String threePartDomain = split[2] + "." + twoPartDomain;
            StringBuilder sb = new StringBuilder("http://www.");
            int start = 0;
            if (suffixList.isRegistrable(threePartDomain)) {
                sb.append(threePartDomain);
                start = 3;
            } else if (suffixList.isRegistrable(twoPartDomain)) {
                sb.append(twoPartDomain);
                start = 2;
            }else{
                start=0;
            }
            for (int i = start; i < split.length; i++) {
                sb.append("/");
                sb.append(split[i]);
            }
            uri=sb.toString();
        }
        return new URL(uri);
    }
    public static String urlToPackage(URL url){
        String h = url.getHost();
        if(h.startsWith("www.")){
            h=h.substring(4);
        }
        String[] host = h.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i = host.length-1;i>=0; i --){
            sb.append(host[i]);
            if(i>0){
                sb.append(".");
            }
        }
        if(url.getPath()==null || url.getPath().isEmpty()){
            return sb.toString();
        }else{
            sb.append(url.getPath().replaceAll("\\/", "."));
            return sb.toString();
        }
    }

    public static URL uriToNamespace(URI uri) {
        try {
            String packageName = uriToPackage(uri);
            return urlToNamespace(packageName);
        } catch (MalformedURLException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String uriToPackage(URI uri) {
        String namespaceURI = uri.toString();
        if (!(namespaceURI.contains("/src/") && namespaceURI.contains("/resources/"))) {
            throw new IllegalStateException(namespaceURI + " is not a supported URI");
        }
        int srcIndex = namespaceURI.indexOf("src") + 3;
        int resourcesIndex = namespaceURI.indexOf("resources", srcIndex) + 10;
        String packageName = null;
        if (resourcesIndex >= namespaceURI.lastIndexOf("/")) {
            // Use project name
            packageName = namespaceURI.substring("platform:/resource/".length());
            packageName = packageName.substring(0, packageName.indexOf('/'));
        } else {
            packageName = namespaceURI.substring(resourcesIndex, namespaceURI.lastIndexOf("/")).replace('/', '.');
        }
        return packageName;
    }
}
