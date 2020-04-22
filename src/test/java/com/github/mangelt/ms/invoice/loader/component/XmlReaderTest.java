package com.github.mangelt.ms.invoice.loader.component;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.Test;

import com.github.mangelt.ms.invoice.loader.component.impl.XmlReaderImpl;
import com.github.mangelt.ms.invoice.loader.dao.Comprobante;

import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Contains test cases to test {@link XmlReader} class.
 * 
 * @author mangelt
 *
 */
@Slf4j
public class XmlReaderTest {

	private static XmlReader XmlReader;
	private static String PathToInvoice;
	
	/**
	 * Creates XmlReader used to read an Invoice. 
	 */
	@BeforeClass
	public static void setUp() {
		XmlReader = new XmlReaderImpl();
		PathToInvoice = ".\\src\\test\\resource\\SCI981012Q85_CFDI_CA231480_20191105.xml";
	}
	
	/**
	 * Steps to applied for:
	 * 
	 * 1. Gets a reference to invoice file.
	 * 2. Calls the reader to get a {@link com.github.mangelt.ms.invoice.loader.dao.Comprobante} object
	 */
	@Test
	public void readInvoice() {
		File invoiceFile = new File(PathToInvoice);
		Comprobante createComprobante = XmlReader.createComprobante(invoiceFile);
		assertThat(createComprobante).isNotNull();
		log.info(createComprobante.toString());
	}
	
}
