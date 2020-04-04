package day20;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement src=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(src).perform();
		
		List<WebElement>alloptions=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		for(WebElement ele:alloptions)
		{
			String toolName=ele.getText();
			System.out.println("Name is :"+toolName);
			if(toolName.equals("TestNG"))
			{
				ele.click();
				break;
			}
		}
		
		
		
		
		

	}

}
