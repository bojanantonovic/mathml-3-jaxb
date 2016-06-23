//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.23 um 03:11:44 PM CEST 
//


package org.w3.mathml3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "mspace")
public class Mspace {

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
    @XmlAttribute(name = "mathvariant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mathvariant;
    @XmlAttribute(name = "mathsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mathsize;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "fontfamily")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fontfamily;
    @XmlAttribute(name = "fontweight")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontweight;
    @XmlAttribute(name = "fontstyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontstyle;
    @XmlAttribute(name = "fontsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fontsize;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String color;
    @XmlAttribute(name = "background")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String background;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String height;
    @XmlAttribute(name = "depth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String depth;
    @XmlAttribute(name = "linebreak")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String linebreak;
    @XmlAttribute(name = "indentalign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indentalign;
    @XmlAttribute(name = "indentshift")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indentshift;
    @XmlAttribute(name = "indenttarget")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indenttarget;
    @XmlAttribute(name = "indentalignfirst")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indentalignfirst;
    @XmlAttribute(name = "indentshiftfirst")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indentshiftfirst;
    @XmlAttribute(name = "indentalignlast")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indentalignlast;
    @XmlAttribute(name = "indentshiftlast")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indentshiftlast;

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
     * Ruft den Wert der mathvariant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMathvariant() {
        return mathvariant;
    }

    /**
     * Legt den Wert der mathvariant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMathvariant(String value) {
        this.mathvariant = value;
    }

    /**
     * Ruft den Wert der mathsize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMathsize() {
        return mathsize;
    }

    /**
     * Legt den Wert der mathsize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMathsize(String value) {
        this.mathsize = value;
    }

    /**
     * Ruft den Wert der dir-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Legt den Wert der dir-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Ruft den Wert der fontfamily-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontfamily() {
        return fontfamily;
    }

    /**
     * Legt den Wert der fontfamily-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontfamily(String value) {
        this.fontfamily = value;
    }

    /**
     * Ruft den Wert der fontweight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontweight() {
        return fontweight;
    }

    /**
     * Legt den Wert der fontweight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontweight(String value) {
        this.fontweight = value;
    }

    /**
     * Ruft den Wert der fontstyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontstyle() {
        return fontstyle;
    }

    /**
     * Legt den Wert der fontstyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontstyle(String value) {
        this.fontstyle = value;
    }

    /**
     * Ruft den Wert der fontsize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontsize() {
        return fontsize;
    }

    /**
     * Legt den Wert der fontsize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontsize(String value) {
        this.fontsize = value;
    }

    /**
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Ruft den Wert der background-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackground() {
        return background;
    }

    /**
     * Legt den Wert der background-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackground(String value) {
        this.background = value;
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
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der depth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepth() {
        return depth;
    }

    /**
     * Legt den Wert der depth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepth(String value) {
        this.depth = value;
    }

    /**
     * Ruft den Wert der linebreak-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinebreak() {
        return linebreak;
    }

    /**
     * Legt den Wert der linebreak-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinebreak(String value) {
        this.linebreak = value;
    }

    /**
     * Ruft den Wert der indentalign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentalign() {
        return indentalign;
    }

    /**
     * Legt den Wert der indentalign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentalign(String value) {
        this.indentalign = value;
    }

    /**
     * Ruft den Wert der indentshift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentshift() {
        return indentshift;
    }

    /**
     * Legt den Wert der indentshift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentshift(String value) {
        this.indentshift = value;
    }

    /**
     * Ruft den Wert der indenttarget-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndenttarget() {
        return indenttarget;
    }

    /**
     * Legt den Wert der indenttarget-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndenttarget(String value) {
        this.indenttarget = value;
    }

    /**
     * Ruft den Wert der indentalignfirst-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentalignfirst() {
        return indentalignfirst;
    }

    /**
     * Legt den Wert der indentalignfirst-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentalignfirst(String value) {
        this.indentalignfirst = value;
    }

    /**
     * Ruft den Wert der indentshiftfirst-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentshiftfirst() {
        return indentshiftfirst;
    }

    /**
     * Legt den Wert der indentshiftfirst-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentshiftfirst(String value) {
        this.indentshiftfirst = value;
    }

    /**
     * Ruft den Wert der indentalignlast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentalignlast() {
        return indentalignlast;
    }

    /**
     * Legt den Wert der indentalignlast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentalignlast(String value) {
        this.indentalignlast = value;
    }

    /**
     * Ruft den Wert der indentshiftlast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentshiftlast() {
        return indentshiftlast;
    }

    /**
     * Legt den Wert der indentshiftlast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentshiftlast(String value) {
        this.indentshiftlast = value;
    }

}
