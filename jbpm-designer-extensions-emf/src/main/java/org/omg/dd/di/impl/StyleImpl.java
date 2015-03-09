/**
 */
package org.omg.dd.di.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.omg.dd.dc.Color;
import org.omg.dd.dg.Fill;
import org.omg.dd.di.DIPackage;
import org.omg.dd.di.Style;
import org.omg.dd.di.util.DIValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getStrokeDashLength <em>Stroke Dash Length</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFontItalic <em>Font Italic</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFontBold <em>Font Bold</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFontUnderline <em>Font Underline</em>}</li>
 *   <li>{@link org.omg.dd.di.impl.StyleImpl#getFontStrikeThrough <em>Font Strike Through</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StyleImpl extends MinimalEObjectImpl.Container implements Style {
    /**
     * The cached value of the '{@link #getFill() <em>Fill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFill()
     * @generated
     * @ordered
     */
    protected Fill fill;

    /**
     * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFillColor()
     * @generated
     * @ordered
     */
    protected Color fillColor;

    /**
     * The default value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFillOpacity()
     * @generated
     * @ordered
     */
    protected static final Double FILL_OPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFillOpacity()
     * @generated
     * @ordered
     */
    protected Double fillOpacity = FILL_OPACITY_EDEFAULT;

    /**
     * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrokeWidth()
     * @generated
     * @ordered
     */
    protected static final Double STROKE_WIDTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrokeWidth()
     * @generated
     * @ordered
     */
    protected Double strokeWidth = STROKE_WIDTH_EDEFAULT;

    /**
     * The default value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrokeOpacity()
     * @generated
     * @ordered
     */
    protected static final Double STROKE_OPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrokeOpacity()
     * @generated
     * @ordered
     */
    protected Double strokeOpacity = STROKE_OPACITY_EDEFAULT;

    /**
     * The cached value of the '{@link #getStrokeColor() <em>Stroke Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrokeColor()
     * @generated
     * @ordered
     */
    protected Color strokeColor;

    /**
     * The cached value of the '{@link #getStrokeDashLength() <em>Stroke Dash Length</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrokeDashLength()
     * @generated
     * @ordered
     */
    protected EList<Double> strokeDashLength;

    /**
     * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontSize()
     * @generated
     * @ordered
     */
    protected static final Double FONT_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontSize()
     * @generated
     * @ordered
     */
    protected Double fontSize = FONT_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontName()
     * @generated
     * @ordered
     */
    protected static final String FONT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontName()
     * @generated
     * @ordered
     */
    protected String fontName = FONT_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontColor()
     * @generated
     * @ordered
     */
    protected Color fontColor;

    /**
     * The default value of the '{@link #getFontItalic() <em>Font Italic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontItalic()
     * @generated
     * @ordered
     */
    protected static final Boolean FONT_ITALIC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFontItalic() <em>Font Italic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontItalic()
     * @generated
     * @ordered
     */
    protected Boolean fontItalic = FONT_ITALIC_EDEFAULT;

    /**
     * The default value of the '{@link #getFontBold() <em>Font Bold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontBold()
     * @generated
     * @ordered
     */
    protected static final Boolean FONT_BOLD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFontBold() <em>Font Bold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontBold()
     * @generated
     * @ordered
     */
    protected Boolean fontBold = FONT_BOLD_EDEFAULT;

    /**
     * The default value of the '{@link #getFontUnderline() <em>Font Underline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontUnderline()
     * @generated
     * @ordered
     */
    protected static final Boolean FONT_UNDERLINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFontUnderline() <em>Font Underline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontUnderline()
     * @generated
     * @ordered
     */
    protected Boolean fontUnderline = FONT_UNDERLINE_EDEFAULT;

    /**
     * The default value of the '{@link #getFontStrikeThrough() <em>Font Strike Through</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontStrikeThrough()
     * @generated
     * @ordered
     */
    protected static final Boolean FONT_STRIKE_THROUGH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFontStrikeThrough() <em>Font Strike Through</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontStrikeThrough()
     * @generated
     * @ordered
     */
    protected Boolean fontStrikeThrough = FONT_STRIKE_THROUGH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DIPackage.Literals.STYLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fill getFill() {
        if (fill != null && fill.eIsProxy()) {
            InternalEObject oldFill = (InternalEObject)fill;
            fill = (Fill)eResolveProxy(oldFill);
            if (fill != oldFill) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DIPackage.STYLE__FILL, oldFill, fill));
            }
        }
        return fill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fill basicGetFill() {
        return fill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFill(Fill newFill) {
        Fill oldFill = fill;
        fill = newFill;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FILL, oldFill, fill));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Color getFillColor() {
        return fillColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFillColor(Color newFillColor, NotificationChain msgs) {
        Color oldFillColor = fillColor;
        fillColor = newFillColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FILL_COLOR, oldFillColor, newFillColor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFillColor(Color newFillColor) {
        if (newFillColor != fillColor) {
            NotificationChain msgs = null;
            if (fillColor != null)
                msgs = ((InternalEObject)fillColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DIPackage.STYLE__FILL_COLOR, null, msgs);
            if (newFillColor != null)
                msgs = ((InternalEObject)newFillColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DIPackage.STYLE__FILL_COLOR, null, msgs);
            msgs = basicSetFillColor(newFillColor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FILL_COLOR, newFillColor, newFillColor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getFillOpacity() {
        return fillOpacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFillOpacity(Double newFillOpacity) {
        Double oldFillOpacity = fillOpacity;
        fillOpacity = newFillOpacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FILL_OPACITY, oldFillOpacity, fillOpacity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStrokeWidth(Double newStrokeWidth) {
        Double oldStrokeWidth = strokeWidth;
        strokeWidth = newStrokeWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__STROKE_WIDTH, oldStrokeWidth, strokeWidth));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getStrokeOpacity() {
        return strokeOpacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStrokeOpacity(Double newStrokeOpacity) {
        Double oldStrokeOpacity = strokeOpacity;
        strokeOpacity = newStrokeOpacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__STROKE_OPACITY, oldStrokeOpacity, strokeOpacity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Color getStrokeColor() {
        return strokeColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStrokeColor(Color newStrokeColor, NotificationChain msgs) {
        Color oldStrokeColor = strokeColor;
        strokeColor = newStrokeColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__STROKE_COLOR, oldStrokeColor, newStrokeColor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStrokeColor(Color newStrokeColor) {
        if (newStrokeColor != strokeColor) {
            NotificationChain msgs = null;
            if (strokeColor != null)
                msgs = ((InternalEObject)strokeColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DIPackage.STYLE__STROKE_COLOR, null, msgs);
            if (newStrokeColor != null)
                msgs = ((InternalEObject)newStrokeColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DIPackage.STYLE__STROKE_COLOR, null, msgs);
            msgs = basicSetStrokeColor(newStrokeColor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__STROKE_COLOR, newStrokeColor, newStrokeColor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Double> getStrokeDashLength() {
        if (strokeDashLength == null) {
            strokeDashLength = new EDataTypeEList<Double>(Double.class, this, DIPackage.STYLE__STROKE_DASH_LENGTH);
        }
        return strokeDashLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Double getFontSize() {
        return fontSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFontSize(Double newFontSize) {
        Double oldFontSize = fontSize;
        fontSize = newFontSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FONT_SIZE, oldFontSize, fontSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFontName(String newFontName) {
        String oldFontName = fontName;
        fontName = newFontName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FONT_NAME, oldFontName, fontName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Color getFontColor() {
        return fontColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFontColor(Color newFontColor, NotificationChain msgs) {
        Color oldFontColor = fontColor;
        fontColor = newFontColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FONT_COLOR, oldFontColor, newFontColor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFontColor(Color newFontColor) {
        if (newFontColor != fontColor) {
            NotificationChain msgs = null;
            if (fontColor != null)
                msgs = ((InternalEObject)fontColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DIPackage.STYLE__FONT_COLOR, null, msgs);
            if (newFontColor != null)
                msgs = ((InternalEObject)newFontColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DIPackage.STYLE__FONT_COLOR, null, msgs);
            msgs = basicSetFontColor(newFontColor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FONT_COLOR, newFontColor, newFontColor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getFontItalic() {
        return fontItalic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFontItalic(Boolean newFontItalic) {
        Boolean oldFontItalic = fontItalic;
        fontItalic = newFontItalic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FONT_ITALIC, oldFontItalic, fontItalic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getFontBold() {
        return fontBold;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFontBold(Boolean newFontBold) {
        Boolean oldFontBold = fontBold;
        fontBold = newFontBold;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FONT_BOLD, oldFontBold, fontBold));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getFontUnderline() {
        return fontUnderline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFontUnderline(Boolean newFontUnderline) {
        Boolean oldFontUnderline = fontUnderline;
        fontUnderline = newFontUnderline;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FONT_UNDERLINE, oldFontUnderline, fontUnderline));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getFontStrikeThrough() {
        return fontStrikeThrough;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFontStrikeThrough(Boolean newFontStrikeThrough) {
        Boolean oldFontStrikeThrough = fontStrikeThrough;
        fontStrikeThrough = newFontStrikeThrough;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.STYLE__FONT_STRIKE_THROUGH, oldFontStrikeThrough, fontStrikeThrough));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean valid_font_size(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         DIValidator.DIAGNOSTIC_SOURCE,
                         DIValidator.STYLE__VALID_FONT_SIZE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_font_size", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean valid_fill_opacity(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         DIValidator.DIAGNOSTIC_SOURCE,
                         DIValidator.STYLE__VALID_FILL_OPACITY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_fill_opacity", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean valid_stroke_width(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         DIValidator.DIAGNOSTIC_SOURCE,
                         DIValidator.STYLE__VALID_STROKE_WIDTH,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_stroke_width", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean valid_dash_length_size(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         DIValidator.DIAGNOSTIC_SOURCE,
                         DIValidator.STYLE__VALID_DASH_LENGTH_SIZE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_dash_length_size", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean valid_stroke_opacity(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         DIValidator.DIAGNOSTIC_SOURCE,
                         DIValidator.STYLE__VALID_STROKE_OPACITY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valid_stroke_opacity", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DIPackage.STYLE__FILL_COLOR:
                return basicSetFillColor(null, msgs);
            case DIPackage.STYLE__STROKE_COLOR:
                return basicSetStrokeColor(null, msgs);
            case DIPackage.STYLE__FONT_COLOR:
                return basicSetFontColor(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DIPackage.STYLE__FILL:
                if (resolve) return getFill();
                return basicGetFill();
            case DIPackage.STYLE__FILL_COLOR:
                return getFillColor();
            case DIPackage.STYLE__FILL_OPACITY:
                return getFillOpacity();
            case DIPackage.STYLE__STROKE_WIDTH:
                return getStrokeWidth();
            case DIPackage.STYLE__STROKE_OPACITY:
                return getStrokeOpacity();
            case DIPackage.STYLE__STROKE_COLOR:
                return getStrokeColor();
            case DIPackage.STYLE__STROKE_DASH_LENGTH:
                return getStrokeDashLength();
            case DIPackage.STYLE__FONT_SIZE:
                return getFontSize();
            case DIPackage.STYLE__FONT_NAME:
                return getFontName();
            case DIPackage.STYLE__FONT_COLOR:
                return getFontColor();
            case DIPackage.STYLE__FONT_ITALIC:
                return getFontItalic();
            case DIPackage.STYLE__FONT_BOLD:
                return getFontBold();
            case DIPackage.STYLE__FONT_UNDERLINE:
                return getFontUnderline();
            case DIPackage.STYLE__FONT_STRIKE_THROUGH:
                return getFontStrikeThrough();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DIPackage.STYLE__FILL:
                setFill((Fill)newValue);
                return;
            case DIPackage.STYLE__FILL_COLOR:
                setFillColor((Color)newValue);
                return;
            case DIPackage.STYLE__FILL_OPACITY:
                setFillOpacity((Double)newValue);
                return;
            case DIPackage.STYLE__STROKE_WIDTH:
                setStrokeWidth((Double)newValue);
                return;
            case DIPackage.STYLE__STROKE_OPACITY:
                setStrokeOpacity((Double)newValue);
                return;
            case DIPackage.STYLE__STROKE_COLOR:
                setStrokeColor((Color)newValue);
                return;
            case DIPackage.STYLE__STROKE_DASH_LENGTH:
                getStrokeDashLength().clear();
                getStrokeDashLength().addAll((Collection<? extends Double>)newValue);
                return;
            case DIPackage.STYLE__FONT_SIZE:
                setFontSize((Double)newValue);
                return;
            case DIPackage.STYLE__FONT_NAME:
                setFontName((String)newValue);
                return;
            case DIPackage.STYLE__FONT_COLOR:
                setFontColor((Color)newValue);
                return;
            case DIPackage.STYLE__FONT_ITALIC:
                setFontItalic((Boolean)newValue);
                return;
            case DIPackage.STYLE__FONT_BOLD:
                setFontBold((Boolean)newValue);
                return;
            case DIPackage.STYLE__FONT_UNDERLINE:
                setFontUnderline((Boolean)newValue);
                return;
            case DIPackage.STYLE__FONT_STRIKE_THROUGH:
                setFontStrikeThrough((Boolean)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case DIPackage.STYLE__FILL:
                setFill((Fill)null);
                return;
            case DIPackage.STYLE__FILL_COLOR:
                setFillColor((Color)null);
                return;
            case DIPackage.STYLE__FILL_OPACITY:
                setFillOpacity(FILL_OPACITY_EDEFAULT);
                return;
            case DIPackage.STYLE__STROKE_WIDTH:
                setStrokeWidth(STROKE_WIDTH_EDEFAULT);
                return;
            case DIPackage.STYLE__STROKE_OPACITY:
                setStrokeOpacity(STROKE_OPACITY_EDEFAULT);
                return;
            case DIPackage.STYLE__STROKE_COLOR:
                setStrokeColor((Color)null);
                return;
            case DIPackage.STYLE__STROKE_DASH_LENGTH:
                getStrokeDashLength().clear();
                return;
            case DIPackage.STYLE__FONT_SIZE:
                setFontSize(FONT_SIZE_EDEFAULT);
                return;
            case DIPackage.STYLE__FONT_NAME:
                setFontName(FONT_NAME_EDEFAULT);
                return;
            case DIPackage.STYLE__FONT_COLOR:
                setFontColor((Color)null);
                return;
            case DIPackage.STYLE__FONT_ITALIC:
                setFontItalic(FONT_ITALIC_EDEFAULT);
                return;
            case DIPackage.STYLE__FONT_BOLD:
                setFontBold(FONT_BOLD_EDEFAULT);
                return;
            case DIPackage.STYLE__FONT_UNDERLINE:
                setFontUnderline(FONT_UNDERLINE_EDEFAULT);
                return;
            case DIPackage.STYLE__FONT_STRIKE_THROUGH:
                setFontStrikeThrough(FONT_STRIKE_THROUGH_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DIPackage.STYLE__FILL:
                return fill != null;
            case DIPackage.STYLE__FILL_COLOR:
                return fillColor != null;
            case DIPackage.STYLE__FILL_OPACITY:
                return FILL_OPACITY_EDEFAULT == null ? fillOpacity != null : !FILL_OPACITY_EDEFAULT.equals(fillOpacity);
            case DIPackage.STYLE__STROKE_WIDTH:
                return STROKE_WIDTH_EDEFAULT == null ? strokeWidth != null : !STROKE_WIDTH_EDEFAULT.equals(strokeWidth);
            case DIPackage.STYLE__STROKE_OPACITY:
                return STROKE_OPACITY_EDEFAULT == null ? strokeOpacity != null : !STROKE_OPACITY_EDEFAULT.equals(strokeOpacity);
            case DIPackage.STYLE__STROKE_COLOR:
                return strokeColor != null;
            case DIPackage.STYLE__STROKE_DASH_LENGTH:
                return strokeDashLength != null && !strokeDashLength.isEmpty();
            case DIPackage.STYLE__FONT_SIZE:
                return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
            case DIPackage.STYLE__FONT_NAME:
                return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
            case DIPackage.STYLE__FONT_COLOR:
                return fontColor != null;
            case DIPackage.STYLE__FONT_ITALIC:
                return FONT_ITALIC_EDEFAULT == null ? fontItalic != null : !FONT_ITALIC_EDEFAULT.equals(fontItalic);
            case DIPackage.STYLE__FONT_BOLD:
                return FONT_BOLD_EDEFAULT == null ? fontBold != null : !FONT_BOLD_EDEFAULT.equals(fontBold);
            case DIPackage.STYLE__FONT_UNDERLINE:
                return FONT_UNDERLINE_EDEFAULT == null ? fontUnderline != null : !FONT_UNDERLINE_EDEFAULT.equals(fontUnderline);
            case DIPackage.STYLE__FONT_STRIKE_THROUGH:
                return FONT_STRIKE_THROUGH_EDEFAULT == null ? fontStrikeThrough != null : !FONT_STRIKE_THROUGH_EDEFAULT.equals(fontStrikeThrough);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case DIPackage.STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP:
                return valid_font_size((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case DIPackage.STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP:
                return valid_fill_opacity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case DIPackage.STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP:
                return valid_stroke_width((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case DIPackage.STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP:
                return valid_dash_length_size((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case DIPackage.STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP:
                return valid_stroke_opacity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (fillOpacity: ");
        result.append(fillOpacity);
        result.append(", strokeWidth: ");
        result.append(strokeWidth);
        result.append(", strokeOpacity: ");
        result.append(strokeOpacity);
        result.append(", strokeDashLength: ");
        result.append(strokeDashLength);
        result.append(", fontSize: ");
        result.append(fontSize);
        result.append(", fontName: ");
        result.append(fontName);
        result.append(", fontItalic: ");
        result.append(fontItalic);
        result.append(", fontBold: ");
        result.append(fontBold);
        result.append(", fontUnderline: ");
        result.append(fontUnderline);
        result.append(", fontStrikeThrough: ");
        result.append(fontStrikeThrough);
        result.append(')');
        return result.toString();
    }

} //StyleImpl
