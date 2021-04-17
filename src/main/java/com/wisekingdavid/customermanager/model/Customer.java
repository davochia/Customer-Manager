package com.wisekingdavid.customermanager.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private String customerId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String phone;
    private String email;
    private String occupation;
    private String imageUrl;

}
