package com.shivudu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivudu.model.LicCustomer;
import com.shivudu.repository.LicCustomerRepo;

@Service
public class LicCustomerimpl implements LicCustomerService {

	@Autowired
	private LicCustomerRepo repository;

	@Override
	public String CustomerSave(LicCustomer customer) {
		repository.save(customer);
		return "Customer Record Saved Successfully";
	}

	@Override
	public List<LicCustomer> getAllCustomers() {
		return repository.findAll();
	}

	@Override
	public String CustomerUpdate(LicCustomer customer) {
		repository.save(customer);
		return "Customer Record Updated Successfully";
	}

	@Override
	public String CustometdeleteById(Integer id) {
		repository.deleteById(id);
		return "Customer Deleted Successfully";
	}

	@Override
	public String CustometdeleteByAllRecoreds() {
		repository.deleteAll();
		return "Customer AllRecords Deleted Successfully";
	}

}
