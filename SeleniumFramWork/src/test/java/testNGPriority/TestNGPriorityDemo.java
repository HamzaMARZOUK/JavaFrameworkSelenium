package testNGPriority;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority = 1)
	public void Test1 () {
		System.out.println("----I m inside Test 1");
		
	}
	
	@Test(priority = 3)
	public void Test2 () {
		System.out.println("----I m inside Test 2");
	}
	
	@Test(priority = -1)
	public void Test3 () {
		System.out.println("----I m inside Test 3");
	}

}
