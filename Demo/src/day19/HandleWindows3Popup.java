package day19;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows3Popup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
		
		String parentWindowId= driver.getWindowHandle();
		
		Set<String>allWindows=driver.getWindowHandles();
		
		System.out.println("Total count is :"+allWindows.size());
		
		Iterator<String> itr=allWindows.iterator();
		
		while(itr.hasNext())
		{
		String str=itr.next();
		if(!parentWindowId.equals(str))
		{
			driver.switchTo().window(str);
			
			System.out.println("Title is :"+driver.getTitle());
			System.out.println("URL is :"+driver.getCurrentUrl());
			driver.close();
		}
		
			
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Title page is "+driver.getTitle());
		

	}

}
