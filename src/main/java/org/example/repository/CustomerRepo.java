package org.example.repository;


import org.example.entity.Customer;
import org.springframework.data.repository.Repository;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface CustomerRepo extends Repository<Customer, Long> {
    long countByIdGreaterThan(Long id);
    Optional<Customer> findByLoginStartsWithIgnoreCase(String login);
    Optional<Customer> findById(Long id);
    void save(Customer entity);

}
