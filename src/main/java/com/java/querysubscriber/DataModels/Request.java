package com.java.querysubscriber.DataModels;

import com.java.querysubscriber.Domain.Country;
import jakarta.persistence.*;

public class Request
{
    //Todo: Change the class type to Record

    private String name;
    private String family;

    private String nationalID;
    @Enumerated(EnumType.STRING)
    private Country country;

    @Override
    public String toString() {
        return "Request{" +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", nationalID='" + nationalID + '\'' +
                ", country=" + country +
                '}';
    }

//    public Request() {
//    }
//
//    public Request(String name, String family, String nationalID, Country country) {
//        this.name = name;
//        this.family = family;
//        this.nationalID = nationalID;
//        this.country = country;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
