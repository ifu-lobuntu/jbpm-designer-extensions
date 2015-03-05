package org.jbpm.designer.type;

import javax.enterprise.context.ApplicationScoped;

import org.uberfire.backend.vfs.Path;
import org.uberfire.workbench.type.ResourceTypeDefinition;

@ApplicationScoped
public class VdmlActivityNetworkTypeDefinition implements ResourceTypeDefinition {

    @Override
    public String getShortName() {
        return "vdan";
    }

    @Override
    public String getDescription() {
        return "Vdml Activity Network";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "vdan";
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public boolean accept( final Path path ) {
        return ( path.getFileName().endsWith( "." + getSuffix() ) || path.getFileName().endsWith( ".vdan" ) );
    }

    @Override
    public String getSimpleWildcardPattern() {
        return ".+vdan$";
    }
}