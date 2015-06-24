package com.company;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Path("/report")
@Produces(MediaType.APPLICATION_JSON)
public class InvoiceResourceHTML {


    public InvoiceResourceHTML() {
    }

    @POST
    @Produces("text/html")
    public InvoiceView sayReport(
            @FormParam("receiverName") String receiverName,
            @FormParam("receiverAdress") String receiverAdress,
            @FormParam("recieverPostalCode") String recieverPostalCode,
            @FormParam("receiverCompanyName") String receiverCompanyName,
            @FormParam("senderName") String senderName,
            @FormParam("receiverOrderRefereceID") String receiverOrderRefereceID,
            @FormParam("senderAddress") String senderAddress,
            @FormParam("senderPostalCode") String senderPostalCode,
            @FormParam("senderEmail") String senderEmail,
            @FormParam("senderTelephone") String senderTelephone,
            @FormParam("senderCompanyName") String senderCompanyName,
            @FormParam("senderCompanyIdentification") String senderCompanyIdentification,
            @FormParam("bankAccount") String bankAccount,
            @FormParam("vatNumber") String vatNumber,
            @FormParam("issueDate") String issueDate,
            @FormParam("id") String id
    ) {

        Receiver receiver1 = new Receiver(receiverName, receiverAdress, recieverPostalCode, receiverCompanyName, receiverOrderRefereceID);
        Sender sender1 = new Sender(senderName, senderAddress, senderPostalCode, senderEmail, senderTelephone, senderCompanyName, senderCompanyIdentification, bankAccount, vatNumber);

        InvoiceLine line1 = new InvoiceLine("Stuff", BigDecimal.valueOf(14), BigDecimal.valueOf(75), BigDecimal.valueOf(5000000));
        InvoiceLine line2 = new InvoiceLine("More stuff", BigDecimal.valueOf(34), BigDecimal.valueOf(34), BigDecimal.valueOf(34000));

        List<InvoiceLine> lines = Arrays.asList(line1, line2);
        Bill bill1 = new Bill(lines);

        InvoiceView invoiceView = new InvoiceView(receiver1, sender1, bill1, issueDate, id);
        return invoiceView;
    }

}