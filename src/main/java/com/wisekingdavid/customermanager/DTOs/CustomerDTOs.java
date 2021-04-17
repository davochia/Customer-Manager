package com.wisekingdavid.customermanager.DTOs;

import com.wisekingdavid.customermanager.model.Customer;
import lombok.Data;
@Data
public class CustomerDTOs {

    private Long id;
    private String customerId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String occupation;
    private String imageUrl;

    public static CustomerDTOs getCustomerDTOs(Customer customer){
        CustomerDTOs customerDTOs = new CustomerDTOs();
        customerDTOs.setId(customer.getId());
        customerDTOs.setCustomerId(customer.getCustomerId());
        customerDTOs.setFirstName(customer.getFirstName());
        customerDTOs.setLastName(customer.getLastName());
        customerDTOs.setPhone(customer.getPhone());
        customerDTOs.setEmail(customer.getEmail());
        customerDTOs.setOccupation(customer.getOccupation());
        customerDTOs.setImageUrl(customer.getImageUrl());
        return customerDTOs;
    }

    public static Customer getCustomer(CustomerDTOs customerDTOs){
        Customer customer = new Customer();
        customer.setId(customerDTOs.getId());
        customer.setCustomerId(customerDTOs.getCustomerId());
        customer.setFirstName(customerDTOs.getFirstName());
        customer.setLastName(customerDTOs.getLastName());
        customer.setPhone(customerDTOs.getPhone());
        customer.setEmail(customerDTOs.getEmail());
        customer.setOccupation(customerDTOs.getOccupation());
        customer.setImageUrl(customerDTOs.getImageUrl());
        return customer;
    }
}
