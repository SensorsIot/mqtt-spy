//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.26 at 07:20:43 PM GMT 
//


package pl.baczkowicz.mqttspy.versions.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for LatestRelease complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatestRelease">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="KeyFeatures" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DownloadLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatestRelease", propOrder = {
    "version",
    "name",
    "date",
    "keyFeatures",
    "downloadLocation"
})
public class LatestRelease
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "KeyFeatures", required = true)
    protected String keyFeatures;
    @XmlElement(name = "DownloadLocation", required = true)
    protected String downloadLocation;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the keyFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFeatures() {
        return keyFeatures;
    }

    /**
     * Sets the value of the keyFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFeatures(String value) {
        this.keyFeatures = value;
    }

    /**
     * Gets the value of the downloadLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadLocation() {
        return downloadLocation;
    }

    /**
     * Sets the value of the downloadLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadLocation(String value) {
        this.downloadLocation = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            String theVersion;
            theVersion = this.getVersion();
            toStringBuilder.append("version", theVersion);
        }
        {
            String theName;
            theName = this.getName();
            toStringBuilder.append("name", theName);
        }
        {
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            toStringBuilder.append("date", theDate);
        }
        {
            String theKeyFeatures;
            theKeyFeatures = this.getKeyFeatures();
            toStringBuilder.append("keyFeatures", theKeyFeatures);
        }
        {
            String theDownloadLocation;
            theDownloadLocation = this.getDownloadLocation();
            toStringBuilder.append("downloadLocation", theDownloadLocation);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof LatestRelease)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final LatestRelease that = ((LatestRelease) object);
        equalsBuilder.append(this.getVersion(), that.getVersion());
        equalsBuilder.append(this.getName(), that.getName());
        equalsBuilder.append(this.getDate(), that.getDate());
        equalsBuilder.append(this.getKeyFeatures(), that.getKeyFeatures());
        equalsBuilder.append(this.getDownloadLocation(), that.getDownloadLocation());
    }

    public boolean equals(Object object) {
        if (!(object instanceof LatestRelease)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getVersion());
        hashCodeBuilder.append(this.getName());
        hashCodeBuilder.append(this.getDate());
        hashCodeBuilder.append(this.getKeyFeatures());
        hashCodeBuilder.append(this.getDownloadLocation());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final LatestRelease copy = ((target == null)?((LatestRelease) createCopy()):((LatestRelease) target));
        {
            String sourceVersion;
            sourceVersion = this.getVersion();
            String copyVersion = ((String) copyBuilder.copy(sourceVersion));
            copy.setVersion(copyVersion);
        }
        {
            String sourceName;
            sourceName = this.getName();
            String copyName = ((String) copyBuilder.copy(sourceName));
            copy.setName(copyName);
        }
        {
            XMLGregorianCalendar sourceDate;
            sourceDate = this.getDate();
            XMLGregorianCalendar copyDate = ((XMLGregorianCalendar) copyBuilder.copy(sourceDate));
            copy.setDate(copyDate);
        }
        {
            String sourceKeyFeatures;
            sourceKeyFeatures = this.getKeyFeatures();
            String copyKeyFeatures = ((String) copyBuilder.copy(sourceKeyFeatures));
            copy.setKeyFeatures(copyKeyFeatures);
        }
        {
            String sourceDownloadLocation;
            sourceDownloadLocation = this.getDownloadLocation();
            String copyDownloadLocation = ((String) copyBuilder.copy(sourceDownloadLocation));
            copy.setDownloadLocation(copyDownloadLocation);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new LatestRelease();
    }

}
