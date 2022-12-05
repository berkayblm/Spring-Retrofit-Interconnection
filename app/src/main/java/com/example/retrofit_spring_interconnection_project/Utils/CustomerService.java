package com.example.retrofit_spring_interconnection_project.Utils;

import com.example.retrofit_spring_interconnection_project.Models.Customer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CustomerService {
    @GET("liste")
    Call<List<Customer>> getCustomers();
}
