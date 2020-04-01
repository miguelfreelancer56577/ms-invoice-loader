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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
 *         &lt;element ref="{http://www.sat.gob.mx/aerolineas}Aerolineas"/&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/implocal}ImpuestosLocales"/&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/TimbreFiscalDigital}TimbreFiscalDigital"/&gt;
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
    "aerolineas",
    "impuestosLocales",
    "timbreFiscalDigital"
})
@XmlRootElement(name = "Complemento")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "complemento")
public class Complemento extends RootEntity{

	@XmlTransient
	@OneToOne(mappedBy = "complemento")
	protected Comprobante comprobante;
	
    @XmlElement(name = "Aerolineas", namespace = "http://www.sat.gob.mx/aerolineas", required = false)
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(columnDefinition = "id")
    protected Aerolineas aerolineas;
    @XmlElement(name = "ImpuestosLocales", namespace = "http://www.sat.gob.mx/implocal", required = false)
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(columnDefinition = "id")
    protected ImpuestosLocales impuestosLocales;
    @XmlElement(name = "TimbreFiscalDigital", namespace = "http://www.sat.gob.mx/TimbreFiscalDigital", required = true)
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, optional = false)
    @JoinColumn(columnDefinition = "id", nullable = false)
    protected TimbreFiscalDigital timbreFiscalDigital;

}
