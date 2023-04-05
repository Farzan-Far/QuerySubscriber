package com.java.querysubscriber.DataModels;

import com.java.querysubscriber.Domain.Country;
import jakarta.persistence.*;

public class Request
{
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
