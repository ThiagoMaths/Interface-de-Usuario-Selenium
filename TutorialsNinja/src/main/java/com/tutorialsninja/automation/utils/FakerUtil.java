package com.tutorialsninja.automation.utils;

import com.github.javafaker.Faker;

public class FakerUtil {

    private final Faker faker;


    public FakerUtil() {
        this.faker = new Faker();
    }

    public String firstName() {
        return faker.name().firstName();
    }

    public String lastName() {
        return faker.name().lastName();
    }

    public String email() {
        return faker.internet().emailAddress();
    }

    public String telephone() {
        return faker.phoneNumber().phoneNumber();
    }

    public String password() {
        return faker.internet().password();
    }

}
