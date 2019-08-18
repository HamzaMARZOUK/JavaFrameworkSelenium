package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenersDemo2 {

	@Test
	public void Test4() {
		System.out.println("I m inside Test 4");
		
	}
	
	@Test
	public void Test5() {
		System.out.println("I m inside Test 5");
		Assert.assertTrue(false);

	}
	
	@Test
	public void Test6() {
		System.out.println("I m inside Test 6");
		throw new SkipException("this test is skipped");

	}
}
