package com.github.mangelt.ms.invoice.loader.exception;

import lombok.NoArgsConstructor;

/**
 * XmlReaderException
 * 
 * Wraps possible exception triggered by reading invoices.
 * 
 * @author mangelt
 * @version 1.0.0
 *
 */
@NoArgsConstructor
public class XmlReaderException extends RuntimeException {
	
	private static final long serialVersionUID = 19565839L;

	public XmlReaderException(String msg, Throwable e){
		super(msg, e);
	}
	
}
