package com.shivudu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivudu.model.LicCustomer;
import com.shivudu.service.LicCustomerService;

@RestController
public class LicCustomerController {

	@Autowired
	private LicCustomerService service;

	@PostMapping("/create")
	public String CustomerSave(@RequestBody LicCustomer customer) {
		return service.CustomerSave(customer);
	}

	@GetMapping("/retriveAll")
	public List<LicCustomer> getAllCustomers() {
		return service.getAllCustomers();
	}

	@PutMapping("/update")
	public String CustomerUpdate(@RequestBody LicCustomer customer) {
		return service.CustomerUpdate(customer);
	}

	@DeleteMapping("/delete/{id}")
	public String CustometdeleteById(@PathVariable Integer id) {
		return service.CustometdeleteById(id);
	}

	@DeleteMapping("/deleteAll")
	public String CustometdeleteByAllRecoreds() {
		return service.CustometdeleteByAllRecoreds();

	}

}
