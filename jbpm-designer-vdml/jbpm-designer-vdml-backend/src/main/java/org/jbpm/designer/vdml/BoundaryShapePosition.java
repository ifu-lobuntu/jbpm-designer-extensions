package org.jbpm.designer.vdml;

import org.jbpm.designer.extensions.diagram.Point;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.DCFactory;

public enum BoundaryShapePosition {
    LEFT_TOP {
        @Override
        public Bounds getBounds(Bounds parent) {
            Bounds result = super.getBounds(parent);
            result.setX(parent.getX() - getHalfSize());
            result.setY(parent.getY() + getInset());
            return result;
        }
    },
    LEFT_BOTTOM {
        @Override
        public Bounds getBounds(Bounds parent) {
            Bounds result = super.getBounds(parent);
            result.setX(parent.getX() - getHalfSize());
            result.setY(parent.getY() + parent.getHeight() - getInset() - getFullSize());
            return result;
        }
    },
    BOTTOM_LEFT {
        @Override
        public Bounds getBounds(Bounds parent) {
            Bounds result = super.getBounds(parent);
            result.setX(parent.getX() + getInset());
            result.setY(parent.getY() + parent.getHeight() - getHalfSize());
            return result;
        }
    },
    BOTTOM_RIGHT {
        @Override
        public Bounds getBounds(Bounds parent) {
            Bounds result = super.getBounds(parent);
            result.setX(parent.getX() + parent.getWidth() - getInset()-getFullSize());
            result.setY(parent.getY() + parent.getHeight() - getHalfSize());
            return result;
        }
    },
    RIGHT_BOTTOM {
        @Override
        public Bounds getBounds(Bounds parent) {
            Bounds result = super.getBounds(parent);
            result.setX(parent.getX() + parent.getWidth() - getHalfSize());
            result.setY(parent.getY() + parent.getHeight() - getInset()-getFullSize());
            return result;
        }
    },
    RIGHT_TOP {
        @Override
        public Bounds getBounds(Bounds parent) {
            Bounds result = super.getBounds(parent);
            result.setX(parent.getX() + parent.getWidth() - getHalfSize());
            result.setY(parent.getY() + +getInset());
            return result;
        }
    },
    TOP_RIGHT {
        @Override
        public Bounds getBounds(Bounds parent) {
            Bounds result = super.getBounds(parent);
            result.setX(parent.getX() + parent.getWidth() - getInset()-getFullSize());
            result.setY(parent.getY() - getHalfSize());
            return result;
        }
    },
    TOP_LEFT {
        @Override
        public Bounds getBounds(Bounds parent) {
            Bounds result = super.getBounds(parent);
            result.setX(parent.getX() + getInset());
            result.setY(parent.getY() - getHalfSize());
            return result;
        }

    };
    protected int getHalfSize() {
        return 7;
    }
    protected int getInset() {
        return 20;
    }

    public Bounds getBounds(Bounds parent) {
        Bounds result = DCFactory.eINSTANCE.createBounds();
        result.setHeight(getFullSize());
        result.setWidth(14d);
        return result;
    }
    protected double getFullSize() {
        return 14d;
    }
    public static void ensureBoundaryShape(Shape containerShape, Shape targetShape2, VDMLShape parentVdmlShape) {
        boolean found = false;
        for (ShapeReference sr : containerShape.getOutgoing()) {
            if (sr.getResourceId().equals(targetShape2.getResourceId())) {
                found = true;
                break;
            }
        }
        if (!found) {
            containerShape.addOutgoing(targetShape2);
            BoundaryShapePosition pos = values()[containerShape.getOutgoing().size() % values().length];
            Bounds newBounds = pos.getBounds(parentVdmlShape.getBounds());
            Point upperLeft = targetShape2.getUpperLeft();
            upperLeft.setX(newBounds.getX());
            upperLeft.setY(newBounds.getY());
            targetShape2.putProperty("isExpanded","false");
            targetShape2.putProperty("previousWidth","200");
            targetShape2.putProperty("previousHeight","100");
            Point lowerRight = targetShape2.getLowerRight();
            lowerRight.setX(newBounds.getX()+14);
            lowerRight.setY(newBounds.getY()+14);
            double absoluteX = (upperLeft.getX() + lowerRight.getX()) / 2;
            double absoluteY = (upperLeft.getY() + lowerRight.getY()) / 2;
            targetShape2.getDockers().add(
                    new Point(absoluteX - containerShape.getBounds().getUpperLeft().getX(), absoluteY - containerShape.getBounds().getUpperLeft().getY()));
        }
    }
    
}
