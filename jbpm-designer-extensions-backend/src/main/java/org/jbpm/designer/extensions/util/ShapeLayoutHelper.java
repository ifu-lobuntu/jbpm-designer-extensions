package org.jbpm.designer.extensions.util;

import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.di.Shape;

public class ShapeLayoutHelper {

    public static void positionElementOn(Shape umlDiagram, Shape shape) {
        Bounds bounds = DCFactory.eINSTANCE.createBounds();
        shape.setBounds(bounds);
        bounds.setHeight(40d);
        bounds.setWidth(200d);
        bounds.setY((umlDiagram.getOwnedElement().size() % 8) * 50d);
        bounds.setX((umlDiagram.getOwnedElement().size() / 8) * 220d);
    }

}
