package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopUtilsTest {

	@Test
	public void testSumNumbers() {
		Assert.assertEquals(15, LoopUtils.sumNumbers(5));
	}

	@Test
	public void testSumNumbersWithZero() {
		Assert.assertEquals(0, LoopUtils.sumNumbers(0));
	}

	@Test
	public void testCountEvenNumbers() {
		Assert.assertEquals(2, LoopUtils.countEvenNumbers(5));
	}

	@Test
	public void testCountEvenNumbersWithZero() {
		Assert.assertEquals(0, LoopUtils.countEvenNumbers(0));
	}
}