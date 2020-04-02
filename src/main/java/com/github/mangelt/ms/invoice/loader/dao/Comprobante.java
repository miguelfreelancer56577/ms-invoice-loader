//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.09.06 a las 02:04:29 PM CDT 
//

package com.github.mangelt.ms.invoice.loader.dao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;


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
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}Emisor"/&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}Receptor"/&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}Conceptos"/&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}Impuestos"/&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}Complemento"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="certificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="noCertificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="condicionesDePago" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="descuento" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="subTotal" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="formaDePago" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="serie" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="folio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumCtaPago" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sello" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="LugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="metodoDePago" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tipoDeComprobante" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "", propOrder = {
     "Emisor",
     "Receptor",
     "Conceptos",
     "Impuestos",
     "Complemento"
 })
@XmlRootElement(name = "Comprobante")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ToString
@Entity(name = "Comprobante")
@Table(name = "comprobante")
@Data
@Document("comprobantes")
public class Comprobante extends RootEntity{

    @XmlElement(name = "Emisor", required = true)
    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true, fetch = FetchType.LAZY)
    protected Emisor emisor;
    @XmlElement(name = "Receptor", required = true)
    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true, fetch = FetchType.LAZY)
    protected Receptor receptor;
    @XmlElement(name = "Conceptos", required = true)
    @Transient
    @Setter(value = AccessLevel.NONE)
    protected Conceptos concepto;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "comprobante")
    @Setter(value = AccessLevel.NONE)
    protected List<Concepto> conceptos;
    @XmlElement(name = "Impuestos", required = true)
    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true, fetch = FetchType.LAZY)
    protected Impuestos impuestos;
    @XmlElement(name = "Complemento", required = true)
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false, orphanRemoval = true)
    protected Complemento complemento;
    @XmlAttribute(name = "Certificado")
    @Column(name = "certificado")
    protected String certificado;
    @XmlAttribute(name = "NoCertificado")
    @Column(name = "no_certificado")
    protected String noCertificado;
    @XmlAttribute(name = "CondicionesDePago")
    @Column(name = "condiciones_de_pago")
    protected String condicionesDePago;
    @XmlAttribute(name = "Descuento")
    @Column(name = "descuento")
    protected Float descuento;
    @XmlAttribute(name = "SubTotal")
    @Column(name = "subtotal")
    protected Float subTotal;
    @XmlAttribute(name = "FormaDePago")
    @Column(name = "forma_de_pago")
    protected String formaDePago;
    @XmlAttribute(name = "Serie")
    @Column(name = "serie")
    protected String serie;
    @XmlAttribute(name = "Version")
    @Column(name = "version")
    protected Float version;
    @XmlAttribute(name = "Folio")
    @Column(name = "folio")
    protected String folio;
    @XmlAttribute(name = "NumCtaPago")
    @Column(name = "num_cta_pago")
    protected String numCtaPago;
    @XmlAttribute(name = "Sello")
    @Column(name = "sello")
    protected String sello;
    @XmlAttribute(name = "Fecha")
    @XmlSchemaType(name = "dateTime")
    @Transient
    @Setter(value = AccessLevel.NONE)
    protected XMLGregorianCalendar fecha;
    @Column(name = "fecha")
    @Setter(value = AccessLevel.NONE)
    protected Calendar fechaItem;
    @XmlAttribute(name = "LugarExpedicion")
    @Column(name = "lugar_expedicion")
    protected String lugarExpedicion;
    @XmlAttribute(name = "Moneda")
    @Column(name = "moneda")
    protected String moneda;
    @XmlAttribute(name = "TipoCambio")
    @Column(name = "tipo_cambio")
    protected String tipoCambio;
    @XmlAttribute(name = "Total")
    @Column(name = "total")
    protected Float total;
    @XmlAttribute(name = "MetodoDePago")
    @Column(name = "metodo_de_pago")
    protected String metodoDePago;
    @XmlAttribute(name = "TipoDeComprobante")
    @Column(name = "tipo_de_comprobante")
    protected String tipoDeComprobante;

    public void setFecha(XMLGregorianCalendar target) throws DatatypeConfigurationException{
    	this.fecha = target;
    	this.fechaItem = new GregorianCalendar(target.getYear(), target.getMonth(), target.getDay()); 
    }
    
    public void setFechaItem(Calendar target) throws DatatypeConfigurationException{
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(target.getTimeInMillis());
        XMLGregorianCalendar xc = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        this.fecha = xc;
        this.fechaItem = target;
    }
    
    public void setConcepto(Conceptos concepto){
    	this.concepto = concepto;
    	this.conceptos = concepto.getConcepto();
    }
    
    public void setConceptos(List<Concepto> conceptos){
    	Conceptos concepto = Conceptos.builder().concepto(conceptos).build();
    	this.conceptos = conceptos;
    	this.concepto = concepto;
    }

}
