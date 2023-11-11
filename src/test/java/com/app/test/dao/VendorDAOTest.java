package com.app.test.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.dao.VendorDAO;
import com.app.entity.VendorEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VendorDAOTest {

	/*
	 * Autowire the VendorDAO object below
	 */
	
	// Your Code Here

	@Autowired
	private VendorDAO vendorDAO;
	
	/*
	 * Method - notNullVendorDAOTest()
	 * Assert only that VendorDAO object is Not null
	 */
	
	@Test
	public void notNullVendorDAOTest() {
		assertNotNull(vendorDAO);
	}

	/*
	 * Method - findByIdVendorDAOTest()
	 * Using VendorDAO fetch an entity by its ID --> "V001" 
	 * Assert that the entity fetch and it is Not null 
	 * Assert that the name of the vendor entity fetch is equal to --> "Only Vimal"
	 */

	@Test
	public void findByIdVendorDAOTest() {
		VendorEntity vendorEntity=vendorDAO.findOne("V001");
		assertNotNull(vendorEntity);
	}
	
}
