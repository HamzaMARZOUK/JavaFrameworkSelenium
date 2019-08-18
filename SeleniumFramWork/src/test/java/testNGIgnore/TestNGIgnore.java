package testNGIgnore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//package-info créé pour ignorer tous les tests


public class TestNGIgnore {
	@Ignore
	@Test
	public void Test1() {
		System.out.println("I m inside Test 1");
	}
	
	@Test
	public void Test2() {
		System.out.println("I m inside Test 2");
	}

}
