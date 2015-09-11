package org.jbpm.designer.type;

import org.uberfire.backend.vfs.Path;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class VdmlPropositionExchangeTypeDefinition implements ResourceTypeDefinition {

    @Override
    public String getShortName() {
        return "vdpe";
    }

    @Override
    public String getDescription() {
        return "Vdml Proposition Exchange";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "vdpe";
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public boolean accept( final Path path ) {
        return ( path.getFileName().endsWith( "." + getSuffix() ) || path.getFileName().endsWith( ".vdpe" ) );
    }

    @Override
    public String getSimpleWildcardPattern() {
        return ".+vdpe$";
    }
}