package com.phills.brewery.services;

import com.phills.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID customerId) {

        return CustomerDto.builder().id(customerId).name("phill").build();

    }

    @Override
    public CustomerDto saveNewcustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updatecustomer(UUID customerId, CustomerDto customerDto) {
        //todo implement method
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("deleted customer : " + customerId);
    }
}
