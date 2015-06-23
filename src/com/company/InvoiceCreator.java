package com.company;

import org.w3c.dom.Document;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


public class InvoiceCreator {

	private Document d;

	public InvoiceCreator(Document d) {
		this.d = d;
	}

	public InvoiceView getDataFromXML() throws XPathExpressionException {
		// todo: extract from XML
		InvoiceLine line1 = new InvoiceLine("Stuff", BigDecimal.valueOf(14), BigDecimal.valueOf(75), BigDecimal.valueOf(5000000));
		InvoiceLine line2 = new InvoiceLine("More stuff", BigDecimal.valueOf(34), BigDecimal.valueOf(34), BigDecimal.valueOf(34000));
		List<InvoiceLine> lines = Arrays.asList(line1, line2);

		Bill bill1 = new Bill(lines);
		Receiver receiver = new Receiver("someone else", xpathEval("//AccountingSupplierParty//PostalAddress//StreetName"), "Yahoo");
		Sender sender = new Sender("someone", "somewhere", "some@what", "0887987579759", "Google");

		return new InvoiceView(receiver, sender, bill1);
	}


	private String xpathEval(String path) throws XPathExpressionException {
		XPath xpath = XPathFactory.newInstance().newXPath();
		return xpath.evaluate(path, d);
	}
}
