package com.app.service;

import java.util.ArrayList;
import java.util.List;

import com.app.business.bean.VendorBean;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.VendorDAO;
import com.app.entity.VendorEntity;

@Service
public class VendorServiceImpl implements VendorService{

	/*
	 * Autowire VendorDAO object
	 * 
	 * */
	@Autowired
	private VendorDAO dao;
	// Your Code Here

	
	/*
	 * Method - getVendorDetails()
	 * Use the VendorDAO to get all the vendors
	 * Check if vendors is not empty then 
	 * 		Declare VendorBean object with null value
	 * 		Loop through all the vendors 
	 * 			Create a new bean object 
	 * 			Copy each property value of entity object to bean object
	 * 			Add the bean object to the vendorBeans list
	 * */

	@Override
	public List<VendorBean> getVendorDetails() {
		List<VendorBean> vendorBeans = new ArrayList<VendorBean>();
		List<VendorEntity> vendorEntities=dao.findAll();
		vendorEntities.forEach(vendorEntity ->{
			VendorBean vendorBean = new VendorBean();
			BeanUtils.copyProperties(vendorEntity, vendorBean);
			vendorBeans.add(vendorBean);
		});
		return vendorBeans;
	} 

}
