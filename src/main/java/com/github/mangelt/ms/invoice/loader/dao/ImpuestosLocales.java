//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.17 a las 11:13:39 AM CDT 
//


package com.github.mangelt.ms.invoice.loader.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="RetencionesLocales" form="qualified"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="ImpLocRetenido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="TasadeRetencion" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                   &lt;attribute name="Importe" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="TrasladosLocales" form="qualified"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="ImpLocTrasladado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="TasadeTraslado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                   &lt;attribute name="Importe" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="TotaldeRetenciones" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TotaldeTraslados" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retencionesLocalesOrTrasladosLocales"
})
@XmlRootElement(name = "ImpuestosLocales", namespace = "http://www.sat.gob.mx/implocal")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "impuestos_locales")
@Document("impuestos_locales")
public class ImpuestosLocales extends RootEntity {
	
    @XmlElements({
        @XmlElement(name = "RetencionesLocales", namespace = "http://www.sat.gob.mx/implocal", type = ImpuestosLocales.RetencionesLocales.class),
        @XmlElement(name = "TrasladosLocales", namespace = "http://www.sat.gob.mx/implocal", type = ImpuestosLocales.TrasladosLocales.class)
    })
    @Transient
    @Setter(value = AccessLevel.NONE)
    protected List<Object> retencionesLocalesOrTrasladosLocales;
    
//    separated relationship to the tables retenciones_locales and traslados_locales
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "impuestosLocales")
    @Setter(value = AccessLevel.NONE)
    @XmlTransient
    protected List<RetencionesLocales> retencionesLocales;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "impuestosLocales")
    @Setter(value = AccessLevel.NONE)
    @XmlTransient
    protected List<TrasladosLocales> trasladosLocales;
    
    @XmlAttribute(name = "Version", required = true)
    @Column(name = "version")
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "TotaldeRetenciones", required = true)
    @Column(name = "totalde_retenciones")
    protected BigDecimal totaldeRetenciones;
    @XmlAttribute(name = "TotaldeTraslados", required = true)
    @Column(name = "total_de_traslados")
    protected BigDecimal totaldeTraslados;
    
    public void setRetencionesLocalesOrTrasladosLocales(List<Object> retencionesLocalesOrTrasladosLocales) {
    	this.retencionesLocalesOrTrasladosLocales = retencionesLocalesOrTrasladosLocales;
    	List<TrasladosLocales> trasladosLocales = new ArrayList();
		List<RetencionesLocales> retencionesLocales = new ArrayList();
    	if(!Objects.isNull(retencionesLocalesOrTrasladosLocales)) {
    		retencionesLocalesOrTrasladosLocales.parallelStream().forEach(target->{
    			if (target instanceof TrasladosLocales) {
    				trasladosLocales.add((TrasladosLocales) target);
				}else {
					retencionesLocales.add((RetencionesLocales) target);
				}
    		});
    		if(!trasladosLocales.isEmpty()) {
    			this.trasladosLocales = trasladosLocales;
    		}
    		if(!retencionesLocales.isEmpty()) {
    			this.retencionesLocales = retencionesLocales;
    		}
    	}
    }
    
    public void setRetencionesLocales(List<RetencionesLocales> retencionesLocales) {
    	this.retencionesLocales = retencionesLocales;
    	if(Objects.isNull(this.retencionesLocalesOrTrasladosLocales))
    		this.retencionesLocalesOrTrasladosLocales = new ArrayList();
    	retencionesLocales.parallelStream().forEach(target->{
    		this.retencionesLocalesOrTrasladosLocales.add(target);
    	});
    }
    
    public void setTrasladosLocales(List<TrasladosLocales> trasladosLocales) {
    	this.trasladosLocales = trasladosLocales;
    	if(Objects.isNull(this.retencionesLocalesOrTrasladosLocales))
    		this.retencionesLocalesOrTrasladosLocales = new ArrayList();
    	trasladosLocales.parallelStream().forEach(target->{
    		this.retencionesLocalesOrTrasladosLocales.add(target);
    	});
    }

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
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ImpLocRetenido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TasadeRetencion" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="Importe" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Entity(name = "RetencionesLocales")
    @Table(name = "retenciones_locales")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RetencionesLocales extends RootEntity{

    	@XmlTransient
    	@ManyToOne
    	protected ImpuestosLocales impuestosLocales;

        @XmlAttribute(name = "ImpLocRetenido", required = true)
        @Column(name = "imp_loc_retenido", nullable = false)
        protected String impLocRetenido;
        @XmlAttribute(name = "tasa_de_retencion", required = true)
        @Column(name = "tasade_retencion", nullable = false)
        protected BigDecimal tasadeRetencion;
        @XmlAttribute(name = "Importe", required = true)
        @Column(name = "importe", nullable = false)
        protected BigDecimal importe;

    }


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
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ImpLocTrasladado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TasadeTraslado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="Importe" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Entity
    @Table(name = "traslados_locales")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TrasladosLocales extends RootEntity {

    	@XmlTransient
    	@ManyToOne
    	protected ImpuestosLocales impuestosLocales;
    	
        @XmlAttribute(name = "ImpLocTrasladado", required = true)
        @Column(name = "imp_loc_trasladado", nullable = false)
        protected String impLocTrasladado;
        @XmlAttribute(name = "TasadeTraslado", required = true)
        @Column(name = "tasa_de_traslado", nullable = false)
        protected BigDecimal tasadeTraslado;
        @XmlAttribute(name = "Importe", required = true)
        @Column(name = "importe", nullable = false)
        protected BigDecimal importe;

    }

}
