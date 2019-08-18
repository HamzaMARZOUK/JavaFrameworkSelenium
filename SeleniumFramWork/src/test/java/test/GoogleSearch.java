package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) {

		googlerecherche();
		
	}
	
	public static void googlerecherche() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.fr");
		WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		textBox.sendKeys("Hamza MARZOUK");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		System.out.println("Test Completed Successfully !!");
		
	}

}
