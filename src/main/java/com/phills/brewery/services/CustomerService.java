package com.phills.brewery.services;

import com.phills.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
     CustomerDto getCustomerByID(UUID customerId);

     CustomerDto saveNewcustomer(CustomerDto customerDto);

     void updatecustomer(UUID customerId, CustomerDto customerDto);

     void deleteCustomer(UUID customerId);
}
