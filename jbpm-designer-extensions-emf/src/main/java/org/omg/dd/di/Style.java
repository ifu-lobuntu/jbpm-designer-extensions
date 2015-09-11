/**
 */
package org.omg.dd.di;
import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.plugin.*;
import org.eclipse.emf.ecore.util.*;
import org.jbpm.designer.dd.jbpmdd.*;
import org.omg.dd.dc.*;
import org.omg.dd.dg.*;
import org.omg.dd.dg.util.*;
import org.omg.dd.di.impl.ShapeImpl;
import org.omg.dd.di.util.*;
import org.omg.dd.dc.util.*;
import org.omg.dd.di.*;

import java.lang.reflect.*;
import java.util.*;
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.di.Style#getFill <em>Fill</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getStrokeDashLength <em>Stroke Dash Length</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getFontItalic <em>Font Italic</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getFontBold <em>Font Bold</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getFontUnderline <em>Font Underline</em>}</li>
 *   <li>{@link org.omg.dd.di.Style#getFontStrikeThrough <em>Font Strike Through</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.di.DIPackage#getStyle()
 * @model abstract="true"
 * @generated
 */
public interface Style extends EObject {
    /**
     * Returns the value of the '<em><b>Fill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fill</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fill</em>' reference.
     * @see #setFill(Fill)
     * @see org.omg.dd.di.DIPackage#getStyle_Fill()
     * @model ordered="false"
     * @generated
     */
    Fill getFill();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFill <em>Fill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fill</em>' reference.
     * @see #getFill()
     * @generated
     */
    void setFill(Fill value);

    /**
     * Returns the value of the '<em><b>Fill Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fill Color</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fill Color</em>' containment reference.
     * @see #setFillColor(Color)
     * @see org.omg.dd.di.DIPackage#getStyle_FillColor()
     * @model containment="true" ordered="false"
     * @generated
     */
    Color getFillColor();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFillColor <em>Fill Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fill Color</em>' containment reference.
     * @see #getFillColor()
     * @generated
     */
    void setFillColor(Color value);

    /**
     * Returns the value of the '<em><b>Fill Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fill Opacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fill Opacity</em>' attribute.
     * @see #setFillOpacity(Double)
     * @see org.omg.dd.di.DIPackage#getStyle_FillOpacity()
     * @model dataType="org.omg.dd.primitivetypes.Real" ordered="false"
     * @generated
     */
    Double getFillOpacity();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFillOpacity <em>Fill Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fill Opacity</em>' attribute.
     * @see #getFillOpacity()
     * @generated
     */
    void setFillOpacity(Double value);

    /**
     * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stroke Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stroke Width</em>' attribute.
     * @see #setStrokeWidth(Double)
     * @see org.omg.dd.di.DIPackage#getStyle_StrokeWidth()
     * @model dataType="org.omg.dd.primitivetypes.Real" ordered="false"
     * @generated
     */
    Double getStrokeWidth();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getStrokeWidth <em>Stroke Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stroke Width</em>' attribute.
     * @see #getStrokeWidth()
     * @generated
     */
    void setStrokeWidth(Double value);

    /**
     * Returns the value of the '<em><b>Stroke Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stroke Opacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stroke Opacity</em>' attribute.
     * @see #setStrokeOpacity(Double)
     * @see org.omg.dd.di.DIPackage#getStyle_StrokeOpacity()
     * @model dataType="org.omg.dd.primitivetypes.Real" ordered="false"
     * @generated
     */
    Double getStrokeOpacity();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stroke Opacity</em>' attribute.
     * @see #getStrokeOpacity()
     * @generated
     */
    void setStrokeOpacity(Double value);

    /**
     * Returns the value of the '<em><b>Stroke Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stroke Color</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stroke Color</em>' containment reference.
     * @see #setStrokeColor(Color)
     * @see org.omg.dd.di.DIPackage#getStyle_StrokeColor()
     * @model containment="true" ordered="false"
     * @generated
     */
    Color getStrokeColor();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getStrokeColor <em>Stroke Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stroke Color</em>' containment reference.
     * @see #getStrokeColor()
     * @generated
     */
    void setStrokeColor(Color value);

    /**
     * Returns the value of the '<em><b>Stroke Dash Length</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Double}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stroke Dash Length</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stroke Dash Length</em>' attribute list.
     * @see org.omg.dd.di.DIPackage#getStyle_StrokeDashLength()
     * @model unique="false" dataType="org.omg.dd.primitivetypes.Real"
     * @generated
     */
    EList<Double> getStrokeDashLength();

    /**
     * Returns the value of the '<em><b>Font Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Size</em>' attribute.
     * @see #setFontSize(Double)
     * @see org.omg.dd.di.DIPackage#getStyle_FontSize()
     * @model dataType="org.omg.dd.primitivetypes.Real" ordered="false"
     * @generated
     */
    Double getFontSize();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFontSize <em>Font Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Size</em>' attribute.
     * @see #getFontSize()
     * @generated
     */
    void setFontSize(Double value);

    /**
     * Returns the value of the '<em><b>Font Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Name</em>' attribute.
     * @see #setFontName(String)
     * @see org.omg.dd.di.DIPackage#getStyle_FontName()
     * @model dataType="org.omg.dd.primitivetypes.String" ordered="false"
     * @generated
     */
    String getFontName();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFontName <em>Font Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Name</em>' attribute.
     * @see #getFontName()
     * @generated
     */
    void setFontName(String value);

    /**
     * Returns the value of the '<em><b>Font Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Color</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Color</em>' containment reference.
     * @see #setFontColor(Color)
     * @see org.omg.dd.di.DIPackage#getStyle_FontColor()
     * @model containment="true" ordered="false"
     * @generated
     */
    Color getFontColor();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFontColor <em>Font Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Color</em>' containment reference.
     * @see #getFontColor()
     * @generated
     */
    void setFontColor(Color value);

    /**
     * Returns the value of the '<em><b>Font Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Italic</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Italic</em>' attribute.
     * @see #setFontItalic(Boolean)
     * @see org.omg.dd.di.DIPackage#getStyle_FontItalic()
     * @model dataType="org.omg.dd.primitivetypes.Boolean" ordered="false"
     * @generated
     */
    Boolean getFontItalic();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFontItalic <em>Font Italic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Italic</em>' attribute.
     * @see #getFontItalic()
     * @generated
     */
    void setFontItalic(Boolean value);

    /**
     * Returns the value of the '<em><b>Font Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Bold</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Bold</em>' attribute.
     * @see #setFontBold(Boolean)
     * @see org.omg.dd.di.DIPackage#getStyle_FontBold()
     * @model dataType="org.omg.dd.primitivetypes.Boolean" ordered="false"
     * @generated
     */
    Boolean getFontBold();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFontBold <em>Font Bold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Bold</em>' attribute.
     * @see #getFontBold()
     * @generated
     */
    void setFontBold(Boolean value);

    /**
     * Returns the value of the '<em><b>Font Underline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Underline</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Underline</em>' attribute.
     * @see #setFontUnderline(Boolean)
     * @see org.omg.dd.di.DIPackage#getStyle_FontUnderline()
     * @model dataType="org.omg.dd.primitivetypes.Boolean" ordered="false"
     * @generated
     */
    Boolean getFontUnderline();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFontUnderline <em>Font Underline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Underline</em>' attribute.
     * @see #getFontUnderline()
     * @generated
     */
    void setFontUnderline(Boolean value);

    /**
     * Returns the value of the '<em><b>Font Strike Through</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Strike Through</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Strike Through</em>' attribute.
     * @see #setFontStrikeThrough(Boolean)
     * @see org.omg.dd.di.DIPackage#getStyle_FontStrikeThrough()
     * @model dataType="org.omg.dd.primitivetypes.Boolean" ordered="false"
     * @generated
     */
    Boolean getFontStrikeThrough();

    /**
     * Sets the value of the '{@link org.omg.dd.di.Style#getFontStrikeThrough <em>Font Strike Through</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Strike Through</em>' attribute.
     * @see #getFontStrikeThrough()
     * @generated
     */
    void setFontStrikeThrough(Boolean value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * fontSize >=  0
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_font_size(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * fillOpacity >=  0 and fillOpacity <=1
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_fill_opacity(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * strokeWidth >=  0
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_stroke_width(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * strokeDashLength->size().mod(2) = 0
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_dash_length_size(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * strokeOpacity >=  0 and strokeOpacity <=1
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean valid_stroke_opacity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Style
