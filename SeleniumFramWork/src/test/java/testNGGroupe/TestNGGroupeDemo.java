package testNGGroupe;

import org.testng.annotations.Test;

@Test(groups = {"AllCallTest"})
public class TestNGGroupeDemo {

	@Test (groups = {"regression"})
	public void Test1() {
		System.out.println("this is test 1");
	}
	
	@Test(groups = {"regression","Infinity"})
	public void Test2() {
		System.out.println("this is test 2");
	}
	
	@Test(groups = {"Talent"})
	public void Test3() {
		System.out.println("this is test 3");
	}
	
	@Test(groups = {"Windows.regression"})
	public void Test4() {
		System.out.println("this is test 4");
	}
	
}
	

