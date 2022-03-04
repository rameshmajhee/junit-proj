package com.test.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void addTest() {
		TestJunit1 jnuitTest=new TestJunit1();
		int result=jnuitTest.add(100, 200);
		assertEquals(30, result);
	}

}
