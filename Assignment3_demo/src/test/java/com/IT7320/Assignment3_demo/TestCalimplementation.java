package com.IT7320.Assignment3_demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalimplementation {
	
	CalImplementation calcImplObj;
	ICalculator mockObj;
	
	
	int a, b;
	int expected, actual;
	
	

	@Before
	public void setUp() throws Exception {
		calcImplObj= new CalImplementation();
			a = 8 ;
			b = 10;
			mockObj = Mockito.mock(ICalculator.class);
			
			Mockito.when(mockObj.add(a, b)).thenReturn(a+b);
			calcImplObj.setObj(mockObj);
			
			expected = a+b;
			actual = calcImplObj.add(a, b);
			
			
			
	}
	
	@Test
	public void testAdd() {
			assertEquals(expected, actual);
			
	}
	

	@After
	public void tearDown() throws Exception {
		calcImplObj = null;
		
	}

	@Test
	public void test() {
		
	}

}
