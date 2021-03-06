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
 * <p>Java class for ParagraphStyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParagraphStyleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fontStyle" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}FontStyleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mainFontStyleId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="role" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="text"/>
 *             &lt;enumeration value="tableText"/>
 *             &lt;enumeration value="heading"/>
 *             &lt;enumeration value="tableHeading"/>
 *             &lt;enumeration value="pictureCaption"/>
 *             &lt;enumeration value="tableCaption"/>
 *             &lt;enumeration value="contents"/>
 *             &lt;enumeration value="footnote"/>
 *             &lt;enumeration value="endnote"/>
 *             &lt;enumeration value="rt"/>
 *             &lt;enumeration value="garb"/>
 *             &lt;enumeration value="other"/>
 *             &lt;enumeration value="barcode"/>
 *             &lt;enumeration value="headingNumber"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="roleLevel" type="{http://www.w3.org/2001/XMLSchema}integer" default="-1" />
 *       &lt;attribute name="align" use="required" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}ParagraphAlignment" />
 *       &lt;attribute name="rtl" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="before" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="after" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="startIndent" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="leftIndent" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="rightIndent" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="lineSpacing" type="{http://www.w3.org/2001/XMLSchema}integer" default="-1" />
 *       &lt;attribute name="lineSpacingRatio" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="fixedLineSpacing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphStyleType", propOrder = {
    "fontStyle"
})
public class ParagraphStyleType {

    protected List<FontStyleType> fontStyle;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "mainFontStyleId", required = true)
    protected String mainFontStyleId;
    @XmlAttribute(name = "role", required = true)
    protected String role;
    @XmlAttribute(name = "roleLevel")
    protected BigInteger roleLevel;
    @XmlAttribute(name = "align", required = true)
    protected ParagraphAlignment align;
    @XmlAttribute(name = "rtl")
    protected Boolean rtl;
    @XmlAttribute(name = "before")
    protected BigInteger before;
    @XmlAttribute(name = "after")
    protected BigInteger after;
    @XmlAttribute(name = "startIndent")
    protected BigInteger startIndent;
    @XmlAttribute(name = "leftIndent")
    protected BigInteger leftIndent;
    @XmlAttribute(name = "rightIndent")
    protected BigInteger rightIndent;
    @XmlAttribute(name = "lineSpacing")
    protected BigInteger lineSpacing;
    @XmlAttribute(name = "lineSpacingRatio")
    protected BigInteger lineSpacingRatio;
    @XmlAttribute(name = "fixedLineSpacing")
    protected Boolean fixedLineSpacing;

    /**
     * Gets the value of the fontStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fontStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFontStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FontStyleType }
     * 
     * 
     */
    public List<FontStyleType> getFontStyle() {
        if (fontStyle == null) {
            fontStyle = new ArrayList<FontStyleType>();
        }
        return this.fontStyle;
    }

    /**
     * Gets the value of the id property.
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
     * Sets the value of the id property.
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the mainFontStyleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainFontStyleId() {
        return mainFontStyleId;
    }

    /**
     * Sets the value of the mainFontStyleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainFontStyleId(String value) {
        this.mainFontStyleId = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the roleLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoleLevel() {
        if (roleLevel == null) {
            return new BigInteger("-1");
        } else {
            return roleLevel;
        }
    }

    /**
     * Sets the value of the roleLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoleLevel(BigInteger value) {
        this.roleLevel = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphAlignment }
     *     
     */
    public ParagraphAlignment getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphAlignment }
     *     
     */
    public void setAlign(ParagraphAlignment value) {
        this.align = value;
    }

    /**
     * Gets the value of the rtl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRtl() {
        if (rtl == null) {
            return false;
        } else {
            return rtl;
        }
    }

    /**
     * Sets the value of the rtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtl(Boolean value) {
        this.rtl = value;
    }

    /**
     * Gets the value of the before property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBefore() {
        if (before == null) {
            return new BigInteger("0");
        } else {
            return before;
        }
    }

    /**
     * Sets the value of the before property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBefore(BigInteger value) {
        this.before = value;
    }

    /**
     * Gets the value of the after property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAfter() {
        if (after == null) {
            return new BigInteger("0");
        } else {
            return after;
        }
    }

    /**
     * Sets the value of the after property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAfter(BigInteger value) {
        this.after = value;
    }

    /**
     * Gets the value of the startIndent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartIndent() {
        if (startIndent == null) {
            return new BigInteger("0");
        } else {
            return startIndent;
        }
    }

    /**
     * Sets the value of the startIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartIndent(BigInteger value) {
        this.startIndent = value;
    }

    /**
     * Gets the value of the leftIndent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeftIndent() {
        if (leftIndent == null) {
            return new BigInteger("0");
        } else {
            return leftIndent;
        }
    }

    /**
     * Sets the value of the leftIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeftIndent(BigInteger value) {
        this.leftIndent = value;
    }

    /**
     * Gets the value of the rightIndent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRightIndent() {
        if (rightIndent == null) {
            return new BigInteger("0");
        } else {
            return rightIndent;
        }
    }

    /**
     * Sets the value of the rightIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRightIndent(BigInteger value) {
        this.rightIndent = value;
    }

    /**
     * Gets the value of the lineSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineSpacing() {
        if (lineSpacing == null) {
            return new BigInteger("-1");
        } else {
            return lineSpacing;
        }
    }

    /**
     * Sets the value of the lineSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineSpacing(BigInteger value) {
        this.lineSpacing = value;
    }

    /**
     * Gets the value of the lineSpacingRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineSpacingRatio() {
        if (lineSpacingRatio == null) {
            return new BigInteger("1");
        } else {
            return lineSpacingRatio;
        }
    }

    /**
     * Sets the value of the lineSpacingRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineSpacingRatio(BigInteger value) {
        this.lineSpacingRatio = value;
    }

    /**
     * Gets the value of the fixedLineSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFixedLineSpacing() {
        if (fixedLineSpacing == null) {
            return true;
        } else {
            return fixedLineSpacing;
        }
    }

    /**
     * Sets the value of the fixedLineSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedLineSpacing(Boolean value) {
        this.fixedLineSpacing = value;
    }

}
