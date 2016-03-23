
package ru.terralink.ws.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignDepartment" type="{http://terralink.ru/}Department"/>
 *         &lt;element name="Assigner" type="{http://terralink.ru/}Employee"/>
 *         &lt;element name="Company" type="{http://terralink.ru/}BusinessPartner"/>
 *         &lt;element name="ContractCore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContractType" type="{http://terralink.ru/}ContractType"/>
 *         &lt;element name="Contragent" type="{http://terralink.ru/}BusinessPartner"/>
 *         &lt;element name="CostInfo" type="{http://terralink.ru/}CostInfo" minOccurs="0"/>
 *         &lt;element name="CustomerDepartment" type="{http://terralink.ru/}Department" minOccurs="0"/>
 *         &lt;element name="GID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsConf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFullExec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OwnerTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payer" type="{http://terralink.ru/}BusinessPartner"/>
 *         &lt;element name="RegInfo" type="{http://terralink.ru/}RegInfo" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValuationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = {
    "assignDepartment",
    "assigner",
    "company",
    "contractCore",
    "contractType",
    "contragent",
    "costInfo",
    "customerDepartment",
    "gid",
    "inOut",
    "isConf",
    "isFullExec",
    "isTemplate",
    "ownerTransfer",
    "parentGID",
    "payer",
    "regInfo",
    "state",
    "stateCode",
    "subject",
    "valuationCode"
})
public class Contract {

    @XmlElement(name = "AssignDepartment", required = true, nillable = true)
    protected Department assignDepartment;
    @XmlElement(name = "Assigner", required = true, nillable = true)
    protected Employee assigner;
    @XmlElement(name = "Company", required = true, nillable = true)
    protected BusinessPartner company;
    @XmlElement(name = "ContractCore", required = true, nillable = true)
    protected String contractCore;
    @XmlElement(name = "ContractType", required = true, nillable = true)
    protected ContractType contractType;
    @XmlElement(name = "Contragent", required = true, nillable = true)
    protected BusinessPartner contragent;
    @XmlElementRef(name = "CostInfo", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<CostInfo> costInfo;
    @XmlElementRef(name = "CustomerDepartment", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<Department> customerDepartment;
    @XmlElement(name = "GID", required = true, nillable = true)
    protected String gid;
    @XmlElement(name = "InOut", required = true, nillable = true)
    protected String inOut;
    @XmlElementRef(name = "IsConf", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isConf;
    @XmlElementRef(name = "IsFullExec", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isFullExec;
    @XmlElementRef(name = "IsTemplate", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isTemplate;
    @XmlElementRef(name = "OwnerTransfer", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerTransfer;
    @XmlElementRef(name = "ParentGID", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentGID;
    @XmlElement(name = "Payer", required = true, nillable = true)
    protected BusinessPartner payer;
    @XmlElementRef(name = "RegInfo", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegInfo> regInfo;
    @XmlElement(name = "State", required = true, nillable = true)
    protected String state;
    @XmlElementRef(name = "StateCode", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "Subject", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject;
    @XmlElementRef(name = "ValuationCode", namespace = "http://terralink.ru/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valuationCode;

    /**
     * Gets the value of the assignDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getAssignDepartment() {
        return assignDepartment;
    }

    /**
     * Sets the value of the assignDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setAssignDepartment(Department value) {
        this.assignDepartment = value;
    }

    /**
     * Gets the value of the assigner property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getAssigner() {
        return assigner;
    }

    /**
     * Sets the value of the assigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setAssigner(Employee value) {
        this.assigner = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartner }
     *     
     */
    public BusinessPartner getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartner }
     *     
     */
    public void setCompany(BusinessPartner value) {
        this.company = value;
    }

    /**
     * Gets the value of the contractCore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCore() {
        return contractCore;
    }

    /**
     * Sets the value of the contractCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCore(String value) {
        this.contractCore = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContractType(ContractType value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the contragent property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartner }
     *     
     */
    public BusinessPartner getContragent() {
        return contragent;
    }

    /**
     * Sets the value of the contragent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartner }
     *     
     */
    public void setContragent(BusinessPartner value) {
        this.contragent = value;
    }

    /**
     * Gets the value of the costInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CostInfo }{@code >}
     *     
     */
    public JAXBElement<CostInfo> getCostInfo() {
        return costInfo;
    }

    /**
     * Sets the value of the costInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CostInfo }{@code >}
     *     
     */
    public void setCostInfo(JAXBElement<CostInfo> value) {
        this.costInfo = value;
    }

    /**
     * Gets the value of the customerDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Department }{@code >}
     *     
     */
    public JAXBElement<Department> getCustomerDepartment() {
        return customerDepartment;
    }

    /**
     * Sets the value of the customerDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Department }{@code >}
     *     
     */
    public void setCustomerDepartment(JAXBElement<Department> value) {
        this.customerDepartment = value;
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
     * Gets the value of the inOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOut() {
        return inOut;
    }

    /**
     * Sets the value of the inOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOut(String value) {
        this.inOut = value;
    }

    /**
     * Gets the value of the isConf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsConf() {
        return isConf;
    }

    /**
     * Sets the value of the isConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsConf(JAXBElement<Boolean> value) {
        this.isConf = value;
    }

    /**
     * Gets the value of the isFullExec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsFullExec() {
        return isFullExec;
    }

    /**
     * Sets the value of the isFullExec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsFullExec(JAXBElement<Boolean> value) {
        this.isFullExec = value;
    }

    /**
     * Gets the value of the isTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsTemplate() {
        return isTemplate;
    }

    /**
     * Sets the value of the isTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsTemplate(JAXBElement<Boolean> value) {
        this.isTemplate = value;
    }

    /**
     * Gets the value of the ownerTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerTransfer() {
        return ownerTransfer;
    }

    /**
     * Sets the value of the ownerTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerTransfer(JAXBElement<String> value) {
        this.ownerTransfer = value;
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

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartner }
     *     
     */
    public BusinessPartner getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartner }
     *     
     */
    public void setPayer(BusinessPartner value) {
        this.payer = value;
    }

    /**
     * Gets the value of the regInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegInfo }{@code >}
     *     
     */
    public JAXBElement<RegInfo> getRegInfo() {
        return regInfo;
    }

    /**
     * Sets the value of the regInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegInfo }{@code >}
     *     
     */
    public void setRegInfo(JAXBElement<RegInfo> value) {
        this.regInfo = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateCode(JAXBElement<String> value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = value;
    }

    /**
     * Gets the value of the valuationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValuationCode() {
        return valuationCode;
    }

    /**
     * Sets the value of the valuationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValuationCode(JAXBElement<String> value) {
        this.valuationCode = value;
    }

}
