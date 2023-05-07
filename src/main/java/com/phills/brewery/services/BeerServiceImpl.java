package com.phills.brewery.services;

import com.phills.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerByID(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("phills brew").beerStyle("IPA").build();
    }
}
