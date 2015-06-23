package com.company;


public class Sender {

    private String name;
    private String address;
    private String email;
    private String telephone;
    private String companyName;

       public Sender(String nName, String nAddress, String nEmail,String nTelephone,String nCompanyName) {
          name = nName;
          address = nAddress;
          email = nEmail;
          telephone = nTelephone;
          companyName = nCompanyName;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getCompanyName() {
        return companyName;
    }

}
