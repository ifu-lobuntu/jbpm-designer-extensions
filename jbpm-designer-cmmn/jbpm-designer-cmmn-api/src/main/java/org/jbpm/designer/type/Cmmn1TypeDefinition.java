package org.jbpm.designer.type;

import javax.enterprise.context.ApplicationScoped;

import org.uberfire.backend.vfs.Path;
import org.uberfire.workbench.type.ResourceTypeDefinition;

@ApplicationScoped
public class Cmmn1TypeDefinition implements ResourceTypeDefinition {

    @Override
    public String getShortName() {
        return "cmmn";
    }

    @Override
    public String getDescription() {
        return "Case Definition";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "cmmn";
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public boolean accept( final Path path ) {
        return ( path.getFileName().endsWith( "." + getSuffix() ) || path.getFileName().endsWith( ".cmmn" ) );
    }

    @Override
    public String getSimpleWildcardPattern() {
        return ".+cmmn$";
    }
}