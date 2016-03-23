
package ru.terralink.ws.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.terralink.ws.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _RegInfo_QNAME = new QName("http://terralink.ru/", "RegInfo");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _CostInfo_QNAME = new QName("http://terralink.ru/", "CostInfo");
    private final static QName _ContractOut_QNAME = new QName("http://terralink.ru/", "ContractOut");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _VatRate_QNAME = new QName("http://terralink.ru/", "VatRate");
    private final static QName _Employee_QNAME = new QName("http://terralink.ru/", "Employee");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Contract_QNAME = new QName("http://terralink.ru/", "Contract");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _BusinessPartner_QNAME = new QName("http://terralink.ru/", "BusinessPartner");
    private final static QName _Currency_QNAME = new QName("http://terralink.ru/", "Currency");
    private final static QName _Department_QNAME = new QName("http://terralink.ru/", "Department");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ContractType_QNAME = new QName("http://terralink.ru/", "ContractType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _SyncRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NNxKUDSSyncService", "SyncRequest");
    private final static QName _SyncOutRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/NNxKUDSSyncService", "SyncOutRequest");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _PaymentForm_QNAME = new QName("http://terralink.ru/", "PaymentForm");
    private final static QName _SyncOutContractDataRequest_QNAME = new QName("http://tempuri.org/", "request");
    private final static QName _CostInfoVatSum_QNAME = new QName("http://terralink.ru/", "VatSum");
    private final static QName _CostInfoPaymentCurrency_QNAME = new QName("http://terralink.ru/", "PaymentCurrency");
    private final static QName _CostInfoValue_QNAME = new QName("http://terralink.ru/", "Value");
    private final static QName _CostInfoComment_QNAME = new QName("http://terralink.ru/", "Comment");
    private final static QName _ContractTypeParentGID_QNAME = new QName("http://terralink.ru/", "ParentGID");
    private final static QName _ContractTypeParentContractType_QNAME = new QName("http://terralink.ru/", "ParentContractType");
    private final static QName _BusinessPartnerINN_QNAME = new QName("http://terralink.ru/", "INN");
    private final static QName _ContractOutRegDate_QNAME = new QName("http://terralink.ru/", "RegDate");
    private final static QName _ContractOutGeneralNum_QNAME = new QName("http://terralink.ru/", "GeneralNum");
    private final static QName _ContractOutState_QNAME = new QName("http://terralink.ru/", "State");
    private final static QName _ContractOutStartDate_QNAME = new QName("http://terralink.ru/", "StartDate");
    private final static QName _ContractOutRegNum_QNAME = new QName("http://terralink.ru/", "RegNum");
    private final static QName _ContractOutEndDate_QNAME = new QName("http://terralink.ru/", "EndDate");
    private final static QName _ContractOutOuterNum_QNAME = new QName("http://terralink.ru/", "OuterNum");
    private final static QName _ContractOutURL_QNAME = new QName("http://terralink.ru/", "URL");
    private final static QName _RegInfoProjectNum_QNAME = new QName("http://terralink.ru/", "ProjectNum");
    private final static QName _ContractOwnerTransfer_QNAME = new QName("http://terralink.ru/", "OwnerTransfer");
    private final static QName _ContractIsTemplate_QNAME = new QName("http://terralink.ru/", "IsTemplate");
    private final static QName _ContractSubject_QNAME = new QName("http://terralink.ru/", "Subject");
    private final static QName _ContractStateCode_QNAME = new QName("http://terralink.ru/", "StateCode");
    private final static QName _ContractIsFullExec_QNAME = new QName("http://terralink.ru/", "IsFullExec");
    private final static QName _ContractIsConf_QNAME = new QName("http://terralink.ru/", "IsConf");
    private final static QName _ContractCustomerDepartment_QNAME = new QName("http://terralink.ru/", "CustomerDepartment");
    private final static QName _ContractValuationCode_QNAME = new QName("http://terralink.ru/", "ValuationCode");
    private final static QName _EmployeeMail_QNAME = new QName("http://terralink.ru/", "Mail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.terralink.ws.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SyncOutRequest }
     * 
     */
    public SyncOutRequest createSyncOutRequest() {
        return new SyncOutRequest();
    }

    /**
     * Create an instance of {@link SyncRequest }
     * 
     */
    public SyncRequest createSyncRequest() {
        return new SyncRequest();
    }

    /**
     * Create an instance of {@link RegInfo }
     * 
     */
    public RegInfo createRegInfo() {
        return new RegInfo();
    }

    /**
     * Create an instance of {@link VatRate }
     * 
     */
    public VatRate createVatRate() {
        return new VatRate();
    }

    /**
     * Create an instance of {@link ContractType }
     * 
     */
    public ContractType createContractType() {
        return new ContractType();
    }

    /**
     * Create an instance of {@link PaymentForm }
     * 
     */
    public PaymentForm createPaymentForm() {
        return new PaymentForm();
    }

    /**
     * Create an instance of {@link Department }
     * 
     */
    public Department createDepartment() {
        return new Department();
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link ContractOut }
     * 
     */
    public ContractOut createContractOut() {
        return new ContractOut();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link CostInfo }
     * 
     */
    public CostInfo createCostInfo() {
        return new CostInfo();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link BusinessPartner }
     * 
     */
    public BusinessPartner createBusinessPartner() {
        return new BusinessPartner();
    }

    /**
     * Create an instance of {@link SyncOutContractURLResponse }
     * 
     */
    public SyncOutContractURLResponse createSyncOutContractURLResponse() {
        return new SyncOutContractURLResponse();
    }

    /**
     * Create an instance of {@link SyncOutContractDataResponse }
     * 
     */
    public SyncOutContractDataResponse createSyncOutContractDataResponse() {
        return new SyncOutContractDataResponse();
    }

    /**
     * Create an instance of {@link SyncOutContractData }
     * 
     */
    public SyncOutContractData createSyncOutContractData() {
        return new SyncOutContractData();
    }

    /**
     * Create an instance of {@link SyncContractResponse }
     * 
     */
    public SyncContractResponse createSyncContractResponse() {
        return new SyncContractResponse();
    }

    /**
     * Create an instance of {@link SyncOutContractURL }
     * 
     */
    public SyncOutContractURL createSyncOutContractURL() {
        return new SyncOutContractURL();
    }

    /**
     * Create an instance of {@link SyncContract }
     * 
     */
    public SyncContract createSyncContract() {
        return new SyncContract();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "RegInfo")
    public JAXBElement<RegInfo> createRegInfo(RegInfo value) {
        return new JAXBElement<RegInfo>(_RegInfo_QNAME, RegInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "CostInfo")
    public JAXBElement<CostInfo> createCostInfo(CostInfo value) {
        return new JAXBElement<CostInfo>(_CostInfo_QNAME, CostInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "ContractOut")
    public JAXBElement<ContractOut> createContractOut(ContractOut value) {
        return new JAXBElement<ContractOut>(_ContractOut_QNAME, ContractOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VatRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "VatRate")
    public JAXBElement<VatRate> createVatRate(VatRate value) {
        return new JAXBElement<VatRate>(_VatRate_QNAME, VatRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Contract")
    public JAXBElement<Contract> createContract(Contract value) {
        return new JAXBElement<Contract>(_Contract_QNAME, Contract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessPartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "BusinessPartner")
    public JAXBElement<BusinessPartner> createBusinessPartner(BusinessPartner value) {
        return new JAXBElement<BusinessPartner>(_BusinessPartner_QNAME, BusinessPartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Department }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Department")
    public JAXBElement<Department> createDepartment(Department value) {
        return new JAXBElement<Department>(_Department_QNAME, Department.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "ContractType")
    public JAXBElement<ContractType> createContractType(ContractType value) {
        return new JAXBElement<ContractType>(_ContractType_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NNxKUDSSyncService", name = "SyncRequest")
    public JAXBElement<SyncRequest> createSyncRequest(SyncRequest value) {
        return new JAXBElement<SyncRequest>(_SyncRequest_QNAME, SyncRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncOutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NNxKUDSSyncService", name = "SyncOutRequest")
    public JAXBElement<SyncOutRequest> createSyncOutRequest(SyncOutRequest value) {
        return new JAXBElement<SyncOutRequest>(_SyncOutRequest_QNAME, SyncOutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "PaymentForm")
    public JAXBElement<PaymentForm> createPaymentForm(PaymentForm value) {
        return new JAXBElement<PaymentForm>(_PaymentForm_QNAME, PaymentForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncOutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = SyncOutContractData.class)
    public JAXBElement<SyncOutRequest> createSyncOutContractDataRequest(SyncOutRequest value) {
        return new JAXBElement<SyncOutRequest>(_SyncOutContractDataRequest_QNAME, SyncOutRequest.class, SyncOutContractData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "VatSum", scope = CostInfo.class)
    public JAXBElement<String> createCostInfoVatSum(String value) {
        return new JAXBElement<String>(_CostInfoVatSum_QNAME, String.class, CostInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "PaymentCurrency", scope = CostInfo.class)
    public JAXBElement<Currency> createCostInfoPaymentCurrency(Currency value) {
        return new JAXBElement<Currency>(_CostInfoPaymentCurrency_QNAME, Currency.class, CostInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VatRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "VatRate", scope = CostInfo.class)
    public JAXBElement<VatRate> createCostInfoVatRate(VatRate value) {
        return new JAXBElement<VatRate>(_VatRate_QNAME, VatRate.class, CostInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Value", scope = CostInfo.class)
    public JAXBElement<String> createCostInfoValue(String value) {
        return new JAXBElement<String>(_CostInfoValue_QNAME, String.class, CostInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Currency", scope = CostInfo.class)
    public JAXBElement<Currency> createCostInfoCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, CostInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "PaymentForm", scope = CostInfo.class)
    public JAXBElement<PaymentForm> createCostInfoPaymentForm(PaymentForm value) {
        return new JAXBElement<PaymentForm>(_PaymentForm_QNAME, PaymentForm.class, CostInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Comment", scope = CostInfo.class)
    public JAXBElement<String> createCostInfoComment(String value) {
        return new JAXBElement<String>(_CostInfoComment_QNAME, String.class, CostInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "ParentGID", scope = ContractType.class)
    public JAXBElement<String> createContractTypeParentGID(String value) {
        return new JAXBElement<String>(_ContractTypeParentGID_QNAME, String.class, ContractType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "ParentContractType", scope = ContractType.class)
    public JAXBElement<ContractType> createContractTypeParentContractType(ContractType value) {
        return new JAXBElement<ContractType>(_ContractTypeParentContractType_QNAME, ContractType.class, ContractType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "INN", scope = BusinessPartner.class)
    public JAXBElement<String> createBusinessPartnerINN(String value) {
        return new JAXBElement<String>(_BusinessPartnerINN_QNAME, String.class, BusinessPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "RegDate", scope = ContractOut.class)
    public JAXBElement<XMLGregorianCalendar> createContractOutRegDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractOutRegDate_QNAME, XMLGregorianCalendar.class, ContractOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "GeneralNum", scope = ContractOut.class)
    public JAXBElement<String> createContractOutGeneralNum(String value) {
        return new JAXBElement<String>(_ContractOutGeneralNum_QNAME, String.class, ContractOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "State", scope = ContractOut.class)
    public JAXBElement<String> createContractOutState(String value) {
        return new JAXBElement<String>(_ContractOutState_QNAME, String.class, ContractOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "StartDate", scope = ContractOut.class)
    public JAXBElement<XMLGregorianCalendar> createContractOutStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractOutStartDate_QNAME, XMLGregorianCalendar.class, ContractOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "RegNum", scope = ContractOut.class)
    public JAXBElement<String> createContractOutRegNum(String value) {
        return new JAXBElement<String>(_ContractOutRegNum_QNAME, String.class, ContractOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "EndDate", scope = ContractOut.class)
    public JAXBElement<XMLGregorianCalendar> createContractOutEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractOutEndDate_QNAME, XMLGregorianCalendar.class, ContractOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "OuterNum", scope = ContractOut.class)
    public JAXBElement<String> createContractOutOuterNum(String value) {
        return new JAXBElement<String>(_ContractOutOuterNum_QNAME, String.class, ContractOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "URL", scope = ContractOut.class)
    public JAXBElement<String> createContractOutURL(String value) {
        return new JAXBElement<String>(_ContractOutURL_QNAME, String.class, ContractOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "RegNum", scope = RegInfo.class)
    public JAXBElement<String> createRegInfoRegNum(String value) {
        return new JAXBElement<String>(_ContractOutRegNum_QNAME, String.class, RegInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "OuterNum", scope = RegInfo.class)
    public JAXBElement<String> createRegInfoOuterNum(String value) {
        return new JAXBElement<String>(_ContractOutOuterNum_QNAME, String.class, RegInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "ProjectNum", scope = RegInfo.class)
    public JAXBElement<String> createRegInfoProjectNum(String value) {
        return new JAXBElement<String>(_RegInfoProjectNum_QNAME, String.class, RegInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "OwnerTransfer", scope = Contract.class)
    public JAXBElement<String> createContractOwnerTransfer(String value) {
        return new JAXBElement<String>(_ContractOwnerTransfer_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "IsTemplate", scope = Contract.class)
    public JAXBElement<Boolean> createContractIsTemplate(Boolean value) {
        return new JAXBElement<Boolean>(_ContractIsTemplate_QNAME, Boolean.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Subject", scope = Contract.class)
    public JAXBElement<String> createContractSubject(String value) {
        return new JAXBElement<String>(_ContractSubject_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "ParentGID", scope = Contract.class)
    public JAXBElement<String> createContractParentGID(String value) {
        return new JAXBElement<String>(_ContractTypeParentGID_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "RegInfo", scope = Contract.class)
    public JAXBElement<RegInfo> createContractRegInfo(RegInfo value) {
        return new JAXBElement<RegInfo>(_RegInfo_QNAME, RegInfo.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "StateCode", scope = Contract.class)
    public JAXBElement<String> createContractStateCode(String value) {
        return new JAXBElement<String>(_ContractStateCode_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "CostInfo", scope = Contract.class)
    public JAXBElement<CostInfo> createContractCostInfo(CostInfo value) {
        return new JAXBElement<CostInfo>(_CostInfo_QNAME, CostInfo.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "IsFullExec", scope = Contract.class)
    public JAXBElement<Boolean> createContractIsFullExec(Boolean value) {
        return new JAXBElement<Boolean>(_ContractIsFullExec_QNAME, Boolean.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "IsConf", scope = Contract.class)
    public JAXBElement<Boolean> createContractIsConf(Boolean value) {
        return new JAXBElement<Boolean>(_ContractIsConf_QNAME, Boolean.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Department }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "CustomerDepartment", scope = Contract.class)
    public JAXBElement<Department> createContractCustomerDepartment(Department value) {
        return new JAXBElement<Department>(_ContractCustomerDepartment_QNAME, Department.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "ValuationCode", scope = Contract.class)
    public JAXBElement<String> createContractValuationCode(String value) {
        return new JAXBElement<String>(_ContractValuationCode_QNAME, String.class, Contract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncOutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = SyncOutContractURL.class)
    public JAXBElement<SyncOutRequest> createSyncOutContractURLRequest(SyncOutRequest value) {
        return new JAXBElement<SyncOutRequest>(_SyncOutContractDataRequest_QNAME, SyncOutRequest.class, SyncOutContractURL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Mail", scope = Employee.class)
    public JAXBElement<String> createEmployeeMail(String value) {
        return new JAXBElement<String>(_EmployeeMail_QNAME, String.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Department }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://terralink.ru/", name = "Department", scope = Employee.class)
    public JAXBElement<Department> createEmployeeDepartment(Department value) {
        return new JAXBElement<Department>(_Department_QNAME, Department.class, Employee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = SyncContract.class)
    public JAXBElement<SyncRequest> createSyncContractRequest(SyncRequest value) {
        return new JAXBElement<SyncRequest>(_SyncOutContractDataRequest_QNAME, SyncRequest.class, SyncContract.class, value);
    }

}
