package day18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println("Page Loaded");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		Thread.sleep(3000);
		
		Alert alt= driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		String aleText=alt.getText();
		
		if(aleText.contains("user name"))
				{
			System.out.println("Passed");
				}
				
		else
		{
			System.out.println("Failed");
		}

		alt.accept();
	}

}
