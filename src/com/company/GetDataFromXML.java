package com.company;

import com.google.common.base.Strings;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public  class GetDataFromXML {

    private Document d;

    public  List<String> GetDataFromXML(Document f) throws XPathExpressionException {
        d=f;

        List listA = new ArrayList();

        listA.add(XpathEval("//AccountingSupplierParty//PostalAddress//StreetName"));
        return (listA);
    }


    private  String XpathEval(String path) throws XPathExpressionException {
        XPath xpath = XPathFactory.newInstance().newXPath();
        return xpath.evaluate(path, d);
    }
}
