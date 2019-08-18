package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {

	WebDriver driver;

	@BeforeTest
	public void set_up_test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test(dataProvider = "Test1Data")
	public void test1(String UserName, String Password) throws Exception {
		// System.out.println(UserName + '|' + Password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Thread.sleep(2000);

	}

	@DataProvider(name = "Test1Data")
	public Object[][] getData() {
		String excelpath = "C:/Users/OPERAM009/Desktop/Projets Java/SeleniumFramWork/Excel/Data.xlsx";
		Object[][] Data = TestData(excelpath, "Feuil1");
		return Data;
	}

	public Object[][] TestData(String excelpath, String sheetname) {
		ExcelUtils excel = new ExcelUtils(excelpath, sheetname);

		int rowcount = excel.getRowCount();
		int colcount = excel.getcolCount();

		Object Data[][] = new Object[rowcount - 1][colcount];
		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {

				String CellData = excel.getCellDataString(i, j);
				Data[i - 1][j] = CellData;
				// System.out.print(CellData + '|');

			}

			// System.out.println();

		}
		return Data;

	}

}
