//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.11 a las 05:42:34 AM ECT 
//


package com.distribuidas.practicaws.students;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Studentr" type="{http://distribuidas.com/practicaws}Student"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentr"
})
@XmlRootElement(name = "getStudentResponse")
public class GetStudentResponse {

    @XmlElement(name = "Studentr", required = true)
    protected Student studentr;

    /**
     * Obtiene el valor de la propiedad studentr.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStudentr() {
        return studentr;
    }

    /**
     * Define el valor de la propiedad studentr.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStudentr(Student value) {
        this.studentr = value;
    }

}
