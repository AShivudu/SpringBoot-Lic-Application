package com.shivudu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivudu.model.LicCustomer;

public interface LicCustomerRepo extends JpaRepository<LicCustomer, Serializable> {

}
