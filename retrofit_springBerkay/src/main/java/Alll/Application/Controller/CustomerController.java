package Alll.Application.Controller;

import Alll.Application.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

    @Autowired
    CustomerService service;
    @GetMapping("/liste")
    public List<Map<String, Object>> listele() {
        return service.list();
    }
}
