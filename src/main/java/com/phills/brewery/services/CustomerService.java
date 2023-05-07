package com.phills.brewery.services;

import com.phills.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
     CustomerDto getCustomerByID(UUID customerId);
}
