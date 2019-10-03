package com.oracle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnotherAppTest {
	
	private AnotherApp t = new AnotherApp(); 
	@Test
	void testReturnString() {
		assertEquals("Hi", t.ReturnString());
	}

}
