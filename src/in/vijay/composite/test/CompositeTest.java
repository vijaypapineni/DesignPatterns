package in.vijay.composite.test;

import static org.junit.Assert.assertEquals;
import in.vijay.composite.Adder;
import in.vijay.composite.Constant;
import in.vijay.composite.Divider;
import in.vijay.composite.Expression;
import in.vijay.composite.Multiplier;
import in.vijay.composite.Subtracter;

import org.junit.Test;

public class CompositeTest {

	@Test
	public void testConstant() {
		double testValue = 3.0;
		Expression e = new Constant(testValue);
		assertEquals(testValue, e.getValue(), 0.0);
	}

	@Test
	public void testAdder() {
		double valueA = 5.0;
		double valueB = 6.0;
		Expression left = new Constant(valueA);
		Expression right = new Constant(valueB);
		Expression e = new Adder(left, right);
		assertEquals((valueA + valueB), e.getValue(), 0.0);
	}

	@Test
	public void testSubtracter() {
		double valueA = 5.0;
		double valueB = 6.0;
		Expression left = new Constant(valueA);
		Expression right = new Constant(valueB);
		Expression e = new Subtracter(left, right);
		assertEquals((valueA - valueB), e.getValue(), 0.0);
	}

	@Test
	public void testMultiplier() {
		double valueA = 5.0;
		double valueB = 6.0;
		Expression left = new Constant(valueA);
		Expression right = new Constant(valueB);
		Expression e = new Multiplier(left, right);
		assertEquals((valueA * valueB), e.getValue(), 0.0);
	}

	@Test
	public void testDivider() {
		double valueA = 5.0;
		double valueB = 6.0;
		Expression left = new Constant(valueA);
		Expression right = new Constant(valueB);
		Expression e = new Divider(left, right);
		assertEquals((valueA / valueB), e.getValue(), 0.0001);
	}

	@Test
	public void testComplex() {
		assertEquals(((5.0 * 6.0) + 3.0) / (7.0 + 8.0), (new Divider(new Adder(
				new Multiplier(new Constant(5.0), new Constant(6.0)),
				new Constant(3.0)), new Adder(new Constant(7.0), new Constant(
				8.0)))).getValue(), 0.001);
	}
}
