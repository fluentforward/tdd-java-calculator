import java.math.BigDecimal;


public class SubtractOperation extends BinaryOperation {

	@Override
	protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
		return value2.subtract(value1);
	}

}
