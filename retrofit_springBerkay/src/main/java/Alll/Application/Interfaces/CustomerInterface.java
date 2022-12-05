package Alll.Application.Interfaces;

import Alll.Application.Models.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerInterface {
    List<Map<String, Object>> list();
    List<Map<String, Object>> list(int id);
    Customer add(Customer c);
    Customer edit(Customer c);
    void delete(int id);



}
