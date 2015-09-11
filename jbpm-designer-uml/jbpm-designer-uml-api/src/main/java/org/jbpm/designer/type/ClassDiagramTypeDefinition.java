package org.jbpm.designer.type;


import org.uberfire.backend.vfs.Path;
import org.uberfire.workbench.type.ResourceTypeDefinition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClassDiagramTypeDefinition implements ResourceTypeDefinition {

    @Override
    public String getShortName() {
        return "ucd";
    }

    @Override
    public String getDescription() {
        return "Class Diagram";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "ucd";
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public boolean accept( final Path path ) {
        return ( path.getFileName().endsWith( "." + getSuffix() ) || path.getFileName().endsWith( ".ucd" ) );
    }

    @Override
    public String getSimpleWildcardPattern() {
        return ".+ucd$";
    }
}