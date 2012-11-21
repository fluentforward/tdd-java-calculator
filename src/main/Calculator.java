import java.math.BigDecimal;


public class Calculator {

	private OperandStack stack = new OperandStack();
	
	public BigDecimal getAccumulator() {
		return stack.peek();
	}

	public void setAccumulator(BigDecimal value) {
		stack.replaceTop(value);
	}

	public void enter() {
		stack.push(getAccumulator());
	}

	public void drop() {
		stack.pop();
	}

	public void execute(String op) {
		Operation operation = null;
		if ("+".equals(op))
			operation = new AddOperation();
		else if ("-".equals(op))
			operation = new SubtractOperation();
		operation.apply(stack);
	}

}
