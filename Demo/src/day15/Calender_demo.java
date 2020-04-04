package day15;






import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		driver.findElement(By.id("datepicker")).click();
		
		List<WebElement>elements=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		
		
		for(WebElement ele:elements)
		{
			if(ele.getText().equalsIgnoreCase("20"))
			{
				ele.click();
				break;
			}
		}
		
		Thread.sleep(30000);
		driver.quit();

	}

}
