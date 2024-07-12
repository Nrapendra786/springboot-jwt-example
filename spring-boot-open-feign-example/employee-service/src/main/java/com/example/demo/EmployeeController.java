package com.example.demo;

import com.example.demo.response.AddressResponse;
import com.example.demo.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private AddressClient addressClient;

    @GetMapping("/employees/{id}")
    private ResponseEntity<AddressResponse> getEmployeeDetails(@PathVariable("id") int id) {
        ResponseEntity<AddressResponse> addressResponse = addressClient.getAddressByEmployeeId(id);
        return ResponseEntity.status(HttpStatus.OK).body(addressClient.getAddressByEmployeeId(id).getBody());
    }
}
