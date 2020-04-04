package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo3_12 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");	
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://facebook.com");
	
	Select value=new Select(driver.findElement(By.id("month")));
	
	List<WebElement>allValues=value.getOptions();
	
	System.out.println("allValues.size()");
	
	for(WebElement ele:allValues)
	
	{
		System.out.println(ele.getText());
		
		if (ele.getText().contains("Jan"))
		{
			System.out.println("value is present");	
			break;
		}
		
	}
	
	

	}

}
