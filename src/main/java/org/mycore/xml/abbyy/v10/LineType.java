//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.18 at 01:41:32 PM CEST 
//


package org.mycore.xml.abbyy.v10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formatting" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}FormattingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="baseline" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="l" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="t" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="r" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="b" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineType", propOrder = {
    "formatting"
})
public class LineType {

    protected List<FormattingType> formatting;
    @XmlAttribute(name = "baseline", required = true)
    protected BigInteger baseline;
    @XmlAttribute(name = "l", required = true)
    protected BigInteger l;
    @XmlAttribute(name = "t", required = true)
    protected BigInteger t;
    @XmlAttribute(name = "r", required = true)
    protected BigInteger r;
    @XmlAttribute(name = "b", required = true)
    protected BigInteger b;

    /**
     * Gets the value of the formatting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattingType }
     * 
     * 
     */
    public List<FormattingType> getFormatting() {
        if (formatting == null) {
            formatting = new ArrayList<FormattingType>();
        }
        return this.formatting;
    }

    /**
     * Gets the value of the baseline property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaseline() {
        return baseline;
    }

    /**
     * Sets the value of the baseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaseline(BigInteger value) {
        this.baseline = value;
    }

    /**
     * Gets the value of the l property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setL(BigInteger value) {
        this.l = value;
    }

    /**
     * Gets the value of the t property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setT(BigInteger value) {
        this.t = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setR(BigInteger value) {
        this.r = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setB(BigInteger value) {
        this.b = value;
    }

}
