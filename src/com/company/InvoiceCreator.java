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
		Receiver receiver = new Receiver(xpathEval("//AccountingCustomerParty//Contact//Name"),(xpathEval("//AccountingCustomerParty//PostalAddress//StreetName")+" "+xpathEval("//AccountingCustomerParty//PostalAddress//BuildingNumber")+", "+xpathEval("//AccountingCustomerParty//PostalAddress//BuildingName")),xpathEval("//AccountingCustomerParty//PostalAddress//PostalZone")+" "+xpathEval("//AccountingCustomerParty//PostalAddress//CityName")+ ", "+ xpathEval("//AccountingCustomerParty//PostalAddress//CountrySubentity"),xpathEval("//AccountingCustomerParty//PartyName//Name"), xpathEval("/Invoice/OrderReference//ID") );
		Sender sender = new Sender(xpathEval("//AccountingSupplierParty//Contact//Name"),(xpathEval("//AccountingSupplierParty//PostalAddress//StreetName")+" "+xpathEval("//AccountingSupplierParty//PostalAddress//BuildingNumber")+", "+xpathEval("//AccountingSupplierParty//PostalAddress//BuildingName")),xpathEval("//AccountingSupplierParty//PostalAddress//PostalZone")+" "+xpathEval("//AccountingSupplierParty//PostalAddress//CityName")+ ", "+ xpathEval("//AccountingSupplierParty//PostalAddress//CountrySubentity"), xpathEval("//AccountingSupplierParty//Contact//ElectronicMail"), xpathEval("//AccountingSupplierParty//Contact//Telephone"), xpathEval("//AccountingSupplierParty//PartyName//Name"), xpathEval("//AccountingSupplierParty/Party/PartyIdentification/ID"),xpathEval("//PaymentMeans/PayeeFinancialAccount/ID"),xpathEval("//Party/PartyTaxScheme/CompanyID"));

		return new InvoiceView(receiver, sender, bill1, xpathEval("/Invoice/IssueDate"), xpathEval("/Invoice/ID"));
	}


	private String xpathEval(String path) throws XPathExpressionException {
		XPath xpath = XPathFactory.newInstance().newXPath();
		return xpath.evaluate(path, d);
	}
}
