package com.shivudu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "LIC_CUSTOMER")
public class LicCustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String customerName;
	private String fatherName;
	private String motherName;
	private Long policyNumber;
	private String doc;
	private String dom;
	private String termAndTime;
	private Double premium;
	private String email;
	private String nominee;
	private String address;
	private Long aadhaarNumber;
	private String mode;
	private Long age;
	private String relationOfNominee;
	private Double sumAssued;
	private String clia;
	private Long agentCode;
	private String dateOfLastPayment;

}
