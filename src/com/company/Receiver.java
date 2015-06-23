package com.company;

public class Receiver {

    private String name;
    private String address;
    private String companyName;

    public Receiver(String nName, String nAddress, String nCompanyName) {
        name = nName;
        address = nAddress;
        companyName = nCompanyName;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCompanyName() {
        return companyName;
    }
}
