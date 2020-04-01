//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.26 a las 12:45:21 PM CDT 
//


package com.github.mangelt.ms.invoice.loader.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import org.springframework.data.mongodb.core.mapping.Document;

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
 *       &lt;attribute name="noIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cantidad" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="importe" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="valorUnitario" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlRootElement(name = "Concepto")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity(name = "Concepto")
@Table(name = "concepto")
@Data
@Document("conceptos")
public class Concepto extends RootEntity {
	
	@XmlTransient
	@ManyToOne
	protected Comprobante comprobante;
	
    @XmlValue
    @Column(name = "value")
    protected String value;
    @XmlAttribute(name = "NoIdentificacion")
    @Column(name = "no_identificacion")
    protected String noIdentificacion;
    @XmlAttribute(name = "Unidad")
    protected String unidad;
    @XmlAttribute(name = "Cantidad")
    protected Float cantidad;
    @XmlAttribute(name = "Importe")
    protected Float importe;
    @XmlAttribute(name = "ValorUnitario")
    @Column(name = "valor_unitario")
    protected Float valorUnitario;
    @XmlAttribute(name = "Descripcion")
    protected String descripcion;
    @XmlAttribute(name = "ClaveProdServ")
    @Column(name = "clave_producto_servicio")
    protected String claveProdServ;
    @XmlAttribute(name = "ClaveUnidad")
    @Column(name = "clave_unidad")
    protected String claveUnidad;

}
