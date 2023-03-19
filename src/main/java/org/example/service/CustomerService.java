package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.Customer;
import org.example.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepo customerRepo;

    public Optional<Customer> get(Long id){
        return customerRepo.findById(id);
    }

    public void update(Customer customer){
        customerRepo.save(customer);
    }

    public Optional<Customer> findByFirstLetterInLogin(String letter){

        return customerRepo.findByLoginStartsWithIgnoreCase(letter);
    }

    public Long countByIdMoreThan(Long id){
        return customerRepo.countByIdGreaterThan(id);
    }


}
