package com.wisekingdavid.customermanager.Services.CustomerImple;

import com.wisekingdavid.customermanager.DTOs.CustomerDTOs;
import com.wisekingdavid.customermanager.Repository.CustomerRepository;
import com.wisekingdavid.customermanager.Services.CustomerServiceI;
import com.wisekingdavid.customermanager.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerServiceI {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<CustomerDTOs> getAllCustomer() {
        List<Customer> allCustomer = customerRepository.findAll();
        List<CustomerDTOs> customerDTOsList = new ArrayList<>();
        allCustomer.forEach(customer -> customerDTOsList.add(CustomerDTOs.getCustomerDTOs(customer)));
        return customerDTOsList;
    }

    @Override
    public CustomerDTOs addCustomer(CustomerDTOs customerDTOs) {
        if(customerDTOs == null)return null;
        Customer customer = CustomerDTOs.getCustomer(customerDTOs);
        customer.setCustomerId(UUID.randomUUID().toString());
        return CustomerDTOs.getCustomerDTOs(customerRepository.save(customer));
    }

    @Override
    public CustomerDTOs getCustomer(Long customerId) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty())return null;
        Customer customer = optionalCustomer.get();
        return CustomerDTOs.getCustomerDTOs(customer);
    }

    @Override
    public CustomerDTOs modifyCustomer(Long id, CustomerDTOs customerDTOs) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isEmpty())return null;

        Customer customer = optionalCustomer.get();

        customer.setFirstName(customerDTOs.getFirstName());
        customer.setLastName(customerDTOs.getLastName());
        customer.setEmail(customerDTOs.getEmail());
        customer.setPhone(customerDTOs.getPhone());
        customer.setOccupation(customerDTOs.getOccupation());
        customer.setImageUrl(customerDTOs.getImageUrl());

        return CustomerDTOs.getCustomerDTOs(customerRepository.save(customer));
    }

    @Override
    public Boolean deleteCustomer(Long customerId) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty())return false;
        Customer customer = optionalCustomer.get();
        customerRepository.delete(customer);
        return true;
    }

}
