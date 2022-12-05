package Alll.Application.Services;

import Alll.Application.Interfaces.CustomerInterface;
import Alll.Application.Models.Customer;
import Alll.Application.ModelslDAO.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CustomerService implements CustomerInterface {

    @Autowired
    CustomerDAO dao;


    @Override
    public List<Map<String, Object>> list() {
        return dao.list();
    }

    @Override
    public List<Map<String, Object>> list(int id) {
        return null;
    }

    @Override
    public Customer add(Customer c) {
        return null;
    }

    @Override
    public Customer edit(Customer c) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
