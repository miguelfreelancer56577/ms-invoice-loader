//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.17 a las 11:13:39 AM CDT 
//


package com.github.mangelt.ms.invoice.loader.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

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
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}DomicilioFiscal"/&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}ExpedidoEn"/&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}RegimenFiscal"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "domicilioFiscal",
    "expedidoEn",
    "regimenFiscal"
})
@XmlRootElement(name = "Emisor")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "emisor")
@Data
@Document("emisor")
public class Emisor extends RootEntity {

	@XmlTransient
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "emisor")
	protected Comprobante comprobante;
    @XmlElement(name = "DomicilioFiscal", required = true)
    @OneToOne(orphanRemoval = true, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition = "id")
    protected DomicilioFiscal domicilioFiscal;
    @XmlElement(name = "ExpedidoEn", required = true)
    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition = "id")
    protected ExpedidoEn expedidoEn;
    @XmlAttribute(name = "RegimenFiscal", required = true)
    protected String regimenFiscal;
    @XmlAttribute(name = "Rfc")
    @Column(name = "rfc")
    protected String rfc;
    @XmlAttribute(name = "Nombre")
    @Column(name = "nombre")
    protected String nombre;

}
