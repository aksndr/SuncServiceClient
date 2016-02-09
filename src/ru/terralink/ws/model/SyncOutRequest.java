
package ru.terralink.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncOutRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncOutRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Item" type="{http://terralink.ru/}ContractOut"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncOutRequest", namespace = "http://schemas.datacontract.org/2004/07/NNxKUDSSyncService", propOrder = {
    "guid",
    "item"
})
public class SyncOutRequest {

    @XmlElement(name = "GUID", required = true, nillable = true)
    protected String guid;
    @XmlElement(name = "Item", required = true, nillable = true)
    protected ContractOut item;

    public SyncOutRequest() {
    }

    public SyncOutRequest(String guid, ContractOut item) {
        this.guid = guid;
        this.item = item;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ContractOut }
     *     
     */
    public ContractOut getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractOut }
     *     
     */
    public void setItem(ContractOut value) {
        this.item = value;
    }

}
