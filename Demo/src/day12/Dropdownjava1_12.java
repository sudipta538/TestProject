package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownjava1_12 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://facebook.com");
		 
		WebElement monthDD=driver.findElement(By.id("month"));
		 
		 Select m_dd=new Select(monthDD);
		 
		 m_dd.selectByIndex(6);
		 
		 Thread.sleep(2000);
		 
		 m_dd.selectByValue("8");
		 
		 Thread.sleep(3000);
		 
		 m_dd.selectByVisibleText("Jan");
		 
		/* WebElement DD=driver.findElement(By.xpath("//select[@aria-label='Day"));
		 
		 Select Day=new Select(DD);
		 
		 Day.selectByIndex(9);
		 
		 Thread.sleep(2000);
		 
		 Day.selectByValue("8");
		 
		 Thread.sleep(2000);
		 
		 Day.selectByVisibleText("13");*/
		 
		 WebElement lastValue=m_dd.getFirstSelectedOption();
		 
		 String value=lastValue.getText();
		 
		 System.out.println("Value in last"+ value);
		 
		 if(value.contains("Jan"))
		 {
			 
			 System.out.println("passed");
		 }
		 
		 else
		 {
			 System.out.println("Failed");
		 }
		 
	
	}

}
