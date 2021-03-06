package com.anqit.spanqit.constraint;

/**
 * A SPARQL Operation. Differs from a {@link Function} in the way operators and
 * arguments are printed.
 * 
 * @author Ankit
 *
 * @param <T> The type of operation. Used to support fluency.
 */
abstract class Operation<T extends Operation<T>> extends Expression<T> {
	protected int operandLimit;

	Operation(SparqlOperator operator) {
		this(operator, -1);
	}

	Operation(SparqlOperator operator, int operandLimit) {
		super(operator);
		this.operandLimit = operandLimit;
	}

	@SuppressWarnings("unchecked")
	// ugh, wish the compiler dug just a little deeper...
	T addOperand(ExpressionOperand operand) /* throws Exception */{
		if (operandLimit < 0 || elements.size() < operandLimit) {
			return super.addOperand(operand);
		}
		// TODO: throw exception for out of bounds
		// throw new Exception();
		return (T) this;
	}
}