package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void aMethod() {
		assertEquals(Calculator.add(10,20), 30);
	}
	@Test
	public void bMethod() {
		assertEquals(Calculator.add(10,0), 10);
	}
}
