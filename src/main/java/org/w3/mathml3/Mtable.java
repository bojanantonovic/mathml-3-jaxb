//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.23 um 03:11:44 PM CEST 
//


package org.w3.mathml3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mtrOrMlabeledtr"
})
@XmlRootElement(name = "mtable")
public class Mtable {

    @XmlAttribute(name = "xmlns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlns;
    @XmlAttribute(name = "xmlns:xlink")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsXlink;
    @XmlAttribute(name = "xmlns:xsi")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsXsi;
    @XmlAttribute(name = "xlink:href")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xlinkHref;
    @XmlAttribute(name = "xlink:type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xlinkType;
    @XmlAttribute(name = "xml:lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlLang;
    @XmlAttribute(name = "xml:space")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xmlSpace;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "xref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xref;
    @XmlAttribute(name = "class")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clazz;
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String style;
    @XmlAttribute(name = "href")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String href;
    @XmlAttribute(name = "other")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String other;
    @XmlAttribute(name = "mathcolor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mathcolor;
    @XmlAttribute(name = "mathbackground")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mathbackground;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "rowalign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowalign;
    @XmlAttribute(name = "columnalign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnalign;
    @XmlAttribute(name = "groupalign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String groupalign;
    @XmlAttribute(name = "alignmentscope")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alignmentscope;
    @XmlAttribute(name = "columnwidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnwidth;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "rowspacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowspacing;
    @XmlAttribute(name = "columnspacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnspacing;
    @XmlAttribute(name = "rowlines")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowlines;
    @XmlAttribute(name = "columnlines")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnlines;
    @XmlAttribute(name = "frame")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String frame;
    @XmlAttribute(name = "framespacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String framespacing;
    @XmlAttribute(name = "equalrows")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equalrows;
    @XmlAttribute(name = "equalcolumns")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equalcolumns;
    @XmlAttribute(name = "displaystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String displaystyle;
    @XmlAttribute(name = "side")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String side;
    @XmlAttribute(name = "minlabelspacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String minlabelspacing;
    @XmlElements({
        @XmlElement(name = "mtr", type = Mtr.class),
        @XmlElement(name = "mlabeledtr", type = Mlabeledtr.class)
    })
    protected List<Object> mtrOrMlabeledtr;

    /**
     * Ruft den Wert der xmlns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlns() {
        if (xmlns == null) {
            return "http://www.w3.org/1998/Math/MathML";
        } else {
            return xmlns;
        }
    }

    /**
     * Legt den Wert der xmlns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlns(String value) {
        this.xmlns = value;
    }

    /**
     * Ruft den Wert der xmlnsXlink-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsXlink() {
        if (xmlnsXlink == null) {
            return "http://www.w3.org/1999/xlink";
        } else {
            return xmlnsXlink;
        }
    }

    /**
     * Legt den Wert der xmlnsXlink-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsXlink(String value) {
        this.xmlnsXlink = value;
    }

    /**
     * Ruft den Wert der xmlnsXsi-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    /**
     * Legt den Wert der xmlnsXsi-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsXsi(String value) {
        this.xmlnsXsi = value;
    }

    /**
     * Ruft den Wert der xlinkHref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkHref() {
        return xlinkHref;
    }

    /**
     * Legt den Wert der xlinkHref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkHref(String value) {
        this.xlinkHref = value;
    }

    /**
     * Ruft den Wert der xlinkType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkType() {
        return xlinkType;
    }

    /**
     * Legt den Wert der xlinkType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkType(String value) {
        this.xlinkType = value;
    }

    /**
     * Ruft den Wert der xmlLang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Legt den Wert der xmlLang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Ruft den Wert der xmlSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlSpace() {
        return xmlSpace;
    }

    /**
     * Legt den Wert der xmlSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlSpace(String value) {
        this.xmlSpace = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der xref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXref() {
        return xref;
    }

    /**
     * Legt den Wert der xref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXref(String value) {
        this.xref = value;
    }

    /**
     * Ruft den Wert der clazz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Legt den Wert der clazz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Ruft den Wert der style-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Ruft den Wert der other-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Legt den Wert der other-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Ruft den Wert der mathcolor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMathcolor() {
        return mathcolor;
    }

    /**
     * Legt den Wert der mathcolor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMathcolor(String value) {
        this.mathcolor = value;
    }

    /**
     * Ruft den Wert der mathbackground-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMathbackground() {
        return mathbackground;
    }

    /**
     * Legt den Wert der mathbackground-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMathbackground(String value) {
        this.mathbackground = value;
    }

    /**
     * Ruft den Wert der align-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Legt den Wert der align-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Ruft den Wert der rowalign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowalign() {
        return rowalign;
    }

    /**
     * Legt den Wert der rowalign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowalign(String value) {
        this.rowalign = value;
    }

    /**
     * Ruft den Wert der columnalign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnalign() {
        return columnalign;
    }

    /**
     * Legt den Wert der columnalign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnalign(String value) {
        this.columnalign = value;
    }

    /**
     * Ruft den Wert der groupalign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupalign() {
        return groupalign;
    }

    /**
     * Legt den Wert der groupalign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupalign(String value) {
        this.groupalign = value;
    }

    /**
     * Ruft den Wert der alignmentscope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignmentscope() {
        return alignmentscope;
    }

    /**
     * Legt den Wert der alignmentscope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignmentscope(String value) {
        this.alignmentscope = value;
    }

    /**
     * Ruft den Wert der columnwidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnwidth() {
        return columnwidth;
    }

    /**
     * Legt den Wert der columnwidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnwidth(String value) {
        this.columnwidth = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der rowspacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspacing() {
        return rowspacing;
    }

    /**
     * Legt den Wert der rowspacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspacing(String value) {
        this.rowspacing = value;
    }

    /**
     * Ruft den Wert der columnspacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnspacing() {
        return columnspacing;
    }

    /**
     * Legt den Wert der columnspacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnspacing(String value) {
        this.columnspacing = value;
    }

    /**
     * Ruft den Wert der rowlines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowlines() {
        return rowlines;
    }

    /**
     * Legt den Wert der rowlines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowlines(String value) {
        this.rowlines = value;
    }

    /**
     * Ruft den Wert der columnlines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnlines() {
        return columnlines;
    }

    /**
     * Legt den Wert der columnlines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnlines(String value) {
        this.columnlines = value;
    }

    /**
     * Ruft den Wert der frame-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Legt den Wert der frame-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Ruft den Wert der framespacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFramespacing() {
        return framespacing;
    }

    /**
     * Legt den Wert der framespacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFramespacing(String value) {
        this.framespacing = value;
    }

    /**
     * Ruft den Wert der equalrows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualrows() {
        return equalrows;
    }

    /**
     * Legt den Wert der equalrows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualrows(String value) {
        this.equalrows = value;
    }

    /**
     * Ruft den Wert der equalcolumns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualcolumns() {
        return equalcolumns;
    }

    /**
     * Legt den Wert der equalcolumns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualcolumns(String value) {
        this.equalcolumns = value;
    }

    /**
     * Ruft den Wert der displaystyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaystyle() {
        return displaystyle;
    }

    /**
     * Legt den Wert der displaystyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaystyle(String value) {
        this.displaystyle = value;
    }

    /**
     * Ruft den Wert der side-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Legt den Wert der side-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Ruft den Wert der minlabelspacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinlabelspacing() {
        return minlabelspacing;
    }

    /**
     * Legt den Wert der minlabelspacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinlabelspacing(String value) {
        this.minlabelspacing = value;
    }

    /**
     * Gets the value of the mtrOrMlabeledtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtrOrMlabeledtr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtrOrMlabeledtr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mtr }
     * {@link Mlabeledtr }
     * 
     * 
     */
    public List<Object> getMtrOrMlabeledtr() {
        if (mtrOrMlabeledtr == null) {
            mtrOrMlabeledtr = new ArrayList<Object>();
        }
        return this.mtrOrMlabeledtr;
    }

}
