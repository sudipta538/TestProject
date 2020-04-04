package day18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlerWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

}
