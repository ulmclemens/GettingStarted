package com.company;

import io.dropwizard.views.View;

public class InvoiceView extends View {
    private Receiver receiver;
    private Sender sender;
    private Bill bill;

    public InvoiceView(Receiver nReceiver, Sender nSender , Bill nBill) {
        super("report.ftl");
        receiver = nReceiver;
        sender = nSender;
        bill = nBill;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public Bill getBill() {
        return bill;
    }

    public Sender getSender() {
        return sender;
    }
}