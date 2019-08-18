package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagePOM.GoogleElementsSearch;

public class GoogleSearchPOM {
	
	static WebDriver driver ;

	public static void main(String[] args) {

		googlerecherche();
		
	}
	
	public static void googlerecherche() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.fr");
		
		GoogleElementsSearch.google_textbox_search(driver).sendKeys("Hamza MARZOUK");
		GoogleElementsSearch.google_button_search(driver).sendKeys(Keys.ENTER);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
		
		System.out.println("Test Completed Successfully !!");
	}

}
