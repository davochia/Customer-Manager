package com.wisekingdavid.customermanager.Services;

import com.wisekingdavid.customermanager.DTOs.CustomerDTOs;

import java.util.List;

public interface CustomerServiceI {
    List<CustomerDTOs> getAllCustomer();
    CustomerDTOs addCustomer(CustomerDTOs customerDTOs);
    CustomerDTOs getCustomer(Long customerId);
    CustomerDTOs modifyCustomer(Long id, CustomerDTOs customerDTOs);
    Boolean deleteCustomer(Long customerDTOs);

//    CustomerDTOs modifyCustomer(Long id, CustomerDTOs customerDTOs);
//    Boolean deleteCustomer(Long customerId);
}
