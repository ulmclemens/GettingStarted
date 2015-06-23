package com.company;

import com.google.common.base.Strings;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public  class GetDataFromXML {

    public  List<String> GetDataFromXML(Document d) {
        List listA = new ArrayList();
        listA.add(SenderStreetName(d));
        return (listA);
    }

    private  String SenderStreetName(Document d) {
        NodeList suppliers = d.getElementsByTagName("AccountingSupplierParty");
        if (suppliers.getLength() == 1) {
            Element supplier = (Element) suppliers.item(0);


            NodeList addressList = supplier.getElementsByTagName("PostalAddress");
            if (addressList.getLength() == 1) {
                Element address = (Element) addressList.item(0);

                NodeList streetNames = address.getElementsByTagName("StreetName");
                if (streetNames.getLength() == 1) {
                    return streetNames.item(0).toString();
                }

            }
        }
    return"";
    }
}
