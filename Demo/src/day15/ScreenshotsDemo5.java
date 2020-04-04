package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import day15.Helper;

public class ScreenshotsDemo5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
	
		Helper.CaptureScreenshot(driver);
		
        driver.getTitle();
		
		driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
		
		Helper.CaptureScreenshot(driver);

		
		Thread.sleep(3000);
		
		new Actions(driver).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);

		
		Helper.CaptureScreenshot(driver);


		driver.quit();
	}

}
