package com.shivudu.service;

import java.util.List;

import com.shivudu.model.LicCustomer;

public interface LicCustomerService {

	public String CustomerSave(LicCustomer customer);

	public List<LicCustomer> getAllCustomers();

	public String CustomerUpdate(LicCustomer customer);

	public String CustometdeleteById(Integer id);

	public String CustometdeleteByAllRecoreds();

}
