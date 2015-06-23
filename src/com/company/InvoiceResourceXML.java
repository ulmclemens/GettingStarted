package com.company;

import com.codahale.metrics.annotation.Timed;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.io.InputStream;

@Path("/invoice")
public class InvoiceResourceXML {

    @Timed
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces("text/html")
    public InvoiceView processInvoice(@FormDataParam("xml") final InputStream inputStream, @FormDataParam("xml") final FormDataContentDisposition contentDispositionHeader) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);

        return new InvoiceCreator(document).getDataFromXML();
    }


}
