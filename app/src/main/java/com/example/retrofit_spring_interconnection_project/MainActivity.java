package com.example.retrofit_spring_interconnection_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.retrofit_spring_interconnection_project.Models.Customer;
import com.example.retrofit_spring_interconnection_project.Utils.CustomerService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    CustomerService customerService;
    List<Customer> listCustomer = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listView = (ListView) findViewById(R.id.);
        listCustomers();
    }

    public void listCustomers() {

        Call<List<Customer>> call = customerService.getCustomers();
        call.enqueue(new Callback<List<Customer>>() {
            @Override
            public void onResponse(Call<List<Customer>> call, Response<List<Customer>> response) {
                listCustomer = response.body();
                listView.setAdapter(new CustomerAdapter(MainActivity.this, R.layout.content_main, listCustomer));
            }

            @Override
            public void onFailure(Call<List<Customer>> call, Throwable t) {
                Log.e("Error", t.getMessage());
            }
        });

    }

}