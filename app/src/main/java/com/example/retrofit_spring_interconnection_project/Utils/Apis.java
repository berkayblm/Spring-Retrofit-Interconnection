package com.example.retrofit_spring_interconnection_project.Utils;

public class Apis {

    public static final String URL = "http://localhost:8080/api/";

    public static CustomerService getCustomerService() {
        return Client.getClient(URL).create(CustomerService.class);
    }
}
