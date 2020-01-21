package ovh.amostack.calculator.services.implementations;

import org.springframework.stereotype.Service;

import ovh.amostack.calculator.models.Expression;
import ovh.amostack.calculator.models.ExpressionSolution;
import ovh.amostack.calculator.services.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public ExpressionSolution solve(Expression expression) {
		return null;
	}

}
