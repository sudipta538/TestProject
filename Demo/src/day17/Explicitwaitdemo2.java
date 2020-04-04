package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing_clock");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.titleContains("Editor"));
		
		wait.until(ExpectedConditions.urlContains("tryjs_timing_clock"));
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		
		//WebDriverWait wait= new WebDriverWait(driver, 20);
		
		System.out.println(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='22:17:00']"))).isDisplayed());
		
		
		
	    
		
		
		
		
		
		
		
		
		
		

	}

}
