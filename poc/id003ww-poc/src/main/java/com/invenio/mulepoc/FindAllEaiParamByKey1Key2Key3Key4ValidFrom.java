
package com.invenio.mulepoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findAllEaiParamByKey1Key2Key3Key4ValidFrom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAllEaiParamByKey1Key2Key3Key4ValidFrom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAllEaiParamByKey1Key2Key3Key4ValidFrom", propOrder = {
    "key1",
    "key2",
    "key3",
    "key4",
    "validFrom"
})
public class FindAllEaiParamByKey1Key2Key3Key4ValidFrom {

    @XmlElement(name = "Key1")
    protected String key1;
    @XmlElement(name = "Key2")
    protected String key2;
    @XmlElement(name = "Key3")
    protected String key3;
    @XmlElement(name = "Key4")
    protected String key4;
    @XmlElement(name = "ValidFrom")
    protected String validFrom;

    /**
     * Gets the value of the key1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey1() {
        return key1;
    }

    /**
     * Sets the value of the key1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey1(String value) {
        this.key1 = value;
    }

    /**
     * Gets the value of the key2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey2() {
        return key2;
    }

    /**
     * Sets the value of the key2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey2(String value) {
        this.key2 = value;
    }

    /**
     * Gets the value of the key3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey3() {
        return key3;
    }

    /**
     * Sets the value of the key3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey3(String value) {
        this.key3 = value;
    }

    /**
     * Gets the value of the key4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey4() {
        return key4;
    }

    /**
     * Sets the value of the key4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey4(String value) {
        this.key4 = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

}
