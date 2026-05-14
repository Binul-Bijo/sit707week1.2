package web.service;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for MathQuestionService.
 * Student: Binul Bijo
 */
public class TestMathQuestionService {

	@Test
	public void testQ1AdditionPositiveNumbers() {
		Assert.assertEquals(3.0, MathQuestionService.q1Addition("1", "2"), 0.01);
	}

	@Test
	public void testQ1AdditionDecimalNumbers() {
		Assert.assertEquals(5.5, MathQuestionService.q1Addition("2.5", "3.0"), 0.01);
	}

	@Test
	public void testQ1AdditionNegativeNumbers() {
		Assert.assertEquals(-3.0, MathQuestionService.q1Addition("-1", "-2"), 0.01);
	}

	@Test
	public void testQ2SubtractionPositiveNumbers() {
		Assert.assertEquals(2.0, MathQuestionService.q2Subtraction("5", "3"), 0.01);
	}

	@Test
	public void testQ2SubtractionNegativeResult() {
		Assert.assertEquals(-2.0, MathQuestionService.q2Subtraction("3", "5"), 0.01);
	}

	@Test
	public void testQ3MultiplicationPositiveNumbers() {
		Assert.assertEquals(15.0, MathQuestionService.q3Multiplication("5", "3"), 0.01);
	}

	@Test
	public void testQ3MultiplicationWithZero() {
		Assert.assertEquals(0.0, MathQuestionService.q3Multiplication("5", "0"), 0.01);
	}

	@Test(expected = NumberFormatException.class)
	public void testQ1AdditionEmptyInput() {
		MathQuestionService.q1Addition("", "2");
	}

	@Test(expected = NumberFormatException.class)
	public void testQ2SubtractionTextInput() {
		MathQuestionService.q2Subtraction("abc", "2");
	}

	@Test(expected = NumberFormatException.class)
	public void testQ3MultiplicationEmptyInput() {
		MathQuestionService.q3Multiplication("5", "");
	}
}