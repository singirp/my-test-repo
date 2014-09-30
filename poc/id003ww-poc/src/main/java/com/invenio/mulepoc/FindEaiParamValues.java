
package com.invenio.mulepoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findEaiParamValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findEaiParamValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input" type="{http://ws.global.mapping.eai.umgi.com/}paramInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEaiParamValues", propOrder = {
    "input"
})
public class FindEaiParamValues {

    protected ParamInput input;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link ParamInput }
     *     
     */
    public ParamInput getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamInput }
     *     
     */
    public void setInput(ParamInput value) {
        this.input = value;
    }

}
