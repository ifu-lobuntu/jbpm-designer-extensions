package org.eclipse.cmmn1.util;

public class NamespaceHelper {

    /**
     * Returns the target namespace of the XML schema for the package denoted by
     * the given XMI namespace URI.
     *
     * @param xmiNsUri
     *            The XMI namespace of the package (ending with "-XMI").
     * @return The corresponding XSD namespace URI, i.e. the xmiNsUri without
     *         the XMI suffix.
     */
    public static String xmiToXsdNamespaceUri(String xmiNsUri) {
        if (!xmiNsUri.endsWith("-XMI"))
            throw new IllegalArgumentException("XMI namespace expected");

        return xmiNsUri.substring(0, xmiNsUri.length() - 4);
    }

}
