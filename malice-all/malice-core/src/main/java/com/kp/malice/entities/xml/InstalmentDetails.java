//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v3.0-03/04/2009 09:20 AM(valikov)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.28 at 03:24:57 PM CEST 
//


package com.kp.malice.entities.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InstalmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstalmentNumber" type="{http://tempuri.org/ImportDataSet.xsd}InstalmentNumber"/>
 *         &lt;element name="InstalmentDate" type="{http://tempuri.org/ImportDataSet.xsd}Date"/>
 *         &lt;element name="Premium" type="{http://tempuri.org/ImportDataSet.xsd}Money"/>
 *         &lt;element name="Accessori" type="{http://tempuri.org/ImportDataSet.xsd}Money"/>
 *         &lt;element name="Tax" type="{http://tempuri.org/ImportDataSet.xsd}Money"/>
 *         &lt;element name="Gross" type="{http://tempuri.org/ImportDataSet.xsd}Money"/>
 *         &lt;element name="Premium_Commission_Amount" type="{http://tempuri.org/ImportDataSet.xsd}Money"/>
 *         &lt;element name="Accessori_Commission_Amount" type="{http://tempuri.org/ImportDataSet.xsd}Money"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalmentDetails", propOrder = {
    "instalmentNumber",
    "instalmentDate",
    "premium",
    "accessori",
    "tax",
    "gross",
    "premiumCommissionAmount",
    "accessoriCommissionAmount"
})
public class InstalmentDetails {

    @XmlElement(name = "InstalmentNumber")
    protected int instalmentNumber;
    @XmlElement(name = "InstalmentDate", required = true)
    protected XMLGregorianCalendar instalmentDate;
    @XmlElement(name = "Premium", required = true)
    protected BigDecimal premium;
    @XmlElement(name = "Accessori", required = true)
    protected BigDecimal accessori;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "Gross", required = true)
    protected BigDecimal gross;
    @XmlElement(name = "Premium_Commission_Amount", required = true)
    protected BigDecimal premiumCommissionAmount;
    @XmlElement(name = "Accessori_Commission_Amount", required = true)
    protected BigDecimal accessoriCommissionAmount;

    /**
     * Gets the value of the instalmentNumber property.
     * 
     */
    public int getInstalmentNumber() {
        return instalmentNumber;
    }

    /**
     * Sets the value of the instalmentNumber property.
     * 
     */
    public void setInstalmentNumber(int value) {
        this.instalmentNumber = value;
    }

    /**
     * Gets the value of the instalmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstalmentDate() {
        return instalmentDate;
    }

    /**
     * Sets the value of the instalmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstalmentDate(XMLGregorianCalendar value) {
        this.instalmentDate = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremium(BigDecimal value) {
        this.premium = value;
    }

    /**
     * Gets the value of the accessori property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccessori() {
        return accessori;
    }

    /**
     * Sets the value of the accessori property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccessori(BigDecimal value) {
        this.accessori = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the gross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGross() {
        return gross;
    }

    /**
     * Sets the value of the gross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGross(BigDecimal value) {
        this.gross = value;
    }

    /**
     * Gets the value of the premiumCommissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremiumCommissionAmount() {
        return premiumCommissionAmount;
    }

    /**
     * Sets the value of the premiumCommissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremiumCommissionAmount(BigDecimal value) {
        this.premiumCommissionAmount = value;
    }

    /**
     * Gets the value of the accessoriCommissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccessoriCommissionAmount() {
        return accessoriCommissionAmount;
    }

    /**
     * Sets the value of the accessoriCommissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccessoriCommissionAmount(BigDecimal value) {
        this.accessoriCommissionAmount = value;
    }

}
