package com.oracle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
	private App t = new App(); 
	@Test
	void sampleTest() {
		assertEquals("sample string", t.Sample());
	}
	@Test
	void sampleIntTest() {
		assertEquals(1, t.SampleInt(true));
		//assertEquals(0, t.SampleInt(false));		
	}

}
