package com.company;


public class InvoiceLine {
    private String description;
    private double amount;
    private double rate;
    private double total;

    public InvoiceLine(String nDescription, double nAmount, double nRate) {
        description = nDescription;
        amount = nAmount;
        rate = nRate;
        total = (rate*amount);
    }

    public InvoiceLine(String nDescription, double nAmount, double nRate , double nTotal) {

        description = nDescription;
        amount = nAmount;
        rate = nRate;
        total = nTotal;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public double getRate() {
        return rate;
    }

    public double getTotal() {
        return total;
    }

}
