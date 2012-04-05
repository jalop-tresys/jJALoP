//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.06 at 10:05:13 AM EST 
//


package com.tresys.jalop.schemas.mil.dod.jalop_1_0.applicationmetadatatypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mil.dod.jalop_1_0.applicationmetadatatypes package. 
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

    private final static QName _ContentType_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "Content-Type");
    private final static QName _StackFrame_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "StackFrame");
    private final static QName _Syslog_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "Syslog");
    private final static QName _JournalMetadata_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "JournalMetadata");
    private final static QName _ApplicationMetadata_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "ApplicationMetadata");
    private final static QName _Parameter_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "Parameter");
    private final static QName _AES256_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "AES256");
    private final static QName _Transform_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "Transform");
    private final static QName _Severity_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "Severity");
    private final static QName _Transforms_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "Transforms");
    private final static QName _AES192_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "AES192");
    private final static QName _FileInfo_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "FileInfo");
    private final static QName _AES128_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "AES128");
    private final static QName _Logger_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "Logger");
    private final static QName _Field_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "Field");
    private final static QName _StructuredData_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "StructuredData");
    private final static QName _XOR_QNAME = new QName("http://www.dod.mil/jalop-1.0/applicationMetadataTypes", "XOR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mil.dod.jalop_1_0.applicationmetadatatypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StructuredDataType }
     * 
     */
    public StructuredDataType createStructuredDataType() {
        return new StructuredDataType();
    }

    /**
     * Create an instance of {@link ApplicationMetadataType }
     * 
     */
    public ApplicationMetadataType createApplicationMetadataType() {
        return new ApplicationMetadataType();
    }

    /**
     * Create an instance of {@link SyslogType }
     * 
     */
    public SyslogType createSyslogType() {
        return new SyslogType();
    }

    /**
     * Create an instance of {@link LoggerType.Location }
     * 
     */
    public LoggerType.Location createLoggerTypeLocation() {
        return new LoggerType.Location();
    }

    /**
     * Create an instance of {@link XorECBType }
     * 
     */
    public XorECBType createXorECBType() {
        return new XorECBType();
    }

    /**
     * Create an instance of {@link FileInfoType }
     * 
     */
    public FileInfoType createFileInfoType() {
        return new FileInfoType();
    }

    /**
     * Create an instance of {@link AES128CBCType }
     * 
     */
    public AES128CBCType createAES128CBCType() {
        return new AES128CBCType();
    }

    /**
     * Create an instance of {@link LoggerType }
     * 
     */
    public LoggerType createLoggerType() {
        return new LoggerType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link JournalMetadataType }
     * 
     */
    public JournalMetadataType createJournalMetadataType() {
        return new JournalMetadataType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link AES256CBCType }
     * 
     */
    public AES256CBCType createAES256CBCType() {
        return new AES256CBCType();
    }

    /**
     * Create an instance of {@link LoggerSeverityType }
     * 
     */
    public LoggerSeverityType createLoggerSeverityType() {
        return new LoggerSeverityType();
    }

    /**
     * Create an instance of {@link MetadataType }
     * 
     */
    public MetadataType createMetadataType() {
        return new MetadataType();
    }

    /**
     * Create an instance of {@link AES192CBCType }
     * 
     */
    public AES192CBCType createAES192CBCType() {
        return new AES192CBCType();
    }

    /**
     * Create an instance of {@link StackFrameType }
     * 
     */
    public StackFrameType createStackFrameType() {
        return new StackFrameType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link ContentTypeType }
     * 
     */
    public ContentTypeType createContentTypeType() {
        return new ContentTypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "Content-Type")
    public JAXBElement<ContentTypeType> createContentType(ContentTypeType value) {
        return new JAXBElement<ContentTypeType>(_ContentType_QNAME, ContentTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StackFrameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "StackFrame")
    public JAXBElement<StackFrameType> createStackFrame(StackFrameType value) {
        return new JAXBElement<StackFrameType>(_StackFrame_QNAME, StackFrameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyslogType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "Syslog")
    public JAXBElement<SyslogType> createSyslog(SyslogType value) {
        return new JAXBElement<SyslogType>(_Syslog_QNAME, SyslogType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "JournalMetadata")
    public JAXBElement<JournalMetadataType> createJournalMetadata(JournalMetadataType value) {
        return new JAXBElement<JournalMetadataType>(_JournalMetadata_QNAME, JournalMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "ApplicationMetadata")
    public JAXBElement<ApplicationMetadataType> createApplicationMetadata(ApplicationMetadataType value) {
        return new JAXBElement<ApplicationMetadataType>(_ApplicationMetadata_QNAME, ApplicationMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "Parameter")
    public JAXBElement<ParameterType> createParameter(ParameterType value) {
        return new JAXBElement<ParameterType>(_Parameter_QNAME, ParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AES256CBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "AES256")
    public JAXBElement<AES256CBCType> createAES256(AES256CBCType value) {
        return new JAXBElement<AES256CBCType>(_AES256_QNAME, AES256CBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<TransformType>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoggerSeverityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "Severity")
    public JAXBElement<LoggerSeverityType> createSeverity(LoggerSeverityType value) {
        return new JAXBElement<LoggerSeverityType>(_Severity_QNAME, LoggerSeverityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<TransformsType>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AES192CBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "AES192")
    public JAXBElement<AES192CBCType> createAES192(AES192CBCType value) {
        return new JAXBElement<AES192CBCType>(_AES192_QNAME, AES192CBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "FileInfo")
    public JAXBElement<FileInfoType> createFileInfo(FileInfoType value) {
        return new JAXBElement<FileInfoType>(_FileInfo_QNAME, FileInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AES128CBCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "AES128")
    public JAXBElement<AES128CBCType> createAES128(AES128CBCType value) {
        return new JAXBElement<AES128CBCType>(_AES128_QNAME, AES128CBCType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoggerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "Logger")
    public JAXBElement<LoggerType> createLogger(LoggerType value) {
        return new JAXBElement<LoggerType>(_Logger_QNAME, LoggerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "Field")
    public JAXBElement<MetadataType> createField(MetadataType value) {
        return new JAXBElement<MetadataType>(_Field_QNAME, MetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "StructuredData")
    public JAXBElement<StructuredDataType> createStructuredData(StructuredDataType value) {
        return new JAXBElement<StructuredDataType>(_StructuredData_QNAME, StructuredDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XorECBType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dod.mil/jalop-1.0/applicationMetadataTypes", name = "XOR")
    public JAXBElement<XorECBType> createXOR(XorECBType value) {
        return new JAXBElement<XorECBType>(_XOR_QNAME, XorECBType.class, null, value);
    }

}