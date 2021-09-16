package com.lti.jnuitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Product;

class ProductTest {

	@Test
	public void testCompanyName()
	{
		Product p = new Product(101,"mobile",30000);
		Assertions.assertEquals("dmart", p.getCompanyName());
	}

}
