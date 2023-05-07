package com.phills.brewery.web.controller;

import com.phills.brewery.services.CustomerService;
import com.phills.brewery.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerID(@PathVariable("customerId") UUID customerId) {

        return new ResponseEntity<>(customerService.getCustomerByID(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.saveNewcustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("LOCATION", "/api/v1/customer" + savedCustomer.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);

    }

    @PutMapping("/{customerId}")
    public ResponseEntity updateCustomer(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto) {
        customerService.updatecustomer(customerId, customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable UUID customerId){
        customerService.deleteCustomer(customerId);
    }
}
