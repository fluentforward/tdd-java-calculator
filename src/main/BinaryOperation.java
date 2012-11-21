import java.math.BigDecimal;


public abstract class BinaryOperation implements Operation {
	@Override
	public void apply(OperandStack stack) {
		BigDecimal value1 = stack.peek();
		stack.pop();
		BigDecimal value2 = stack.peek();
		stack.replaceTop(calculate(value1, value2));
	}
	
	protected abstract BigDecimal calculate(BigDecimal value1, BigDecimal value2);
}
