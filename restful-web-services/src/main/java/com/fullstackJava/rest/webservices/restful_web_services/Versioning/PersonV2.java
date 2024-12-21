package com.fullstackJava.rest.webservices.restful_web_services.Versioning;

public class PersonV2 {
    private Name name;

    @Override
    public String toString() {
        return "PersonV2{" +
                "name=" + name +
                '}';
    }

    public Name getName() {
        return name;
    }

    public PersonV2(Name name) {
        this.name = name;
    }
}