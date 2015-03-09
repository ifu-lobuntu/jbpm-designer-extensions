package org.jbpm.designer.extensions.emf.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;

import javax.enterprise.event.Event;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.PlatformResourceURIHandlerImpl;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.Repository;
import org.jbpm.designer.server.service.PathEvent;

public class VFSUriHandler extends PlatformResourceURIHandlerImpl {

    private Repository repository;

    public VFSUriHandler(Repository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
        String relativeName = getRelativePath(uri);
        @SuppressWarnings("unchecked")
        Asset<String> asset = repository.loadAssetFromPath(relativeName);
        if(asset!=null){
            return new ByteArrayInputStream(asset.getAssetContent().toString().getBytes());
        }
        return null;

    }

    private String getRelativePath(URI uri) {
        return uri.toPlatformString(true);
    }

    @Override
    public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
        throw new IOException("Please use the VFS API to write to resources");
    }

    @Override
    public void delete(URI uri, Map<?, ?> options) throws IOException {
        throw new IOException("Please use the VFS API to delete resources");
    }

    @Override
    public boolean exists(URI uri, Map<?, ?> options) {
        return repository.assetExists(getRelativePath(uri));
    }

    @Override
    public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
        return Collections.emptyMap();
    }

    @Override
    public void setAttributes(URI uri, Map<String, ?> attributes, Map<?, ?> options) throws IOException {
        throw new IOException("Please use the VFS API to write to resources");
    }

}
