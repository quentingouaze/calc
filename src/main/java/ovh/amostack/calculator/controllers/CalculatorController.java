package ovh.amostack.calculator.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ovh.amostack.calculator.models.Expression;
import ovh.amostack.calculator.models.ExpressionSolution;
import ovh.amostack.calculator.services.CalculatorService;


@RestController
@RequestMapping("/calc")
public class CalculatorController {

	@Autowired
	CalculatorService calculator;

	@PostMapping
	public ExpressionSolution solve(@RequestBody Expression expression) {
		return calculator.solve(expression);
	}
}
