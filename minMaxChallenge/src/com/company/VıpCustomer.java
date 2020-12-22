package com.company;

public class VıpCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VıpCustomer(String name, int creditLimit) {
        this(name,creditLimit,"yourEmail.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VıpCustomer() {
        this("defaultName",500,"defaultEmailAddress");

    }

    public VıpCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
