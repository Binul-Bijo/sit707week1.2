package web.service;

/**
 * Math question service for SIT707 Task 8.1P STEM game.
 * Student: Binul Bijo
 */
public class MathQuestionService {

	public static double q1Addition(String number1, String number2) {
		double n1 = Double.valueOf(number1);
		double n2 = Double.valueOf(number2);
		return n1 + n2;
	}

	public static double q2Subtraction(String number1, String number2) {
		double n1 = Double.valueOf(number1);
		double n2 = Double.valueOf(number2);
		return n1 - n2;
	}

	public static double q3Multiplication(String number1, String number2) {
		double n1 = Double.valueOf(number1);
		double n2 = Double.valueOf(number2);
		return n1 * n2;
	}
}