
package com.invenio.mulepoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findAllEaiParamByKey1Key2Key3Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAllEaiParamByKey1Key2Key3Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.global.mapping.eai.umgi.com/}eaiParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAllEaiParamByKey1Key2Key3Response", propOrder = {
    "_return"
})
public class FindAllEaiParamByKey1Key2Key3Response {

    @XmlElement(name = "return")
    protected List<EaiParam> _return;

    /**
     * Gets the value of the return property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the return property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EaiParam }
     * 
     * 
     */
    public List<EaiParam> getReturn() {
        if (_return == null) {
            _return = new ArrayList<EaiParam>();
        }
        return this._return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param _return
     *     allowed object is
     *     {@link EaiParam }
     *     
     */
    public void setReturn(List<EaiParam> _return) {
        this._return = _return;
    }

}
