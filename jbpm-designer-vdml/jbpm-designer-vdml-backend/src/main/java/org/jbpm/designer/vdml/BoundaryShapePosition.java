package org.jbpm.designer.vdml;

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
            System.out.println();
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
    
}
