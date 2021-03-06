//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.23 um 03:11:44 PM CEST 
//


package org.w3.mathml3;

import java.util.ArrayList;
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
    "bvar",
    "domainofapplicationOrConditionOrLowlimitOrUplimit",
    "piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs"
})
@XmlRootElement(name = "matrix")
public class Matrix {

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
    @XmlAttribute(name = "encoding")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String encoding;
    @XmlAttribute(name = "definitionURL")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String definitionURL;
    protected java.util.List<Bvar> bvar;
    @XmlElements({
        @XmlElement(name = "domainofapplication", type = Domainofapplication.class),
        @XmlElement(name = "condition", type = Condition.class),
        @XmlElement(name = "lowlimit", type = Lowlimit.class),
        @XmlElement(name = "uplimit", type = Uplimit.class)
    })
    protected java.util.List<Object> domainofapplicationOrConditionOrLowlimitOrUplimit;
    @XmlElements({
        @XmlElement(name = "piecewise", type = Piecewise.class),
        @XmlElement(name = "reln", type = Reln.class),
        @XmlElement(name = "fn", type = Fn.class),
        @XmlElement(name = "declare", type = Declare.class),
        @XmlElement(name = "interval", type = Interval.class),
        @XmlElement(name = "inverse", type = Inverse.class),
        @XmlElement(name = "ident", type = Ident.class),
        @XmlElement(name = "domain", type = Domain.class),
        @XmlElement(name = "codomain", type = Codomain.class),
        @XmlElement(name = "image", type = Image.class),
        @XmlElement(name = "ln", type = Ln.class),
        @XmlElement(name = "log", type = Log.class),
        @XmlElement(name = "moment", type = Moment.class),
        @XmlElement(name = "lambda", type = Lambda.class),
        @XmlElement(name = "compose", type = Compose.class),
        @XmlElement(name = "quotient", type = Quotient.class),
        @XmlElement(name = "divide", type = Divide.class),
        @XmlElement(name = "minus", type = Minus.class),
        @XmlElement(name = "power", type = Power.class),
        @XmlElement(name = "rem", type = Rem.class),
        @XmlElement(name = "root", type = Root.class),
        @XmlElement(name = "factorial", type = Factorial.class),
        @XmlElement(name = "abs", type = Abs.class),
        @XmlElement(name = "conjugate", type = Conjugate.class),
        @XmlElement(name = "arg", type = Arg.class),
        @XmlElement(name = "real", type = Real.class),
        @XmlElement(name = "imaginary", type = Imaginary.class),
        @XmlElement(name = "floor", type = Floor.class),
        @XmlElement(name = "ceiling", type = Ceiling.class),
        @XmlElement(name = "exp", type = Exp.class),
        @XmlElement(name = "max", type = Max.class),
        @XmlElement(name = "min", type = Min.class),
        @XmlElement(name = "plus", type = Plus.class),
        @XmlElement(name = "times", type = Times.class),
        @XmlElement(name = "gcd", type = Gcd.class),
        @XmlElement(name = "lcm", type = Lcm.class),
        @XmlElement(name = "and", type = And.class),
        @XmlElement(name = "or", type = Or.class),
        @XmlElement(name = "xor", type = Xor.class),
        @XmlElement(name = "not", type = Not.class),
        @XmlElement(name = "implies", type = Implies.class),
        @XmlElement(name = "equivalent", type = Equivalent.class),
        @XmlElement(name = "forall", type = Forall.class),
        @XmlElement(name = "exists", type = Exists.class),
        @XmlElement(name = "eq", type = Eq.class),
        @XmlElement(name = "gt", type = Gt.class),
        @XmlElement(name = "lt", type = Lt.class),
        @XmlElement(name = "geq", type = Geq.class),
        @XmlElement(name = "leq", type = Leq.class),
        @XmlElement(name = "neq", type = Neq.class),
        @XmlElement(name = "approx", type = Approx.class),
        @XmlElement(name = "factorof", type = Factorof.class),
        @XmlElement(name = "tendsto", type = Tendsto.class),
        @XmlElement(name = "int", type = Int.class),
        @XmlElement(name = "diff", type = Diff.class),
        @XmlElement(name = "partialdiff", type = Partialdiff.class),
        @XmlElement(name = "divergence", type = Divergence.class),
        @XmlElement(name = "grad", type = Grad.class),
        @XmlElement(name = "curl", type = Curl.class),
        @XmlElement(name = "laplacian", type = Laplacian.class),
        @XmlElement(name = "set", type = Set.class),
        @XmlElement(name = "list", type = org.w3.mathml3.List.class),
        @XmlElement(name = "union", type = Union.class),
        @XmlElement(name = "intersect", type = Intersect.class),
        @XmlElement(name = "cartesianproduct", type = Cartesianproduct.class),
        @XmlElement(name = "in", type = In.class),
        @XmlElement(name = "notin", type = Notin.class),
        @XmlElement(name = "notsubset", type = Notsubset.class),
        @XmlElement(name = "notprsubset", type = Notprsubset.class),
        @XmlElement(name = "setdiff", type = Setdiff.class),
        @XmlElement(name = "subset", type = Subset.class),
        @XmlElement(name = "prsubset", type = Prsubset.class),
        @XmlElement(name = "card", type = Card.class),
        @XmlElement(name = "sum", type = Sum.class),
        @XmlElement(name = "product", type = Product.class),
        @XmlElement(name = "limit", type = Limit.class),
        @XmlElement(name = "sin", type = Sin.class),
        @XmlElement(name = "cos", type = Cos.class),
        @XmlElement(name = "tan", type = Tan.class),
        @XmlElement(name = "sec", type = Sec.class),
        @XmlElement(name = "csc", type = Csc.class),
        @XmlElement(name = "cot", type = Cot.class),
        @XmlElement(name = "sinh", type = Sinh.class),
        @XmlElement(name = "cosh", type = Cosh.class),
        @XmlElement(name = "tanh", type = Tanh.class),
        @XmlElement(name = "sech", type = Sech.class),
        @XmlElement(name = "csch", type = Csch.class),
        @XmlElement(name = "coth", type = Coth.class),
        @XmlElement(name = "arcsin", type = Arcsin.class),
        @XmlElement(name = "arccos", type = Arccos.class),
        @XmlElement(name = "arctan", type = Arctan.class),
        @XmlElement(name = "arccosh", type = Arccosh.class),
        @XmlElement(name = "arccot", type = Arccot.class),
        @XmlElement(name = "arccoth", type = Arccoth.class),
        @XmlElement(name = "arccsc", type = Arccsc.class),
        @XmlElement(name = "arccsch", type = Arccsch.class),
        @XmlElement(name = "arcsec", type = Arcsec.class),
        @XmlElement(name = "arcsech", type = Arcsech.class),
        @XmlElement(name = "arcsinh", type = Arcsinh.class),
        @XmlElement(name = "arctanh", type = Arctanh.class),
        @XmlElement(name = "mean", type = Mean.class),
        @XmlElement(name = "sdev", type = Sdev.class),
        @XmlElement(name = "variance", type = Variance.class),
        @XmlElement(name = "median", type = Median.class),
        @XmlElement(name = "mode", type = Mode.class),
        @XmlElement(name = "vector", type = Vector.class),
        @XmlElement(name = "matrix", type = Matrix.class),
        @XmlElement(name = "matrixrow", type = Matrixrow.class),
        @XmlElement(name = "determinant", type = Determinant.class),
        @XmlElement(name = "transpose", type = Transpose.class),
        @XmlElement(name = "selector", type = Selector.class),
        @XmlElement(name = "vectorproduct", type = Vectorproduct.class),
        @XmlElement(name = "scalarproduct", type = Scalarproduct.class),
        @XmlElement(name = "outerproduct", type = Outerproduct.class),
        @XmlElement(name = "integers", type = Integers.class),
        @XmlElement(name = "reals", type = Reals.class),
        @XmlElement(name = "rationals", type = Rationals.class),
        @XmlElement(name = "naturalnumbers", type = Naturalnumbers.class),
        @XmlElement(name = "complexes", type = Complexes.class),
        @XmlElement(name = "primes", type = Primes.class),
        @XmlElement(name = "emptyset", type = Emptyset.class),
        @XmlElement(name = "exponentiale", type = Exponentiale.class),
        @XmlElement(name = "imaginaryi", type = Imaginaryi.class),
        @XmlElement(name = "notanumber", type = Notanumber.class),
        @XmlElement(name = "true", type = True.class),
        @XmlElement(name = "false", type = False.class),
        @XmlElement(name = "pi", type = Pi.class),
        @XmlElement(name = "eulergamma", type = Eulergamma.class),
        @XmlElement(name = "infinity", type = Infinity.class),
        @XmlElement(name = "semantics", type = Semantics.class),
        @XmlElement(name = "cn", type = Cn.class),
        @XmlElement(name = "ci", type = Ci.class),
        @XmlElement(name = "csymbol", type = Csymbol.class),
        @XmlElement(name = "apply", type = Apply.class),
        @XmlElement(name = "bind", type = Bind.class),
        @XmlElement(name = "share", type = Share.class),
        @XmlElement(name = "cerror", type = Cerror.class),
        @XmlElement(name = "cbytes", type = Cbytes.class),
        @XmlElement(name = "cs", type = Cs.class)
    })
    protected java.util.List<Object> piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs;

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
     * Ruft den Wert der encoding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Legt den Wert der encoding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Ruft den Wert der definitionURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitionURL() {
        return definitionURL;
    }

    /**
     * Legt den Wert der definitionURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitionURL(String value) {
        this.definitionURL = value;
    }

    /**
     * Gets the value of the bvar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bvar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBvar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bvar }
     * 
     * 
     */
    public java.util.List<Bvar> getBvar() {
        if (bvar == null) {
            bvar = new ArrayList<Bvar>();
        }
        return this.bvar;
    }

    /**
     * Gets the value of the domainofapplicationOrConditionOrLowlimitOrUplimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainofapplicationOrConditionOrLowlimitOrUplimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainofapplicationOrConditionOrLowlimitOrUplimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Domainofapplication }
     * {@link Condition }
     * {@link Lowlimit }
     * {@link Uplimit }
     * 
     * 
     */
    public java.util.List<Object> getDomainofapplicationOrConditionOrLowlimitOrUplimit() {
        if (domainofapplicationOrConditionOrLowlimitOrUplimit == null) {
            domainofapplicationOrConditionOrLowlimitOrUplimit = new ArrayList<Object>();
        }
        return this.domainofapplicationOrConditionOrLowlimitOrUplimit;
    }

    /**
     * Gets the value of the piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPiecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Piecewise }
     * {@link Reln }
     * {@link Fn }
     * {@link Declare }
     * {@link Interval }
     * {@link Inverse }
     * {@link Ident }
     * {@link Domain }
     * {@link Codomain }
     * {@link Image }
     * {@link Ln }
     * {@link Log }
     * {@link Moment }
     * {@link Lambda }
     * {@link Compose }
     * {@link Quotient }
     * {@link Divide }
     * {@link Minus }
     * {@link Power }
     * {@link Rem }
     * {@link Root }
     * {@link Factorial }
     * {@link Abs }
     * {@link Conjugate }
     * {@link Arg }
     * {@link Real }
     * {@link Imaginary }
     * {@link Floor }
     * {@link Ceiling }
     * {@link Exp }
     * {@link Max }
     * {@link Min }
     * {@link Plus }
     * {@link Times }
     * {@link Gcd }
     * {@link Lcm }
     * {@link And }
     * {@link Or }
     * {@link Xor }
     * {@link Not }
     * {@link Implies }
     * {@link Equivalent }
     * {@link Forall }
     * {@link Exists }
     * {@link Eq }
     * {@link Gt }
     * {@link Lt }
     * {@link Geq }
     * {@link Leq }
     * {@link Neq }
     * {@link Approx }
     * {@link Factorof }
     * {@link Tendsto }
     * {@link Int }
     * {@link Diff }
     * {@link Partialdiff }
     * {@link Divergence }
     * {@link Grad }
     * {@link Curl }
     * {@link Laplacian }
     * {@link Set }
     * {@link org.w3.mathml3.List }
     * {@link Union }
     * {@link Intersect }
     * {@link Cartesianproduct }
     * {@link In }
     * {@link Notin }
     * {@link Notsubset }
     * {@link Notprsubset }
     * {@link Setdiff }
     * {@link Subset }
     * {@link Prsubset }
     * {@link Card }
     * {@link Sum }
     * {@link Product }
     * {@link Limit }
     * {@link Sin }
     * {@link Cos }
     * {@link Tan }
     * {@link Sec }
     * {@link Csc }
     * {@link Cot }
     * {@link Sinh }
     * {@link Cosh }
     * {@link Tanh }
     * {@link Sech }
     * {@link Csch }
     * {@link Coth }
     * {@link Arcsin }
     * {@link Arccos }
     * {@link Arctan }
     * {@link Arccosh }
     * {@link Arccot }
     * {@link Arccoth }
     * {@link Arccsc }
     * {@link Arccsch }
     * {@link Arcsec }
     * {@link Arcsech }
     * {@link Arcsinh }
     * {@link Arctanh }
     * {@link Mean }
     * {@link Sdev }
     * {@link Variance }
     * {@link Median }
     * {@link Mode }
     * {@link Vector }
     * {@link Matrix }
     * {@link Matrixrow }
     * {@link Determinant }
     * {@link Transpose }
     * {@link Selector }
     * {@link Vectorproduct }
     * {@link Scalarproduct }
     * {@link Outerproduct }
     * {@link Integers }
     * {@link Reals }
     * {@link Rationals }
     * {@link Naturalnumbers }
     * {@link Complexes }
     * {@link Primes }
     * {@link Emptyset }
     * {@link Exponentiale }
     * {@link Imaginaryi }
     * {@link Notanumber }
     * {@link True }
     * {@link False }
     * {@link Pi }
     * {@link Eulergamma }
     * {@link Infinity }
     * {@link Semantics }
     * {@link Cn }
     * {@link Ci }
     * {@link Csymbol }
     * {@link Apply }
     * {@link Bind }
     * {@link Share }
     * {@link Cerror }
     * {@link Cbytes }
     * {@link Cs }
     * 
     * 
     */
    public java.util.List<Object> getPiecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs() {
        if (piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs == null) {
            piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs = new ArrayList<Object>();
        }
        return this.piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs;
    }

}
