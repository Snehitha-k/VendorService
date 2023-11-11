package com.app.controller;

import java.util.List;

import com.app.business.bean.VendorBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.VendorService;

@RestController
public class VendorController {

	/*
	 * Autowire the VendorService object
	 * 
	 * */
	// Your Code Here
	@Autowired
	private VendorService vendorservice;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "Welcome to Spring Boot Vendor Service API!";
	}

	
	/* 
	 * Method - getVendorDetails()
	 * Fetch all the vendor details using VendorService and store it inside a List
	 * Return a ResponseEntity object passing the list of vendor details
	 * 
	 */
	
	@RequestMapping(value="/vendor/controller/getVendors", method=RequestMethod.GET)
	public ResponseEntity<List<VendorBean>> getVendorDetails() {
		List<VendorBean> vendorBeans=vendorservice.getVendorDetails();
		return new ResponseEntity<List<VendorBean>>(vendorBeans,HttpStatus.OK);		
	}
}
