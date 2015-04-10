package org.jbpm.designer.client.vdlib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class ClassDiagramStencilsetImporter {
    @Test
    public void test() throws Exception{
        File root = new File(".").getCanonicalFile().getParentFile().getParentFile();
        File umlClient = new File(root, path("jbpm-designer-uml/jbpm-designer-uml-client"));
        File umlPublicDir = new File(umlClient, path("src/main/resources/org/jbpm/designer/public"));
        File vdmlPublicDir = new File(path("./src/main/resources/org/jbpm/designer/public"));
        File umlStencilDir = new File(umlPublicDir, path("stencilsets/ucd"));
        FileUtils.copyDirectory(new File(umlStencilDir, "view"), new File(vdmlPublicDir, path("stencilsets/vdlib/view")));
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
                fw.write(FileUtils.readFileToString(new File(vdmlPublicDir, path("stencilsets/vdlib/vdlib_connection_rules.json"))));
            } else {
                String out=line+"\n";
                if (line.startsWith("    \"propertyPackages\" : [")) {
                    readingIgnoredConnectionRules = false;
                    out+=FileUtils.readFileToString(new File(vdmlPublicDir, path("stencilsets/vdlib/vdlib_property_packages.json")));
                }
                if (line.startsWith("    \"stencils\" : [")) {
                    readingIgnoredConnectionRules = false;
                    out+=FileUtils.readFileToString(new File(vdmlPublicDir, path("stencilsets/vdlib/vdlib_stencils.json")));
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

    private static String path(String path) {
        return path.replace('/', File.separatorChar);
    }
}
