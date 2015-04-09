package org.jbpm.designer.type;

import javax.enterprise.context.ApplicationScoped;

import org.uberfire.backend.vfs.Path;
import org.uberfire.workbench.type.ResourceTypeDefinition;

@ApplicationScoped
public class VdmlRoleCollaborationTypeDefinition implements ResourceTypeDefinition {

    @Override
    public String getShortName() {
        return "vdrc";
    }

    @Override
    public String getDescription() {
        return "VDML Role Collaboration";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "vdrc";
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public boolean accept( final Path path ) {
        return ( path.getFileName().endsWith( "." + getSuffix() ) || path.getFileName().endsWith( ".vdrc" ) );
    }

    @Override
    public String getSimpleWildcardPattern() {
        return ".+vdrc$";
    }
}