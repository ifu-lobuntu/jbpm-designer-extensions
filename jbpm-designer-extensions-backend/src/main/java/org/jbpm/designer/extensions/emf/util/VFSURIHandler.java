package org.jbpm.designer.extensions.emf.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.PlatformResourceURIHandlerImpl;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.Repository;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Map;


public class VFSURIHandler extends PlatformResourceURIHandlerImpl {

    private Repository repository;
    private static ThreadLocal<Deque<Boolean>> isRuntime = new ThreadLocal<Deque<Boolean>>();

    public VFSURIHandler(Repository repository) {
        super();
        this.repository = repository;
    }
    public static void setIsRuntime(boolean b){
        getIsRuntime().push(b);
    }

    private static Deque<Boolean> getIsRuntime() {
        if(isRuntime.get()==null){
            isRuntime.set(new ArrayDeque<Boolean>());
        }
        return isRuntime.get();
    }

    public static void unsetIsRuntime(boolean b){
        if(getIsRuntime().peek()!=b){
            throw new IllegalStateException();
        }
        getIsRuntime().pop();
    }
    @Override
    public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
        String relativeName = getRelativePath(uri);
        if (getIsRuntime().isEmpty() || Boolean.FALSE.equals(getIsRuntime().peek())) {
            return getFromRepository(relativeName);
        } else {
            return getFormClassPath(relativeName);
        }
    }

    private InputStream getFormClassPath(String relativeName) {
        InputStream result;
        do {
            result = Thread.currentThread().getContextClassLoader().getResourceAsStream(relativeName);
            relativeName = relativeName.substring(relativeName.indexOf('/', 1) + 1);
        } while (result != null && relativeName.indexOf('/', 1) > -1);
        return result;
    }

    private InputStream getFromRepository(String relativeName) {
        try {
            @SuppressWarnings("unchecked")
            Asset<String> asset = repository.loadAssetFromPath(relativeName);
            if (asset != null) {
                return new ByteArrayInputStream(asset.getAssetContent().toString().getBytes());
            }
        } catch (org.uberfire.java.nio.file.NoSuchFileException e) {
            return null;
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
