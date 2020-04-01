//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.17 a las 11:13:39 AM CDT 
//


package com.github.mangelt.ms.invoice.loader.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
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
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}Retenciones"/&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/cfd/3}Traslados"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="totalImpuestosRetenidos" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="totalImpuestosTrasladados" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "Retenciones",
    "Traslados"
})
@XmlRootElement(name = "Impuestos")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity(name = "Impuestos")
@Table(name = "impuestos")
@Data
@ToString
@Document("impuestos")
public class Impuestos extends RootEntity {

	@XmlTransient
	@OneToOne(mappedBy = "impuestos")
	Comprobante comprobante;
	
    @XmlElement(name = "Retenciones", required = true)
    @Transient
    protected Retenciones retenciones;
    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "impuestos")
    protected List<Retencion> retencionesList;
    
    @XmlElement(name = "Traslados", required = true)
    @Transient
    protected Traslados traslados;
    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "impuestos")
    protected List<Traslado> trasladosList;
    
    
    @XmlAttribute(name = "TotalImpuestosRetenidos")
    @Column(name = "total_impuestos_retenidos")
    protected Float totalImpuestosRetenidos;
    @XmlAttribute(name = "TotalImpuestosTrasladados")
    @Column(name = "total_impuestos_trasladados")
    protected Float totalImpuestosTrasladados;
    
    public void setRetenciones(Retenciones retenciones){
    	this.retenciones = retenciones;
    	this.retencionesList = retenciones.getRetencion();
    }
    
    public void setRetencionesList(List<Retencion> retencionList){
    	this.retenciones = Retenciones.builder().retencion(retencionList).build();
    	this.retencionesList = retencionList;
    }
    
    public void setTraslados(Traslados traslados){
    	this.traslados = traslados;
    	this.trasladosList = traslados.getTraslado();
    }
    
    public void setTrasladosList(List<Traslado> trasladosList){
    	this.traslados = Traslados.builder().traslado(trasladosList).build();
    	this.trasladosList = trasladosList;
    }
    
}
