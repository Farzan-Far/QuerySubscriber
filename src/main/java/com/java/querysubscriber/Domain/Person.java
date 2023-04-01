package com.java.querysubscriber.Domain;

import jakarta.persistence.*;

@Entity
public class Person
{
    private String name;
    private String family;
    @Id
    private String nationalID;
    @Enumerated(EnumType.STRING)
    private Country country;


    public Person(String name, String family, String nationalID, Country country) {

        this.name = name;
        this.family = family;
        this.nationalID = nationalID;
        this.country = country;
    }

    public Person(String nationalID) {
        this.nationalID = nationalID;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
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
