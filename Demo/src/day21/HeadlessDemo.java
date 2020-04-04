package day21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		System.out.println("LOG:INFO: Driver path set");
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.setHeadless(true);
		
		System.out.println("LOG:INFO: Browser property changed");
		
		WebDriver driver=new ChromeDriver(opt);
		
		System.out.println("LOG:INFO: Session Started");
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/dblclick/");
		
		System.out.println("LOG:INFO: Application loaded");
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.quit();
		
	
	}

}
