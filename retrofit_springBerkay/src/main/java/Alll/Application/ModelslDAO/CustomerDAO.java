package Alll.Application.ModelslDAO;

import Alll.Application.Interfaces.CustomerInterface;
import Alll.Application.Models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public class CustomerDAO implements CustomerInterface {
    @Autowired
    JdbcTemplate template;

    @Override
    public List<Map<String, Object>> list() {
        List<Map<String, Object>> liste = template
                .queryForList("select * from customer");
        return liste;
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
