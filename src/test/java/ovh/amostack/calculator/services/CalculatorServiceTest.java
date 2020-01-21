package ovh.amostack.calculator.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import ovh.amostack.calculator.models.Expression;
import ovh.amostack.calculator.services.implementations.CalculatorServiceImpl;

public class CalculatorServiceTest {

	CalculatorService calculator;

	@BeforeAll
	public void init() {
		calculator = new CalculatorServiceImpl();
	}

	@Test
	public void simpleAddition() {

		assertEquals(15.5d,
				calculator.solve(
						new Expression("12+3.5"))
				.getResult()
				.getValue()
				);
	}

	@Test
	public void simpleSubtraction() {

		assertEquals(8.5d, 
				calculator.solve(
						new Expression("12-3.5"))
				.getResult()
				.getValue()
				);
	}

	@Test
	public void simpleMultiplication() {


		assertEquals(42d, 
				calculator.solve(
						new Expression("12*3.5"))
				.getResult()
				.getValue()
				);
	}

	@Test
	public void simpleDivision() {


		assertEquals(4d, 
				calculator.solve(
						new Expression("12/3"))
				.getResult().getValue()
				);
	}

	@Test
	public void simpleDivisionBy0() {
		assertThrows(ArithmeticException.class, () -> {
			calculator.solve(
					new Expression("12/0"))
			.getResult()
			.getValue();
		});
	}
}
