package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {
	WebDriver driver;

	@Test
	public void Test1() {
		System.out.println("I m inside Test 1");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.fr");
		//Element inexistent
		driver.findElement(By.id("abc")).sendKeys(Keys.ENTER);

	}

	@Test
	public void Test2() {
		System.out.println("I m inside Test 2");
		Assert.assertTrue(false);
	}

	@Test
	public void Test3() {
		System.out.println("I m inside Test 3");
		throw new SkipException("this test is skipped");

	}
}
