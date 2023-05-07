package com.phills.brewery.services;

import com.phills.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID customerId) {

        return CustomerDto.builder().id(customerId).name("phill").build();

    }
}
