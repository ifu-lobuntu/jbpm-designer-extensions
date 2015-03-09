package org.jbpm.designer.dd.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEList.UnmodifiableEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings({"rawtypes","unchecked"})
public class Collections {
    private static UnmodifiableEList EMPTY_LIST = new UnmodifiableEList(0, new Object[0]);
    public static <T  extends EObject> EList<T> asList(EObject ... e){
        for (EObject eObject : e) {
            if(eObject!=null){
                return buildList(e);
            }
        }
        return EMPTY_LIST;
    }
    protected static EList  buildList(EObject... e) {
        EList  result = new BasicEList();
        for (EObject eObject : e) {
            if(eObject!=null){
                result.add(eObject);
            }
        }
        return result;
    }
}
