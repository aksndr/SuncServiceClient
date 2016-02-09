
package ru.terralink.ws.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://terralink.ru/}Currency" minOccurs="0"/>
 *         &lt;element name="PaymentCurrency" type="{http://terralink.ru/}Currency" minOccurs="0"/>
 *         &lt;element name="PaymentForm" type="{http://terralink.ru/}PaymentForm" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VatRate" type="{http://terralink.ru/}VatRate" minOccurs="0"/>
 *         &lt;element name="VatSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostInfo", propOrder = {
    "comment",
    "currency",
    "paymentCurrency",
    "paymentForm",
    "value",
    "vatRate",
    "vatSum"
})
public class CostInfo {

    @XmlElementRef(name = "Comment", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "Currency", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<Currency> currency;
    @XmlElementRef(name = "PaymentCurrency", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<Currency> paymentCurrency;
    @XmlElementRef(name = "PaymentForm", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<PaymentForm> paymentForm;
    @XmlElementRef(name = "Value", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> value;
    @XmlElementRef(name = "VatRate", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<VatRate> vatRate;
    @XmlElementRef(name = "VatSum", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vatSum;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Currency }{@code >}
     *     
     */
    public JAXBElement<Currency> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Currency }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<Currency> value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Currency }{@code >}
     *     
     */
    public JAXBElement<Currency> getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * Sets the value of the paymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Currency }{@code >}
     *     
     */
    public void setPaymentCurrency(JAXBElement<Currency> value) {
        this.paymentCurrency = value;
    }

    /**
     * Gets the value of the paymentForm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaymentForm }{@code >}
     *     
     */
    public JAXBElement<PaymentForm> getPaymentForm() {
        return paymentForm;
    }

    /**
     * Sets the value of the paymentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaymentForm }{@code >}
     *     
     */
    public void setPaymentForm(JAXBElement<PaymentForm> value) {
        this.paymentForm = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValue(JAXBElement<String> value) {
        this.value = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VatRate }{@code >}
     *     
     */
    public JAXBElement<VatRate> getVatRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VatRate }{@code >}
     *     
     */
    public void setVatRate(JAXBElement<VatRate> value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the vatSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVatSum() {
        return vatSum;
    }

    /**
     * Sets the value of the vatSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVatSum(JAXBElement<String> value) {
        this.vatSum = value;
    }

}
