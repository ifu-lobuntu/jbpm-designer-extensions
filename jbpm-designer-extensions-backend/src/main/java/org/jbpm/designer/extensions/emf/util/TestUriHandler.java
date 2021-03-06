package org.jbpm.designer.extensions.emf.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ArchiveURIHandlerImpl;

public class TestUriHandler implements URIHandler {
    ArchiveURIHandlerImpl archiveHandler=new ArchiveURIHandlerImpl();
    @Override
    public boolean canHandle(URI uri) {
        return true;
    }

    public static void main(String[] args) throws Exception {
        URI uri = URI.createPlatformResourceURI("/jbpm-designer-backend/src/test/resources/org/jbpm/designer/test/cmmn/test.cmmn", true);
        File file = new TestUriHandler().getFile(uri);
    }

    @Override
    public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
        if (uri.isArchive()) {
            return archiveHandler.createInputStream(uri, options);
        }
        return new FileInputStream(getFile(uri));
    }

    public File getFile(URI uri)  {
        try {
            File canonicalFile = new File(".").getCanonicalFile();
            if(uri.isPlatformResource()){
                String platformString = uri.toPlatformString(true);
                return new File(getFakeWorkspaceRoot(canonicalFile), platformString);
            }else{
                return new File(uri.toFileString());
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private File getFakeWorkspaceRoot(File currentDir) {
        File root = currentDir;
        FilenameFilter pomFilter = new FilenameFilter() {

            @Override
            public boolean accept(File parent, String name) {
                return name.equals("pom.xml");
            }
        };
        if (root.listFiles(pomFilter).length == 0) {
            root = getFakeWorkspaceRoot(root.getParentFile());
        }
        return root.getParentFile();
    }

    @Override
    public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
        return new FileOutputStream(getFile(uri));
    }

    @Override
    public void delete(URI uri, Map<?, ?> options) throws IOException {

    }

    @Override
    public Map<String, ?> contentDescription(URI uri, Map<?, ?> options) throws IOException {
        return null;
    }

    @Override
    public boolean exists(URI uri, Map<?, ?> options) {
        return true;
    }

    @Override
    public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
        return null;
    }

    @Override
    public void setAttributes(URI uri, Map<String, ?> attributes, Map<?, ?> options) throws IOException {

    }

}
