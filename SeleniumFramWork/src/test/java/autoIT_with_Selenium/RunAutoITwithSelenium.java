package autoIT_with_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunAutoITwithSelenium {
	
	
	@Test
	public void Test() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("C:\\Users\\OPERAM009\\Desktop\\Projets Java\\Autoitselenuim.exe");
		Thread.sleep(3000);
		driver.close();

	}
	

}
