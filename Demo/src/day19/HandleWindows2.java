package day19;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parentWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on twitter')]")).click();
		
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on Facebook')]")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		ArrayList<String>allTabs=new ArrayList<String>(allwindows);
		
		driver.switchTo().window(allTabs.get(1));
		System.out.println("Current URL is : "+driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.switchTo().window(allTabs.get(2));
		System.out.println("Current URL is:"+driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.switchTo().window(allTabs.get(0));
		System.out.println("Current URL is :"+driver.getCurrentUrl());
			

	}

}
