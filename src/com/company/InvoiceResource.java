package com.company;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/report")
@Produces(MediaType.APPLICATION_JSON)
public class InvoiceResource {

    private String receiverName;
    private String receiverAddress;
    private String receiverCompanyName;

    private String senderName = "Stephanie";
    private String senderAddress = "Somewhere on Earth";
    private String senderEmail = "someone.someone@hotmail.com";
    private String senderTelephone = "07392743190";
    private String senderCompanyName = "Yahoo";



    public InvoiceResource() {
    }

    @GET
    @Produces("text/html")
    public InvoiceView sayReport(@QueryParam("receiverName") String receiverName, @QueryParam("receiverAdress") String receiverAdress, @QueryParam("receiverCompanyName") String receiverCompanyName) {
        Receiver receiver1 = new Receiver(receiverName, receiverAdress, receiverCompanyName);
        Sender sender1 = new Sender(senderName,senderAddress,senderEmail,senderTelephone,senderCompanyName);

        InvoiceLine line1 = new InvoiceLine("Stuff", 14, 75, 5000000);
        InvoiceLine line2 = new InvoiceLine("More stuff", 34, 34, 34000);

        List<InvoiceLine> lines = Arrays.asList(line1, line2);
        Bill bill1 = new Bill(lines);

        InvoiceView invoiceView = new InvoiceView(receiver1 , sender1 , bill1);
        return invoiceView;
    }




}