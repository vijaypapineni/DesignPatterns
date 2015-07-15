package in.vijay.composite;

public class Multiplier extends BinaryExpression {


	public Multiplier(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double getValue() {
		return left.getValue() * right.getValue();
	}

}
