package org.omg.cmmn.util;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.ecore.xmi.*;
import org.eclipse.emf.ecore.xmi.impl.*;
import org.jbpm.cmmn.dd.cmmndi.*;
import org.jbpm.designer.dd.jbpmdd.*;
import org.jbpm.designer.dd.util.Collections;
import org.omg.cmmn.*;
import org.omg.dd.di.impl.*;
import org.omg.dd.di.*;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Provides static helper methods for dealing with imports.
 * @author Henning Heitkoetter
 *
 */
public class ImportHelper {

    /**
     * Searches the resource's {@linkplain Resource#getContents() contents} for the root Definitions object.
     * @param resource The resource to search.
     * @return The root Definitions object contained in the resource. Either the first
     * object of type Definitions in the {@linkplain Resource#getContents() contents} of the resource or
     * the value of the {@linkplain DocumentRoot#getDefinitions() Definitions reference} of the first
     * DocumentRoot object. <code>null</code>, if no Definitions is found.
     */
    public static TDefinitions getDefinitions(Resource resource) {
        for (EObject eobj : resource.getContents()) {
            if (eobj instanceof TDefinitions) {
                return (TDefinitions) eobj;
            } else if (eobj instanceof DocumentRoot) {
                return ((DocumentRoot) eobj).getDefinitions();
            }
        }
        return null;
    }

    /**
     * Looks up the list of import elements in the given Definitions object for an import of the given namespace.
     * @param definitions The Definitions object to search for an import element.
     * @param namespace The namespace to look for in {@link Import#getNamespace()}.
     * @return The first import element in {@link Definitions#getImports()} with {@link Import#getNamespace()}
     * equal to the given namespace.
     */
    public static TImport findImportForNamespace(TDefinitions definitions, String namespace) {
        for (TImport imp : definitions.getImport()) {
            if (namespace.equals(imp.getNamespace())) {
                return imp;
            }
        }
        return null;
    }

    /**
     * Looks up the list of import elements in the given Definitions object for an import of the given location.
     *
     * The location values of the import elements in the Definitions parameter are resolved against the
     * absolute URI of the resource that contains the Definitions object. The result is compared against
     * the absolute form of location.
     * @param referencingModel The Definitions object to search for an import element.
     * @param location The location to look for in {@link Import#getLocation()}.
     * @return The import element with a matching location value, or <code>null</code>, if none is found.
     */
    public static TImport findImportForLocation(TDefinitions referencingModel, URI location) {
        URI referencingURI = makeURICanonical(referencingModel.eResource().getURI());
        URI referencedURI = makeURICanonical(location);
        for (TImport imp : referencingModel.getImport()) {
            if (imp.getLocation() != null) {
                URI importUri = URI.createURI(imp.getLocation()).resolve(referencingURI);
                if (importUri.equals(referencedURI)) {
                    // TODO: Also check that imp.getType() is CMMN
                    return imp;
                }
            }
        }
        return null;
    }

    /**
     * Returns an absolute canonical representation of the given URI.
     *
     * A relative uri is interpreted as relative to the working directory and made absolute. Furthermore,
     * redundant segments ("./") from the path are removed.
     * @param uri A relative or absolute URI.
     * @return <code>uri</code> in absolute and canonical form, obtained by creating a {@linkplain File file}
     * from it and taking its {@linkplain File#getCanonicalPath() canonical path}.
     */
    public static URI makeURICanonical(URI uri) {
        if (uri.isFile()) {
            File tmpFile = new File(uri.toFileString());
            try {
                return URI.createFileURI(tmpFile.getCanonicalPath());
            } catch (IOException e) {
                return URI.createFileURI(tmpFile.getAbsolutePath());
            }
        } else
            return uri;
    }

}
