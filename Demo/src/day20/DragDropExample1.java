package day20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExample1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Thread.sleep(3000);
		
		WebElement src=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		
		WebElement dest=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		
		Actions act=new Actions(driver);
		
		//perform method is must for actions class event
		
		act.dragAndDrop(src,dest).perform();
		
		
		

	}

}
