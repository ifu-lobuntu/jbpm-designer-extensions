package org.jbpm.designer.type;

import javax.enterprise.context.ApplicationScoped;

import org.uberfire.backend.vfs.Path;
import org.uberfire.workbench.type.ResourceTypeDefinition;

@ApplicationScoped
public class MeasureLibraryTypeDefinition implements ResourceTypeDefinition {

    @Override
    public String getShortName() {
        return "meas";
    }

    @Override
    public String getDescription() {
        return "Measure Library";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "meas";
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public boolean accept( final Path path ) {
        return ( path.getFileName().endsWith( "." + getSuffix() ) || path.getFileName().endsWith( ".meas" ) );
    }

    @Override
    public String getSimpleWildcardPattern() {
        return ".+meas$";
    }
}