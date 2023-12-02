package com.teachmeskills.lesson10.hw9.model.address;

public class Address {
    private int postcode;
    private String country;
    private String city;
    private String street;
    private int houseNumber;

    public Address(int postcode, String country, String city, String street, int houseNumber) {
        this.postcode = postcode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String toString() {
        return "Address{" +
                "postcode=" + postcode +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
