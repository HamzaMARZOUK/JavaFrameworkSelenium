package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportDemo {

	static WebElement textBox;
	public static void main(String[] args) {
		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test1 = extent.createTest("Google Search Test one",
				"This is a test to validate google search fonctionnality");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// log(Status, details)
		test1.log(Status.INFO, "Starting Test Case");

		driver.get("https://www.google.fr");
		test1.pass("Navigated to google.com");

		textBox = driver.findElement(By.xpath("//input[@name='q']"));
		textBox.sendKeys("Hamza MARZOUK");
		test1.pass("Entered text in searchbox");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		test1.pass("Pressed Keybord enter key");

		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		// info(details)
		test1.info("Test completed");
		
		
		
		// creates a toggle for the given test, adds all log events under it
				ExtentTest test2 = extent.createTest("Google Search Test Two",
						"This is a test to validate google search fonctionnality");
				WebDriverManager.chromedriver().setup();
				WebDriver driver2 = new ChromeDriver();

				

				// log(Status, details)
				test2.log(Status.INFO, "Starting Test Case");

				driver2.get("https://www.google.fr");
				test2.pass("Navigated to google.com");

				textBox = driver2.findElement(By.xpath("//input[@name='q']"));
				textBox.sendKeys("Hamza MARZOUK");
				test2.pass("Entered text in searchbox");

				driver2.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
				test2.fail("Pressed Keybord enter key");

				driver2.close();
				driver2.quit();
				test2.pass("Closed the browser");
				// info(details)
				test2.info("Test completed");

	
		// calling flush writes everything to the log file
		extent.flush();

	}

}
