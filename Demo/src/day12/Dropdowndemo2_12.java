package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo2_12 {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
     
     WebDriver Driver=new ChromeDriver();
     
     Driver.get("https://facebook.com");
     
     Select value=new Select(Driver.findElement(By.id("month")));
     
     value.selectByVisibleText("Jan");
     
     System.out.println(value.getFirstSelectedOption().getText().contains("Jan"));
     
     if(value.getFirstSelectedOption().getText().contains("Jan"))
     
     {
     System.out.println("passed");
     }
    	 
     else
     {
    	 System.out.println("Failed");
     }
     
     	
	}

}
