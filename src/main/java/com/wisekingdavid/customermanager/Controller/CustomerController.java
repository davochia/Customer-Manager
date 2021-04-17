package com.wisekingdavid.customermanager.Controller;

import com.wisekingdavid.customermanager.DTOs.CustomerDTOs;
import com.wisekingdavid.customermanager.Services.CustomerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerServiceI customerServiceI;

    @PostMapping("/add")
    public ResponseEntity<CustomerDTOs> addNewCustomer(@RequestBody CustomerDTOs customerDTOs){
        CustomerDTOs customerDTO = customerServiceI.addCustomer(customerDTOs);
        return new ResponseEntity<>(customerDTO, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CustomerDTOs>> getCustomers(){
        List<CustomerDTOs> customerDTOsList = customerServiceI.getAllCustomer();
        return new ResponseEntity<>(customerDTOsList, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTOs> getCustomerById(@PathVariable("id") Long id){
        CustomerDTOs customerDTO = customerServiceI.getCustomer(id);
        return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }


    @PutMapping("update/{id}")
    public ResponseEntity<CustomerDTOs> updateCustomer(@PathVariable("id") Long id, @RequestBody CustomerDTOs customerDTOs){
        CustomerDTOs customerDTO = customerServiceI.modifyCustomer(id, customerDTOs);
        return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> removeCustomer(@PathVariable("id") Long id){
        Boolean isDeleted = customerServiceI.deleteCustomer(id);
        return new ResponseEntity<>(isDeleted, HttpStatus.OK);
    }


}
