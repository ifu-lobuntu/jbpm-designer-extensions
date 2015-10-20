package org.jbpm.designer.client.vdlib;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;


public class ClassDiagramStencilsetImporter {
    @Test
    public void test() throws Exception{
        File root = new File(".").getCanonicalFile().getParentFile().getParentFile();
        File umlClient = new File(root, path("jbpm-designer-uml/jbpm-designer-uml-client"));
        File umlPublicDir = new File(umlClient, path("src/main/resources/org/jbpm/designer/public"));
        File vdmlPublicDir = new File(path("./src/main/resources/org/jbpm/designer/public"));
        File umlStencilDir = new File(umlPublicDir, path("stencilsets/ucd"));
        FileUtils.copyDirectory(new File(umlStencilDir, "view"), new File(vdmlPublicDir, path("stencilsets/vdlib/view")));
        FileUtils.copyDirectory(new File(umlStencilDir, "icons"), new File(vdmlPublicDir, path("stencilsets/vdlib/icons")));
        BufferedReader br = new BufferedReader(new FileReader(new File(umlStencilDir, "ucd.json")));
        FileWriter fw = new FileWriter(new File(vdmlPublicDir, path("stencilsets/vdlib/vdlib.json")), false);
        String line = null;
        boolean readingIgnoredConnectionRules = false;
        while ((line = br.readLine()) != null) {
            if (line.contains("ucd")) {
                line = line.replace("ucd", "vdlib");
            }
            if (line.equals("        \"connectionRules\" : [")) {
                readingIgnoredConnectionRules = true;
                fw.write(chopOffRootDeclaration(vdmlPublicDir, "stencilsets/vdlib/vdlib_connection_rules.json",1));
            } else {
                String out=line+"\n";
                if (line.startsWith("    \"propertyPackages\" : [")) {
                    readingIgnoredConnectionRules = false;
                    out+=chopOffRootDeclaration(vdmlPublicDir,"stencilsets/vdlib/vdlib_property_packages.json",2);
                }
                if (line.startsWith("    \"stencils\" : [")) {
                    readingIgnoredConnectionRules = false;
                    out+= chopOffRootDeclaration(vdmlPublicDir, "stencilsets/vdlib/vdlib_stencils.json",2);
                }
                if (line.equals("        \"morphingRules\": [")) {
                    readingIgnoredConnectionRules = false;
                    out+=FileUtils.readFileToString(new File(vdmlPublicDir, path("stencilsets/vdlib/vdlib_morphing_rules.json")));
                }
                if (line.equals("        \"containmentRules\" : [")) {
                    readingIgnoredConnectionRules = false;
                    out+=FileUtils.readFileToString(new File(vdmlPublicDir, path("stencilsets/vdlib/vdlib_containment_rules.json")));
                }
                if (!readingIgnoredConnectionRules) {
                    fw.write(out);
                }
            }
        }
        fw.flush();
    }

    protected String chopOffRootDeclaration(File vdmlPublicDir, String path, int lineCount) throws IOException {
        String[] split = FileUtils.readFileToString(new File(vdmlPublicDir, path(path))).split("\\n");
        StringBuilder sb = new StringBuilder();
        for (int i = lineCount; i < split.length-lineCount; i++) {
            sb.append(split[i]);
            sb.append("\n");
        }
        sb.append(",");
        return sb.toString();
    }

    private static String path(String path) {
        return path.replace('/', File.separatorChar);
    }
}
