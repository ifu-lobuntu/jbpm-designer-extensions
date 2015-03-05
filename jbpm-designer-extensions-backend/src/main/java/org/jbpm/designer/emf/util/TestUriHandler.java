package org.jbpm.designer.emf.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;

public class TestUriHandler implements URIHandler {

    @Override
    public boolean canHandle(URI uri) {
        return true;
    }

    public static void main(String[] args) throws Exception {
        URI uri = URI.createPlatformResourceURI("/jbpm-designer-backend/src/test/resources/org/jbpm/designer/test/cmmn/test.cmmn", true);
        File file = new TestUriHandler().getFile(uri);
        System.out.println(file);
        System.out.println(file.exists());
    }

    @Override
    public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
        return new FileInputStream(getFile(uri));
    }

    private File getFile(URI uri) throws IOException {
            return new File(getFakeWorkspaceRoot(new File(".").getCanonicalFile()), uri.toPlatformString(true));
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
        return null;
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