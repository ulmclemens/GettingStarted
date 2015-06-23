package com.company;

import java.util.List;

/**
 * Created by Ulm.Clemens on 23-Jun-15.
 */
public class Bill {

    private List<InvoiceLine> invoiceLines;

    public Bill(List<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }


    public List<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }
}
