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
    "piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCsOrMiOrMnOrMoOrMtextOrMspaceOrMsOrMaligngroupOrMalignmarkOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMencloseOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMstackOrMlongdivOrMaction"
})
@XmlRootElement(name = "mstyle")
public class Mstyle {

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
    @XmlAttribute(name = "scriptlevel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scriptlevel;
    @XmlAttribute(name = "displaystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String displaystyle;
    @XmlAttribute(name = "scriptsizemultiplier")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scriptsizemultiplier;
    @XmlAttribute(name = "scriptminsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scriptminsize;
    @XmlAttribute(name = "infixlinebreakstyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String infixlinebreakstyle;
    @XmlAttribute(name = "decimalpoint")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decimalpoint;
    @XmlAttribute(name = "accent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accent;
    @XmlAttribute(name = "accentunder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accentunder;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "alignmentscope")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alignmentscope;
    @XmlAttribute(name = "bevelled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bevelled;
    @XmlAttribute(name = "charalign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String charalign;
    @XmlAttribute(name = "charspacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String charspacing;
    @XmlAttribute(name = "close")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String close;
    @XmlAttribute(name = "columnalign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnalign;
    @XmlAttribute(name = "columnlines")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnlines;
    @XmlAttribute(name = "columnspacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnspacing;
    @XmlAttribute(name = "columnspan")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnspan;
    @XmlAttribute(name = "columnwidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnwidth;
    @XmlAttribute(name = "crossout")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String crossout;
    @XmlAttribute(name = "denomalign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String denomalign;
    @XmlAttribute(name = "depth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String depth;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "edge")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String edge;
    @XmlAttribute(name = "equalcolumns")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equalcolumns;
    @XmlAttribute(name = "equalrows")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equalrows;
    @XmlAttribute(name = "fence")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fence;
    @XmlAttribute(name = "form")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String form;
    @XmlAttribute(name = "frame")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String frame;
    @XmlAttribute(name = "framespacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String framespacing;
    @XmlAttribute(name = "groupalign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String groupalign;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String height;
    @XmlAttribute(name = "indentalign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indentalign;
    @XmlAttribute(name = "indentalignfirst")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indentalignfirst;
    @XmlAttribute(name = "indentalignlast")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indentalignlast;
    @XmlAttribute(name = "indentshift")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indentshift;
    @XmlAttribute(name = "indentshiftfirst")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indentshiftfirst;
    @XmlAttribute(name = "indentshiftlast")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indentshiftlast;
    @XmlAttribute(name = "indenttarget")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String indenttarget;
    @XmlAttribute(name = "largeop")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String largeop;
    @XmlAttribute(name = "leftoverhang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String leftoverhang;
    @XmlAttribute(name = "length")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String length;
    @XmlAttribute(name = "linebreak")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String linebreak;
    @XmlAttribute(name = "linebreakmultchar")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String linebreakmultchar;
    @XmlAttribute(name = "linebreakstyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String linebreakstyle;
    @XmlAttribute(name = "lineleading")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lineleading;
    @XmlAttribute(name = "linethickness")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String linethickness;
    @XmlAttribute(name = "location")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String location;
    @XmlAttribute(name = "longdivstyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String longdivstyle;
    @XmlAttribute(name = "lquote")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lquote;
    @XmlAttribute(name = "lspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lspace;
    @XmlAttribute(name = "mathsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mathsize;
    @XmlAttribute(name = "mathvariant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mathvariant;
    @XmlAttribute(name = "maxsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxsize;
    @XmlAttribute(name = "minlabelspacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String minlabelspacing;
    @XmlAttribute(name = "minsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String minsize;
    @XmlAttribute(name = "movablelimits")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String movablelimits;
    @XmlAttribute(name = "mslinethickness")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mslinethickness;
    @XmlAttribute(name = "notation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String notation;
    @XmlAttribute(name = "numalign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numalign;
    @XmlAttribute(name = "open")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String open;
    @XmlAttribute(name = "position")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String position;
    @XmlAttribute(name = "rightoverhang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rightoverhang;
    @XmlAttribute(name = "rowalign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowalign;
    @XmlAttribute(name = "rowlines")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowlines;
    @XmlAttribute(name = "rowspacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowspacing;
    @XmlAttribute(name = "rowspan")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowspan;
    @XmlAttribute(name = "rquote")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rquote;
    @XmlAttribute(name = "rspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rspace;
    @XmlAttribute(name = "selection")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String selection;
    @XmlAttribute(name = "separator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String separator;
    @XmlAttribute(name = "separators")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String separators;
    @XmlAttribute(name = "shift")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shift;
    @XmlAttribute(name = "side")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String side;
    @XmlAttribute(name = "stackalign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stackalign;
    @XmlAttribute(name = "stretchy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stretchy;
    @XmlAttribute(name = "subscriptshift")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String subscriptshift;
    @XmlAttribute(name = "superscriptshift")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String superscriptshift;
    @XmlAttribute(name = "symmetric")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String symmetric;
    @XmlAttribute(name = "valign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String valign;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
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
    @XmlAttribute(name = "veryverythinmathspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String veryverythinmathspace;
    @XmlAttribute(name = "verythinmathspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String verythinmathspace;
    @XmlAttribute(name = "thinmathspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String thinmathspace;
    @XmlAttribute(name = "mediummathspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mediummathspace;
    @XmlAttribute(name = "thickmathspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String thickmathspace;
    @XmlAttribute(name = "verythickmathspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String verythickmathspace;
    @XmlAttribute(name = "veryverythickmathspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String veryverythickmathspace;
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
        @XmlElement(name = "cs", type = Cs.class),
        @XmlElement(name = "mi", type = Mi.class),
        @XmlElement(name = "mn", type = Mn.class),
        @XmlElement(name = "mo", type = Mo.class),
        @XmlElement(name = "mtext", type = Mtext.class),
        @XmlElement(name = "mspace", type = Mspace.class),
        @XmlElement(name = "ms", type = Ms.class),
        @XmlElement(name = "maligngroup", type = Maligngroup.class),
        @XmlElement(name = "malignmark", type = Malignmark.class),
        @XmlElement(name = "mrow", type = Mrow.class),
        @XmlElement(name = "mfrac", type = Mfrac.class),
        @XmlElement(name = "msqrt", type = Msqrt.class),
        @XmlElement(name = "mroot", type = Mroot.class),
        @XmlElement(name = "mstyle", type = Mstyle.class),
        @XmlElement(name = "merror", type = Merror.class),
        @XmlElement(name = "mpadded", type = Mpadded.class),
        @XmlElement(name = "mphantom", type = Mphantom.class),
        @XmlElement(name = "mfenced", type = Mfenced.class),
        @XmlElement(name = "menclose", type = Menclose.class),
        @XmlElement(name = "msub", type = Msub.class),
        @XmlElement(name = "msup", type = Msup.class),
        @XmlElement(name = "msubsup", type = Msubsup.class),
        @XmlElement(name = "munder", type = Munder.class),
        @XmlElement(name = "mover", type = Mover.class),
        @XmlElement(name = "munderover", type = Munderover.class),
        @XmlElement(name = "mmultiscripts", type = Mmultiscripts.class),
        @XmlElement(name = "mtable", type = Mtable.class),
        @XmlElement(name = "mstack", type = Mstack.class),
        @XmlElement(name = "mlongdiv", type = Mlongdiv.class),
        @XmlElement(name = "maction", type = Maction.class)
    })
    protected java.util.List<Object> piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCsOrMiOrMnOrMoOrMtextOrMspaceOrMsOrMaligngroupOrMalignmarkOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMencloseOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMstackOrMlongdivOrMaction;

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
     * Ruft den Wert der scriptlevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptlevel() {
        return scriptlevel;
    }

    /**
     * Legt den Wert der scriptlevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptlevel(String value) {
        this.scriptlevel = value;
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
     * Ruft den Wert der scriptsizemultiplier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptsizemultiplier() {
        return scriptsizemultiplier;
    }

    /**
     * Legt den Wert der scriptsizemultiplier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptsizemultiplier(String value) {
        this.scriptsizemultiplier = value;
    }

    /**
     * Ruft den Wert der scriptminsize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptminsize() {
        return scriptminsize;
    }

    /**
     * Legt den Wert der scriptminsize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptminsize(String value) {
        this.scriptminsize = value;
    }

    /**
     * Ruft den Wert der infixlinebreakstyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfixlinebreakstyle() {
        return infixlinebreakstyle;
    }

    /**
     * Legt den Wert der infixlinebreakstyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfixlinebreakstyle(String value) {
        this.infixlinebreakstyle = value;
    }

    /**
     * Ruft den Wert der decimalpoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalpoint() {
        return decimalpoint;
    }

    /**
     * Legt den Wert der decimalpoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalpoint(String value) {
        this.decimalpoint = value;
    }

    /**
     * Ruft den Wert der accent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccent() {
        return accent;
    }

    /**
     * Legt den Wert der accent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccent(String value) {
        this.accent = value;
    }

    /**
     * Ruft den Wert der accentunder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccentunder() {
        return accentunder;
    }

    /**
     * Legt den Wert der accentunder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccentunder(String value) {
        this.accentunder = value;
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
     * Ruft den Wert der bevelled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBevelled() {
        return bevelled;
    }

    /**
     * Legt den Wert der bevelled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBevelled(String value) {
        this.bevelled = value;
    }

    /**
     * Ruft den Wert der charalign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharalign() {
        return charalign;
    }

    /**
     * Legt den Wert der charalign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharalign(String value) {
        this.charalign = value;
    }

    /**
     * Ruft den Wert der charspacing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharspacing() {
        return charspacing;
    }

    /**
     * Legt den Wert der charspacing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharspacing(String value) {
        this.charspacing = value;
    }

    /**
     * Ruft den Wert der close-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClose() {
        return close;
    }

    /**
     * Legt den Wert der close-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClose(String value) {
        this.close = value;
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
     * Ruft den Wert der columnspan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnspan() {
        return columnspan;
    }

    /**
     * Legt den Wert der columnspan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnspan(String value) {
        this.columnspan = value;
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
     * Ruft den Wert der crossout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossout() {
        return crossout;
    }

    /**
     * Legt den Wert der crossout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossout(String value) {
        this.crossout = value;
    }

    /**
     * Ruft den Wert der denomalign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomalign() {
        return denomalign;
    }

    /**
     * Legt den Wert der denomalign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomalign(String value) {
        this.denomalign = value;
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
     * Ruft den Wert der edge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdge() {
        return edge;
    }

    /**
     * Legt den Wert der edge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdge(String value) {
        this.edge = value;
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
     * Ruft den Wert der fence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFence() {
        return fence;
    }

    /**
     * Legt den Wert der fence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFence(String value) {
        this.fence = value;
    }

    /**
     * Ruft den Wert der form-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Legt den Wert der form-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
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
     * Ruft den Wert der largeop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeop() {
        return largeop;
    }

    /**
     * Legt den Wert der largeop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeop(String value) {
        this.largeop = value;
    }

    /**
     * Ruft den Wert der leftoverhang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftoverhang() {
        return leftoverhang;
    }

    /**
     * Legt den Wert der leftoverhang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftoverhang(String value) {
        this.leftoverhang = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
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
     * Ruft den Wert der linebreakmultchar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinebreakmultchar() {
        return linebreakmultchar;
    }

    /**
     * Legt den Wert der linebreakmultchar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinebreakmultchar(String value) {
        this.linebreakmultchar = value;
    }

    /**
     * Ruft den Wert der linebreakstyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinebreakstyle() {
        return linebreakstyle;
    }

    /**
     * Legt den Wert der linebreakstyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinebreakstyle(String value) {
        this.linebreakstyle = value;
    }

    /**
     * Ruft den Wert der lineleading-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineleading() {
        return lineleading;
    }

    /**
     * Legt den Wert der lineleading-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineleading(String value) {
        this.lineleading = value;
    }

    /**
     * Ruft den Wert der linethickness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinethickness() {
        return linethickness;
    }

    /**
     * Legt den Wert der linethickness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinethickness(String value) {
        this.linethickness = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der longdivstyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongdivstyle() {
        return longdivstyle;
    }

    /**
     * Legt den Wert der longdivstyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongdivstyle(String value) {
        this.longdivstyle = value;
    }

    /**
     * Ruft den Wert der lquote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLquote() {
        return lquote;
    }

    /**
     * Legt den Wert der lquote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLquote(String value) {
        this.lquote = value;
    }

    /**
     * Ruft den Wert der lspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLspace() {
        return lspace;
    }

    /**
     * Legt den Wert der lspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLspace(String value) {
        this.lspace = value;
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
     * Ruft den Wert der maxsize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxsize() {
        return maxsize;
    }

    /**
     * Legt den Wert der maxsize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxsize(String value) {
        this.maxsize = value;
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
     * Ruft den Wert der minsize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinsize() {
        return minsize;
    }

    /**
     * Legt den Wert der minsize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinsize(String value) {
        this.minsize = value;
    }

    /**
     * Ruft den Wert der movablelimits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovablelimits() {
        return movablelimits;
    }

    /**
     * Legt den Wert der movablelimits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovablelimits(String value) {
        this.movablelimits = value;
    }

    /**
     * Ruft den Wert der mslinethickness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMslinethickness() {
        return mslinethickness;
    }

    /**
     * Legt den Wert der mslinethickness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMslinethickness(String value) {
        this.mslinethickness = value;
    }

    /**
     * Ruft den Wert der notation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotation() {
        return notation;
    }

    /**
     * Legt den Wert der notation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotation(String value) {
        this.notation = value;
    }

    /**
     * Ruft den Wert der numalign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumalign() {
        return numalign;
    }

    /**
     * Legt den Wert der numalign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumalign(String value) {
        this.numalign = value;
    }

    /**
     * Ruft den Wert der open-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpen() {
        return open;
    }

    /**
     * Legt den Wert der open-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpen(String value) {
        this.open = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der rightoverhang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightoverhang() {
        return rightoverhang;
    }

    /**
     * Legt den Wert der rightoverhang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightoverhang(String value) {
        this.rightoverhang = value;
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
     * Ruft den Wert der rowspan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspan() {
        return rowspan;
    }

    /**
     * Legt den Wert der rowspan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspan(String value) {
        this.rowspan = value;
    }

    /**
     * Ruft den Wert der rquote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRquote() {
        return rquote;
    }

    /**
     * Legt den Wert der rquote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRquote(String value) {
        this.rquote = value;
    }

    /**
     * Ruft den Wert der rspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspace() {
        return rspace;
    }

    /**
     * Legt den Wert der rspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspace(String value) {
        this.rspace = value;
    }

    /**
     * Ruft den Wert der selection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelection() {
        return selection;
    }

    /**
     * Legt den Wert der selection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelection(String value) {
        this.selection = value;
    }

    /**
     * Ruft den Wert der separator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * Legt den Wert der separator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparator(String value) {
        this.separator = value;
    }

    /**
     * Ruft den Wert der separators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparators() {
        return separators;
    }

    /**
     * Legt den Wert der separators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparators(String value) {
        this.separators = value;
    }

    /**
     * Ruft den Wert der shift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShift() {
        return shift;
    }

    /**
     * Legt den Wert der shift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShift(String value) {
        this.shift = value;
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
     * Ruft den Wert der stackalign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackalign() {
        return stackalign;
    }

    /**
     * Legt den Wert der stackalign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackalign(String value) {
        this.stackalign = value;
    }

    /**
     * Ruft den Wert der stretchy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStretchy() {
        return stretchy;
    }

    /**
     * Legt den Wert der stretchy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStretchy(String value) {
        this.stretchy = value;
    }

    /**
     * Ruft den Wert der subscriptshift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptshift() {
        return subscriptshift;
    }

    /**
     * Legt den Wert der subscriptshift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptshift(String value) {
        this.subscriptshift = value;
    }

    /**
     * Ruft den Wert der superscriptshift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperscriptshift() {
        return superscriptshift;
    }

    /**
     * Legt den Wert der superscriptshift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperscriptshift(String value) {
        this.superscriptshift = value;
    }

    /**
     * Ruft den Wert der symmetric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymmetric() {
        return symmetric;
    }

    /**
     * Legt den Wert der symmetric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymmetric(String value) {
        this.symmetric = value;
    }

    /**
     * Ruft den Wert der valign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValign() {
        return valign;
    }

    /**
     * Legt den Wert der valign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValign(String value) {
        this.valign = value;
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
     * Ruft den Wert der veryverythinmathspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeryverythinmathspace() {
        return veryverythinmathspace;
    }

    /**
     * Legt den Wert der veryverythinmathspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeryverythinmathspace(String value) {
        this.veryverythinmathspace = value;
    }

    /**
     * Ruft den Wert der verythinmathspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerythinmathspace() {
        return verythinmathspace;
    }

    /**
     * Legt den Wert der verythinmathspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerythinmathspace(String value) {
        this.verythinmathspace = value;
    }

    /**
     * Ruft den Wert der thinmathspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThinmathspace() {
        return thinmathspace;
    }

    /**
     * Legt den Wert der thinmathspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThinmathspace(String value) {
        this.thinmathspace = value;
    }

    /**
     * Ruft den Wert der mediummathspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediummathspace() {
        return mediummathspace;
    }

    /**
     * Legt den Wert der mediummathspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediummathspace(String value) {
        this.mediummathspace = value;
    }

    /**
     * Ruft den Wert der thickmathspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThickmathspace() {
        return thickmathspace;
    }

    /**
     * Legt den Wert der thickmathspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThickmathspace(String value) {
        this.thickmathspace = value;
    }

    /**
     * Ruft den Wert der verythickmathspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerythickmathspace() {
        return verythickmathspace;
    }

    /**
     * Legt den Wert der verythickmathspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerythickmathspace(String value) {
        this.verythickmathspace = value;
    }

    /**
     * Ruft den Wert der veryverythickmathspace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeryverythickmathspace() {
        return veryverythickmathspace;
    }

    /**
     * Legt den Wert der veryverythickmathspace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeryverythickmathspace(String value) {
        this.veryverythickmathspace = value;
    }

    /**
     * Gets the value of the piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCsOrMiOrMnOrMoOrMtextOrMspaceOrMsOrMaligngroupOrMalignmarkOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMencloseOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMstackOrMlongdivOrMaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCsOrMiOrMnOrMoOrMtextOrMspaceOrMsOrMaligngroupOrMalignmarkOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMencloseOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMstackOrMlongdivOrMaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPiecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCsOrMiOrMnOrMoOrMtextOrMspaceOrMsOrMaligngroupOrMalignmarkOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMencloseOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMstackOrMlongdivOrMaction().add(newItem);
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
     * {@link Mi }
     * {@link Mn }
     * {@link Mo }
     * {@link Mtext }
     * {@link Mspace }
     * {@link Ms }
     * {@link Maligngroup }
     * {@link Malignmark }
     * {@link Mrow }
     * {@link Mfrac }
     * {@link Msqrt }
     * {@link Mroot }
     * {@link Mstyle }
     * {@link Merror }
     * {@link Mpadded }
     * {@link Mphantom }
     * {@link Mfenced }
     * {@link Menclose }
     * {@link Msub }
     * {@link Msup }
     * {@link Msubsup }
     * {@link Munder }
     * {@link Mover }
     * {@link Munderover }
     * {@link Mmultiscripts }
     * {@link Mtable }
     * {@link Mstack }
     * {@link Mlongdiv }
     * {@link Maction }
     * 
     * 
     */
    public java.util.List<Object> getPiecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCsOrMiOrMnOrMoOrMtextOrMspaceOrMsOrMaligngroupOrMalignmarkOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMencloseOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMstackOrMlongdivOrMaction() {
        if (piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCsOrMiOrMnOrMoOrMtextOrMspaceOrMsOrMaligngroupOrMalignmarkOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMencloseOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMstackOrMlongdivOrMaction == null) {
            piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCsOrMiOrMnOrMoOrMtextOrMspaceOrMsOrMaligngroupOrMalignmarkOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMencloseOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMstackOrMlongdivOrMaction = new ArrayList<Object>();
        }
        return this.piecewiseOrRelnOrFnOrDeclareOrIntervalOrInverseOrIdentOrDomainOrCodomainOrImageOrLnOrLogOrMomentOrLambdaOrComposeOrQuotientOrDivideOrMinusOrPowerOrRemOrRootOrFactorialOrAbsOrConjugateOrArgOrRealOrImaginaryOrFloorOrCeilingOrExpOrMaxOrMinOrPlusOrTimesOrGcdOrLcmOrAndOrOrOrXorOrNotOrImpliesOrEquivalentOrForallOrExistsOrEqOrGtOrLtOrGeqOrLeqOrNeqOrApproxOrFactorofOrTendstoOrIntOrDiffOrPartialdiffOrDivergenceOrGradOrCurlOrLaplacianOrSetOrListOrUnionOrIntersectOrCartesianproductOrInOrNotinOrNotsubsetOrNotprsubsetOrSetdiffOrSubsetOrPrsubsetOrCardOrSumOrProductOrLimitOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrArccoshOrArccotOrArccothOrArccscOrArccschOrArcsecOrArcsechOrArcsinhOrArctanhOrMeanOrSdevOrVarianceOrMedianOrModeOrVectorOrMatrixOrMatrixrowOrDeterminantOrTransposeOrSelectorOrVectorproductOrScalarproductOrOuterproductOrIntegersOrRealsOrRationalsOrNaturalnumbersOrComplexesOrPrimesOrEmptysetOrExponentialeOrImaginaryiOrNotanumberOrTrueOrFalseOrPiOrEulergammaOrInfinityOrSemanticsOrCnOrCiOrCsymbolOrApplyOrBindOrShareOrCerrorOrCbytesOrCsOrMiOrMnOrMoOrMtextOrMspaceOrMsOrMaligngroupOrMalignmarkOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMencloseOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMstackOrMlongdivOrMaction;
    }

}
