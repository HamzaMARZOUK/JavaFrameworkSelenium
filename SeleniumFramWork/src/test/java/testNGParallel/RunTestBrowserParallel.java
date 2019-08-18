package testNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunTestBrowserParallel {
	WebDriver driver;

	@Parameters("Browsername")
	@BeforeTest
	public void SetUp(String Browsername) {
		

		if (Browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (Browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (Browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

	}

	@Test
	public void Testbrowser() throws Exception {
		
		driver.get("https://google.com");
		Thread.sleep(3000);

	}

	@AfterTest
	public void TearDown() {
		
		driver.close();
		System.out.println("Test completed successfully");

	}

}
