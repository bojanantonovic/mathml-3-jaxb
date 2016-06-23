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
    "piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCs"
})
@XmlRootElement(name = "otherwise")
public class Otherwise {

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
    @XmlElements({
        @XmlElement(name = "piecewise", required = true, type = Piecewise.class),
        @XmlElement(name = "reln", required = true, type = Reln.class),
        @XmlElement(name = "fn", required = true, type = Fn.class),
        @XmlElement(name = "declare", required = true, type = Declare.class),
        @XmlElement(name = "interval", required = true, type = Interval.class),
        @XmlElement(name = "inverse", required = true, type = Inverse.class),
        @XmlElement(name = "ident", required = true, type = Ident.class),
        @XmlElement(name = "domain", required = true, type = Domain.class),
        @XmlElement(name = "codomain", required = true, type = Codomain.class),
        @XmlElement(name = "image", required = true, type = Image.class),
        @XmlElement(name = "ln", required = true, type = Ln.class),
        @XmlElement(name = "log", required = true, type = Log.class),
        @XmlElement(name = "moment", required = true, type = Moment.class),
        @XmlElement(name = "lambda", required = true, type = Lambda.class),
        @XmlElement(name = "compose", required = true, type = Compose.class),
        @XmlElement(name = "quotient", required = true, type = Quotient.class),
        @XmlElement(name = "divide", required = true, type = Divide.class),
        @XmlElement(name = "minus", required = true, type = Minus.class),
        @XmlElement(name = "power", required = true, type = Power.class),
        @XmlElement(name = "rem", required = true, type = Rem.class),
        @XmlElement(name = "root", required = true, type = Root.class),
        @XmlElement(name = "factorial", required = true, type = Factorial.class),
        @XmlElement(name = "abs", required = true, type = Abs.class),
        @XmlElement(name = "conjugate", required = true, type = Conjugate.class),
        @XmlElement(name = "arg", required = true, type = Arg.class),
        @XmlElement(name = "real", required = true, type = Real.class),
        @XmlElement(name = "imaginary", required = true, type = Imaginary.class),
        @XmlElement(name = "floor", required = true, type = Floor.class),
        @XmlElement(name = "ceiling", required = true, type = Ceiling.class),
        @XmlElement(name = "exp", required = true, type = Exp.class),
        @XmlElement(name = "max", required = true, type = Max.class),
        @XmlElement(name = "min", required = true, type = Min.class),
        @XmlElement(name = "plus", required = true, type = Plus.class),
        @XmlElement(name = "times", required = true, type = Times.class),
        @XmlElement(name = "gcd", required = true, type = Gcd.class),
        @XmlElement(name = "lcm", required = true, type = Lcm.class),
        @XmlElement(name = "and", required = true, type = And.class),
        @XmlElement(name = "or", required = true, type = Or.class),
        @XmlElement(name = "xor", required = true, type = Xor.class),
        @XmlElement(name = "not", required = true, type = Not.class),
        @XmlElement(name = "implies", required = true, type = Implies.class),
        @XmlElement(name = "equivalent", required = true, type = Equivalent.class),
        @XmlElement(name = "forall", required = true, type = Forall.class),
        @XmlElement(name = "exists", required = true, type = Exists.class),
        @XmlElement(name = "eq", required = true, type = Eq.class),
        @XmlElement(name = "gt", required = true, type = Gt.class),
        @XmlElement(name = "lt", required = true, type = Lt.class),
        @XmlElement(name = "geq", required = true, type = Geq.class),
        @XmlElement(name = "leq", required = true, type = Leq.class),
        @XmlElement(name = "neq", required = true, type = Neq.class),
        @XmlElement(name = "approx", required = true, type = Approx.class),
        @XmlElement(name = "factorof", required = true, type = Factorof.class),
        @XmlElement(name = "tendsto", required = true, type = Tendsto.class),
        @XmlElement(name = "int", required = true, type = Int.class),
        @XmlElement(name = "diff", required = true, type = Diff.class),
        @XmlElement(name = "partialdiff", required = true, type = Partialdiff.class),
        @XmlElement(name = "divergence", required = true, type = Divergence.class),
        @XmlElement(name = "grad", required = true, type = Grad.class),
        @XmlElement(name = "curl", required = true, type = Curl.class),
        @XmlElement(name = "laplacian", required = true, type = Laplacian.class),
        @XmlElement(name = "set", required = true, type = Set.class),
        @XmlElement(name = "list", required = true, type = org.w3.mathml3.List.class),
        @XmlElement(name = "union", required = true, type = Union.class),
        @XmlElement(name = "intersect", required = true, type = Intersect.class),
        @XmlElement(name = "cartesianproduct", required = true, type = Cartesianproduct.class),
        @XmlElement(name = "in", required = true, type = In.class),
        @XmlElement(name = "notin", required = true, type = Notin.class),
        @XmlElement(name = "notsubset", required = true, type = Notsubset.class),
        @XmlElement(name = "notprsubset", required = true, type = Notprsubset.class),
        @XmlElement(name = "setdiff", required = true, type = Setdiff.class),
        @XmlElement(name = "subset", required = true, type = Subset.class),
        @XmlElement(name = "prsubset", required = true, type = Prsubset.class),
        @XmlElement(name = "card", required = true, type = Card.class),
        @XmlElement(name = "sum", required = true, type = Sum.class),
        @XmlElement(name = "product", required = true, type = Product.class),
        @XmlElement(name = "limit", required = true, type = Limit.class),
        @XmlElement(name = "sin", required = true, type = Sin.class),
        @XmlElement(name = "cos", required = true, type = Cos.class),
        @XmlElement(name = "tan", required = true, type = Tan.class),
        @XmlElement(name = "sec", required = true, type = Sec.class),
        @XmlElement(name = "csc", required = true, type = Csc.class),
        @XmlElement(name = "cot", required = true, type = Cot.class),
        @XmlElement(name = "sinh", required = true, type = Sinh.class),
        @XmlElement(name = "cosh", required = true, type = Cosh.class),
        @XmlElement(name = "tanh", required = true, type = Tanh.class),
        @XmlElement(name = "sech", required = true, type = Sech.class),
        @XmlElement(name = "csch", required = true, type = Csch.class),
        @XmlElement(name = "coth", required = true, type = Coth.class),
        @XmlElement(name = "arcsin", required = true, type = Arcsin.class),
        @XmlElement(name = "arccos", required = true, type = Arccos.class),
        @XmlElement(name = "arctan", required = true, type = Arctan.class),
        @XmlElement(name = "arccosh", required = true, type = Arccosh.class),
        @XmlElement(name = "arccot", required = true, type = Arccot.class),
        @XmlElement(name = "arccoth", required = true, type = Arccoth.class),
        @XmlElement(name = "arccsc", required = true, type = Arccsc.class),
        @XmlElement(name = "arccsch", required = true, type = Arccsch.class),
        @XmlElement(name = "arcsec", required = true, type = Arcsec.class),
        @XmlElement(name = "arcsech", required = true, type = Arcsech.class),
        @XmlElement(name = "arcsinh", required = true, type = Arcsinh.class),
        @XmlElement(name = "arctanh", required = true, type = Arctanh.class),
        @XmlElement(name = "mean", required = true, type = Mean.class),
        @XmlElement(name = "sdev", required = true, type = Sdev.class),
        @XmlElement(name = "variance", required = true, type = Variance.class),
        @XmlElement(name = "median", required = true, type = Median.class),
        @XmlElement(name = "mode", required = true, type = Mode.class),
        @XmlElement(name = "vector", required = true, type = Vector.class),
        @XmlElement(name = "matrix", required = true, type = Matrix.class),
        @XmlElement(name = "matrixrow", required = true, type = Matrixrow.class),
        @XmlElement(name = "determinant", required = true, type = Determinant.class),
        @XmlElement(name = "transpose", required = true, type = Transpose.class),
        @XmlElement(name = "selector", required = true, type = Selector.class),
        @XmlElement(name = "vectorproduct", required = true, type = Vectorproduct.class),
        @XmlElement(name = "scalarproduct", required = true, type = Scalarproduct.class),
        @XmlElement(name = "outerproduct", required = true, type = Outerproduct.class),
        @XmlElement(name = "integers", required = true, type = Integers.class),
        @XmlElement(name = "reals", required = true, type = Reals.class),
        @XmlElement(name = "rationals", required = true, type = Rationals.class),
        @XmlElement(name = "naturalnumbers", required = true, type = Naturalnumbers.class),
        @XmlElement(name = "complexes", required = true, type = Complexes.class),
        @XmlElement(name = "primes", required = true, type = Primes.class),
        @XmlElement(name = "emptyset", required = true, type = Emptyset.class),
        @XmlElement(name = "exponentiale", required = true, type = Exponentiale.class),
        @XmlElement(name = "imaginaryi", required = true, type = Imaginaryi.class),
        @XmlElement(name = "notanumber", required = true, type = Notanumber.class),
        @XmlElement(name = "true", required = true, type = True.class),
        @XmlElement(name = "false", required = true, type = False.class),
        @XmlElement(name = "pi", required = true, type = Pi.class),
        @XmlElement(name = "eulergamma", required = true, type = Eulergamma.class),
        @XmlElement(name = "infinity", required = true, type = Infinity.class),
        @XmlElement(name = "semantics", required = true, type = Semantics.class),
        @XmlElement(name = "cn", required = true, type = Cn.class),
        @XmlElement(name = "ci", required = true, type = Ci.class),
        @XmlElement(name = "csymbol", required = true, type = Csymbol.class),
        @XmlElement(name = "apply", required = true, type = Apply.class),
        @XmlElement(name = "bind", required = true, type = Bind.class),
        @XmlElement(name = "share", required = true, type = Share.class),
        @XmlElement(name = "cerror", required = true, type = Cerror.class),
        @XmlElement(name = "cbytes", required = true, type = Cbytes.class),
        @XmlElement(name = "cs", required = true, type = Cs.class)
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
