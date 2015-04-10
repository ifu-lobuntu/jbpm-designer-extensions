package org.jbpm.designer.type;

import javax.enterprise.context.ApplicationScoped;

import org.uberfire.backend.vfs.Path;
import org.uberfire.workbench.type.ResourceTypeDefinition;

@ApplicationScoped
public class VdmlLibraryTypeDefinition implements ResourceTypeDefinition {

    @Override
    public String getShortName() {
        return "vdlib";
    }

    @Override
    public String getDescription() {
        return "VDML Library";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "vdlib";
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public boolean accept( final Path path ) {
        return ( path.getFileName().endsWith( "." + getSuffix() ) || path.getFileName().endsWith( ".vdlib" ) );
    }

    @Override
    public String getSimpleWildcardPattern() {
        return ".+vdlib";
    }
}