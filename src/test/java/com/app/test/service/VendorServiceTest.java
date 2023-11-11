package com.app.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.app.business.bean.VendorBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.service.VendorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VendorServiceTest {

	/*
	 * Autowire the VendorService object below
	 * 
	 */
	// Your Code Here
	@Autowired
	private VendorService vendorService;

	/*
	 * Method - notNullVendorServiceTest()
	 * Assert only that VendorService object is Not null
	 * 
	 */

	@Test
	public void notNullVendorServiceTest() {
		assertNotNull(vendorService);
	}

	/*
	 * Method - notNullGetVendorDetailsTest()
	 * Assert only that VendorService getVendorDetails is not returning a null value
	 * 
	 */

	@Test
	public void notNullGetVendorDetailsTest() {
		assertNotNull(vendorService.getVendorDetails());
	}

	/*
	 * Method - countGetVendorDetailsTest()
	 * Assert only that VendorService getVendorDetails list size matches to 5
	 * 
	 */

	@Test
	public void countGetVendorDetailsTest() {
		// Your Code Here
		assertEquals(vendorService.getVendorDetails().size(),5);
	}

	/*
	 * Method - recordGetVendorDetailsTest()
	 * Assert only that VendorService getVendorDetails first bean name matches --> "Only Vimal"
	 * 
	 */
		
	@Test
	public void recordGetVendorDetailsTest() {
		VendorBean vendorBean=vendorService.getVendorDetails().get(0);
		assertEquals(vendorBean.getVendorName(),"Only Vimal");
	}

}