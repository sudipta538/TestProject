package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdrpdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Tutorial')]")).click();
		
		List<WebElement>allvalues=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a "));
		
		for(WebElement ele:allvalues)
		{
			System.out.println(ele.getText());
			if(ele.getText().contains("JavaScript"))
			{
				ele.click();
				break;
			}
		}

	}

}
