package com.example.retrofit_spring_interconnection_project.Utils;

public class Apis {

    public static final String URL = "http://10.0.2.2:8080/customers/";

    public static CustomerService getCustomerService() {
        return Client.getClient(URL).create(CustomerService.class);
    }
}
