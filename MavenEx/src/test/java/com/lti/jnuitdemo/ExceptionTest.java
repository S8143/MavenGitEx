package com.lti.jnuitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class ExceptionTest {

	@Test
	public void testExceptions() {		
		
//	    Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
//	        Integer.parseInt("100assff");
//	        });
//
//	    String expectedMessage = "For input string";
//	    String actualMessage = exception.getMessage();
//	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
//	    //Assertions.assertEquals(expectedMessage,actualMessage);
	    
	}	
	
	 @Test
	 void testAssumeFalse() {
	      boolean b = 'A' != 'A';
	      Assumptions.assumeFalse(b);
	      Assertions.assertEquals("Hello", "Hello");
	 }
	 
	 @Test
	 void testAssumeTrue() {
	      boolean b = "A" == "A";
	      Assumptions.assumeFalse(b);
	     // Assertions.assertEquals("Hello", "Hello");
	 }



}
