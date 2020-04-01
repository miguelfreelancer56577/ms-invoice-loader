//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.29 a las 09:10:41 AM CDT 
//

package com.github.mangelt.ms.invoice.loader.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pais" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="estado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="municipio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="colonia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="calle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="noInterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="noExterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "DomicilioFiscal")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "domicilio_fiscal")
@Data
public class DomicilioFiscal extends RootEntity {
    @XmlValue
    @Column(name = "value")
    protected String value;
    @XmlAttribute(name = "CodigoPostal")
    @Column(name = "codigo_postal")
    protected String codigoPostal;
    @XmlAttribute(name = "Pais")
    @Column(name = "pais")
    protected String pais;
    @XmlAttribute(name = "Estado")
    @Column(name = "estado")
    protected String estado;
    @XmlAttribute(name = "Municipio")
    @Column(name = "municipio")
    protected String municipio;
    @XmlAttribute(name = "Colonia")
    @Column(name = "colonia")
    protected String colonia;
    @XmlAttribute(name = "Calle")
    @Column(name = "calle")
    protected String calle;
    @XmlAttribute(name = "Localidad")
    @Column(name = "localidad")
    protected String localidad;
    @XmlAttribute(name = "NoInterior")
    @Column(name = "no_interior")
    protected String noInterior;
    @XmlAttribute(name = "NoExterior")
    @Column(name = "no_exterior")
    protected String noExterior;

}
