package testNGDependency;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test (dependsOnMethods = {"Test2"})
	public void Test1() {
		System.out.println("I m inside Test 1");
	}
	
	@Test (dependsOnGroups = {"TNR"})
	public void Test2() {
		System.out.println("I m inside Test 2");
	}
	
	@Test (groups = {"TNR"})
	public void Test3() {
		System.out.println("I m inside Test 3");
	}

}
