package ovh.amostack.calculator.services.implementations;

import org.springframework.stereotype.Service;

import ovh.amostack.calculator.models.Expression;
import ovh.amostack.calculator.models.ExpressionSolution;
import ovh.amostack.calculator.services.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public ExpressionSolution solve(Expression expression) {
		String exp = expression.getExpression();
		
    // No empty parenthesis
		if(exp.contains("()")){
			throw new ArithmeticException();
		}
		
		if (!checkParenthesisCount(exp)) {
			throw new ArithmeticException();
    }
    
    // Solve here
	return null;
  }

  // Return true if '(' amount equals ')' amount
	public boolean checkParenthesisCount(String exp ) {
		int nb1 = 0; 
		int nb2 = 0;
		for (int i=0; i<exp.length(); i++) {
			if (exp.charAt(i) == '(' )
				nb1++; 
		}
		
		for (int i=0; i<exp.length(); i++) {
			if (exp.charAt(i) == ')' )
				nb2++; 
		}
		
		
		if (nb1 != nb2) {
			return false;
		}
		return true; 
		}
}
	
