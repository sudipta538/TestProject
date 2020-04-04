package day19;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String parentWindowId=driver.getWindowHandle();
		
		System.out.println("Parent is: "+parentWindowId);
		
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on twitter')]")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> itr=allWindows.iterator();
		
		
		
		while(itr.hasNext())
		{
			String windows = itr.next();
			System.out.println("Widnows are: " + windows);
			
			if(!parentWindowId.equals(windows))
			{
				driver.switchTo().window(windows);
				
				System.out.println("Title is :" +driver.getTitle());
				
				System.out.println("URL is :"+driver.getCurrentUrl());
				
				driver.findElement(By.xpath("//span[text()='Log in']")).click();
				
				driver.close();
			}
		}
		
		Thread.sleep(3000);
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		

	}

}
