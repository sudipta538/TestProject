package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        
        String str= driver.findElement(By.xpath("//span[text()='Username cannot be empty']")).getText();
        
        if(str.equals("Username cannot be empty"))
        {
        	System.out.println("User name is empty");
        }
        else
        {
        	System.out.println("User name is not empty");
        }
        
	}

}
