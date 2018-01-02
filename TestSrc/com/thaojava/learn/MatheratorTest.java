package com.thaojava.learn;

import junit.framework.TestCase;

public class MatheratorTest extends TestCase {
	private Matherator testObject;

	protected void setUp() throws Exception {
		testObject = new Matherator();
	}

	public void testSubtract() {
		long result = 100-(-34);
		assertEquals(result, testObject.subtract(100,-34));
	}

	public void testAdd() {
		// let Java add it up
		long result = 10 + 23 + (-1) + 16;
		assertEquals(result, testObject.add(10,23,-1,16));
		result = 100+102;
		assertEquals(result, testObject.add(100,102));
		result = 0;
		assertEquals(result, testObject.add(0));
	}

}
