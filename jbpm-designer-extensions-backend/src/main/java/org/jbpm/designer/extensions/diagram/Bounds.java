package org.jbpm.designer.extensions.diagram;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Philipp Bounds represent the svg bound of a shape
 */
@XmlRootElement
public class Bounds {
    Point lowerRight;
    Point upperLeft;
    public Bounds() {
    }
    /**
     * Constructs a Bounds with initial lowerRight and upperleft
     *
     * @param lowerRight
     * @param upperLeft
     */
    public Bounds(Point lowerRight, Point upperLeft) {
        super();
        this.lowerRight = lowerRight;
        this.upperLeft = upperLeft;
    }
    public Point getCenter(){
        return new Point((upperLeft.getX() + lowerRight.getX())/2 ,(upperLeft.getY() + lowerRight.getY())/2 );
    }
    /**
     * @return the lowerRight of a Bounds
     */
    public Point getLowerRight() {
        return lowerRight;
    }

    /**
     * @param lowerRight
     *            the lowerRight to set
     */
    public void setLowerRight(Point lowerRight) {
        this.lowerRight = lowerRight;
    }

    /**
     * @return the upperLeft of a Bounds
     */
    public Point getUpperLeft() {
        return upperLeft;
    }

    /**
     * @param upperLeft
     *            the upperLeft to set
     */
    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

}
