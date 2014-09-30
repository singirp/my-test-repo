
package com.invenio.mulepoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eaiParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eaiParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paraParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validfrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eaiParam", propOrder = {
    "client",
    "description",
    "id",
    "key1",
    "key2",
    "key3",
    "key4",
    "paraName",
    "paraParam",
    "validfrom"
})
public class EaiParam {

    protected String client;
    protected String description;
    protected String id;
    protected String key1;
    protected String key2;
    protected String key3;
    protected String key4;
    protected String paraName;
    protected String paraParam;
    protected String validfrom;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the paraName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaName() {
        return paraName;
    }

    /**
     * Sets the value of the paraName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaName(String value) {
        this.paraName = value;
    }

    /**
     * Gets the value of the paraParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaParam() {
        return paraParam;
    }

    /**
     * Sets the value of the paraParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaParam(String value) {
        this.paraParam = value;
    }

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidfrom() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidfrom(String value) {
        this.validfrom = value;
    }

}
