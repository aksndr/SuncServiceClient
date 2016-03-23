
package ru.terralink.ws.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsTerm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParentContractType" type="{http://terralink.ru/}ContractType" minOccurs="0"/>
 *         &lt;element name="ParentGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractType", propOrder = {
    "code",
    "gid",
    "index",
    "isTerm",
    "name",
    "parentContractType",
    "parentGID"
})
public class ContractType {

    @XmlElement(name = "Code", required = true, nillable = true)
    protected String code;
    @XmlElement(name = "GID", required = true, nillable = true)
    protected String gid;
    @XmlElement(name = "Index", required = true, nillable = true)
    protected String index;
    @XmlElement(name = "IsTerm")
    protected boolean isTerm;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElementRef(name = "ParentContractType", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<ContractType> parentContractType;
    @XmlElementRef(name = "ParentGID", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentGID;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the gid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGID() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGID(String value) {
        this.gid = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the isTerm property.
     * 
     */
    public boolean isIsTerm() {
        return isTerm;
    }

    /**
     * Sets the value of the isTerm property.
     * 
     */
    public void setIsTerm(boolean value) {
        this.isTerm = value;
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
     * Gets the value of the parentContractType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContractType }{@code >}
     *     
     */
    public JAXBElement<ContractType> getParentContractType() {
        return parentContractType;
    }

    /**
     * Sets the value of the parentContractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContractType }{@code >}
     *     
     */
    public void setParentContractType(JAXBElement<ContractType> value) {
        this.parentContractType = value;
    }

    /**
     * Gets the value of the parentGID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentGID() {
        return parentGID;
    }

    /**
     * Sets the value of the parentGID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentGID(JAXBElement<String> value) {
        this.parentGID = value;
    }

}
