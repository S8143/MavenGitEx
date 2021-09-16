package com.lti.jnuitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testshow()
	{
		MyApp m = new MyApp();
		String s = m.show();
		Assertions.assertEquals("hello maven", s);
	}
	
	@Test
	void  testAdd()
	{
		int r = Calculator.add(100, 200);
		Assertions.assertEquals(300,r);    //(expected,actual,Optional Message)
		Assertions.assertEquals(100, Calculator.add(50, 50),"Testing Add Method");
		Assertions.assertNotEquals(100, r);
	}
    @Test
    void testAssertFalse()
    {
    	Assertions.assertFalse("Akash".length()==10);
    	Assertions.assertFalse(10>20,"comparing two values");
  
    }
    
    @Test
    void testAssertNull()
    {
    	String s1 = null;
    	String s2 = "abc";
    	Assertions.assertNull(s1);
    	Assertions.assertNotNull(s2);
    }
    
//    @Test
//    void testAssertAll()
//    {
//    	String str1 = "abc";
//    	String str2 = "pqr";
//    	String str3 = "xyz";
//    	Assertions.assertAll(
//    			() -> Assertions.assertEquals(str1,"abc"),
//    			() -> Assertions.assertEquals(str2,"pqr"),
//    			() -> Assertions.assertEquals(str3,"xyz")
//    			);
//    }
//    
//    @Test
//    void testCollections()
//    {
//    	ArrayList<String> myList = new ArrayList<>();
//    	myList.add("Hello");
//    	Assertions.assertFalse(myList.isEmpty());
//    	
//    	
//    	ArrayList<Integer> myList1 = new ArrayList<>();
//    	Assertions.assertEquals(true, myList1.isEmpty());
//    }
    
    
	


}
