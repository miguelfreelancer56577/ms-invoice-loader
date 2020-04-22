package com.github.mangelt.ms.invoice.loader.component;

import java.io.File;

import com.github.mangelt.ms.invoice.loader.dao.Comprobante;

public interface XmlReader {
	Comprobante createComprobante(File invoiceFile);
}
