package com.example.retrofit_spring_interconnection_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.retrofit_spring_interconnection_project.Models.Customer;

import java.util.List;

public class CustomerAdapter extends ArrayAdapter<Customer> {

    private Context context;
    private List<Customer> customerList;


    public CustomerAdapter(@NonNull Context context, int resource, @NonNull List<Customer> objects) {
        super(context, resource, objects);
        this.context = context;
        this.customerList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = layoutInflater.inflate(R.layout.content_main, parent,false);

        TextView textIdCustomer = (TextView) rowView.findViewById(R.id.ID);
        TextView textNameCustomer = (TextView) rowView.findViewById(R.id.name);
        TextView textEmailCustomer = (TextView) rowView.findViewById(R.id.email);

        textIdCustomer.setText(String.format("ID:%s", customerList.get(position).getId()));
        textNameCustomer.setText(String.format("Name:%s", customerList.get(position).getName()));
        textEmailCustomer.setText(String.format("Email:%s", customerList.get(position).getEmail()));

        return rowView;


    }


}
