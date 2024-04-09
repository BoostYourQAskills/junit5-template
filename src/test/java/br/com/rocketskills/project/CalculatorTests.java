package br.com.rocketskills.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTests {

	@Test
	@DisplayName("Deve somar dois números")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();

		int result = calculator.add(1, 1);

		assertEquals(2, result, "1 + 1 é igual a 2");
	}
}
