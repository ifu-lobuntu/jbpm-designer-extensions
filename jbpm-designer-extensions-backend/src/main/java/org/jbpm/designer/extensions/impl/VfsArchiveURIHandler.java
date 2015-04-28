package org.jbpm.designer.extensions.impl;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ArchiveURIHandlerImpl;

public final class VfsArchiveURIHandler extends ArchiveURIHandlerImpl {
    public boolean canHandle(URI uri) {
        return uri.toString().startsWith("vfs");
    }

    public InputStream createInputStream(URI uri, java.util.Map<?,?> options) throws IOException {
        String newUri = uri.toString().replace("jar:", "archive:").replace("vfs:", "archive:file:").replace(".jar/", ".jar!/");
        return super.createInputStream(URI.createURI(newUri), options);
    }
}