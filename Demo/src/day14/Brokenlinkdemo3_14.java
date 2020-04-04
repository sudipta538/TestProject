package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinkdemo3_14 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement>allSocialIcons=driver.findElements(By.xpath("//div[@id='social-icons']//a"));
		
		for(WebElement ele:allSocialIcons)
		{
			String url=ele.getAttribute("href");
			
			
			if(Helper.isLinkBroken(url))
			{
				System.out.println("Link is Broken");
				
			}
			
			else
			{
				System.out.println("Link is not Broken");
			}
		}
		
        driver.quit();
	}

}
