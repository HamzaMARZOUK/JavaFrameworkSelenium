package pagePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleElementsSearch {
	
	static WebElement element= null;
	static By textbox = By.name("q");
	static By searchbox = By.name("btnK");
	
	
	public static WebElement google_textbox_search(WebDriver driver){
		element =driver.findElement(textbox);
		return element;
				
	}
	
	public static WebElement google_button_search(WebDriver driver) {	
		element = driver.findElement(searchbox);
		return element;
		
		
	}

}
