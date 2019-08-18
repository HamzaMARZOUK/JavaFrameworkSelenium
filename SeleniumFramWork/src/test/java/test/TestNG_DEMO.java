package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagePOM.GoogleElementsSearch;

public class TestNG_DEMO {

	WebDriver driver;

	@BeforeTest
	public void set_up_test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void Run_test() {

		driver.get("https://www.google.fr");

		GoogleElementsSearch.google_textbox_search(driver).sendKeys("Hamza MARZOUK");
		GoogleElementsSearch.google_button_search(driver).sendKeys(Keys.ENTER);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@AfterTest
	public void close_test() {
		driver.close();
		driver.quit();

		System.out.println("Test Completed Successfully !!");
	}

}
