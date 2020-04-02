package com.github.mangelt.ms.invoice.loader.component;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.github.mangelt.ms.invoice.loader.dao.Comprobante;
import com.github.mangelt.ms.invoice.loader.exception.XmlReaderException;
import com.github.mangelt.ms.invoice.loader.util.InvoiceConstant;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class XmlReader {
	
	public Comprobante createComprobante(File invoiceFile) throws XmlReaderException {
		
		
		Comprobante comprobante = null;
		String packageName = Comprobante.class.getPackage().getName();
		
		try {
			log.debug(InvoiceConstant.MSG_LOG_INVOICE, invoiceFile.getName());
			JAXBContext jc = JAXBContext.newInstance(packageName);
			Unmarshaller u = jc.createUnmarshaller();		
			comprobante = (Comprobante)u.unmarshal(invoiceFile);
			return comprobante;
		} catch (Exception e) {
			log.error(InvoiceConstant.EX_XML_READER);
			throw new XmlReaderException(InvoiceConstant.EX_XML_READER, e);
		}
	}
	
}
