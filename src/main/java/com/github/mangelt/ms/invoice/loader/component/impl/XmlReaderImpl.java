package com.github.mangelt.ms.invoice.loader.component.impl;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.github.mangelt.ms.invoice.loader.component.XmlReader;
import com.github.mangelt.ms.invoice.loader.dao.Comprobante;
import com.github.mangelt.ms.invoice.loader.exception.XmlReaderException;
import com.github.mangelt.ms.invoice.loader.util.InvoiceConstant;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class XmlReaderImpl implements XmlReader{
	
	public Comprobante createComprobante(File invoiceFile){
		
		
		Comprobante comprobante = null;
		String packageName = Comprobante.class.getPackage().getName();
		
		try {
			log.debug(InvoiceConstant.MSG_LOG_INVOICE, invoiceFile.getName());
			JAXBContext jc = JAXBContext.newInstance(packageName);
			Unmarshaller u = jc.createUnmarshaller();		
			comprobante = (Comprobante)u.unmarshal(invoiceFile);
			return comprobante;
		} catch (Exception e) {
			log.error(InvoiceConstant.EX_XML_READER + e.getMessage());
			throw new XmlReaderException(InvoiceConstant.EX_XML_READER + e.getMessage(), e);
		}
	}
	
}
