package com.mystertech.forexservice.repositories;

import com.mystertech.forexservice.entities.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends
        JpaRepository<ExchangeValue, Long>{
    ExchangeValue findByFromAndTo(String from, String to);
}