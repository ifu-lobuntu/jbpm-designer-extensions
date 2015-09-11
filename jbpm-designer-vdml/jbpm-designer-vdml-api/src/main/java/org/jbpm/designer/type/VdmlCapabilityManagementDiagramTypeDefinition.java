package org.jbpm.designer.type;

import org.uberfire.backend.vfs.Path;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class VdmlCapabilityManagementDiagramTypeDefinition implements ResourceTypeDefinition {

    @Override
    public String getShortName() {
        return "vdcm";
    }

    @Override
    public String getDescription() {
        return "Capability Management Diagram";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "vdcm";
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public boolean accept( final Path path ) {
        return ( path.getFileName().endsWith( "." + getSuffix() ) || path.getFileName().endsWith( ".vdcm" ) );
    }

    @Override
    public String getSimpleWildcardPattern() {
        return ".+vdcm$";
    }
}