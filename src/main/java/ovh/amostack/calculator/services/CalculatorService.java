package ovh.amostack.calculator.services;

import ovh.amostack.calculator.models.Expression;
import ovh.amostack.calculator.models.ExpressionSolution;

public interface CalculatorService {
	
	public ExpressionSolution solve(Expression expression);
		
}