package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenimageDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement>allSocialIconsImages=driver.findElements(By.xpath("//div[@id='social-icons']//a/img"));
		
		for(WebElement ele:allSocialIconsImages)
		{
			String url=ele.getAttribute("src");
			
			if(Helper.isLinkBroken(url))
			{
				System.out.println("Image is Broken");
				}
			else {
				System.out.println("Image is not Broken");
			}
		}
           driver.quit();
	}

}
