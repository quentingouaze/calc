package ovh.amostack.calculator.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpressionSolution {

	private ExpressionResult result;
	
	//private Collection<ResolutionStep> resolutionSteps;
}
