package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s224950824";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Binul Bijo";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testTrueNumberIsEven() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(4));
	}
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(5));
	}
	
	@Test
	public void testPrimeNumber() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
	}
	
	@Test
	public void testNonPrimeEvenNumber() {
		Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
	}
	
	@Test
	public void testOneIsPrimeAccordingToGivenCode() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
	}
	
	@Test
	public void testCancelWeatherAdviceByWindSpeed() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
	}
	
	@Test
	public void testCancelWeatherAdviceByRainfall() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.1));
	}
	
	@Test
	public void testCancelWeatherAdviceByBothConcerning() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(45.1, 4.1));
	}
	
	@Test
	public void testWarnWeatherAdviceByWindSpeed() {
		Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.1, 0.0));
	}
	
	@Test
	public void testWarnWeatherAdviceByRainfall() {
		Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(0.0, 4.1));
	}
	
	@Test
	public void testAllClearWeatherAdvice() {
		Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 2.0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeWeatherInput() {
		WeatherAndMathUtils.weatherAdvice(-1.0, 2.0);
	}
}