package testNGRetryfaildTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

public class TestNGRetryFaildTest {
	
	@Test
	public void Test1() {
		System.out.println(" I m inside Test 1");
	}
	
	@Test
	public void Test2() {
		System.out.println(" I m inside Test 2");
	}
	
	@Test(retryAnalyzer = MyRetry.class)
	public void Test3() {
		System.out.println(" I m inside Test 3");
		Assert.assertTrue(0>3);
	}


}
