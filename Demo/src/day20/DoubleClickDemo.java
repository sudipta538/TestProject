package day20;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClickDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(0);
		
		WebElement src=driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body//div"));
		
		Actions act =new Actions(driver);
		
		act.doubleClick(src).perform();
		

	}

}
