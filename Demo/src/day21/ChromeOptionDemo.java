package day21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptionDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		System.out.println("LOG:INFO: Driver path set");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setAcceptInsecureCerts(true);
		
		System.out.println("Browser Property Changed");
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--disable--extensions");
		
		opt.addArguments("--disable--notifications");
		
		opt.setAcceptInsecureCerts(true);
		
		opt.merge(cap);
		
		WebDriver driver=new ChromeDriver(opt);
		
		System.out.println("LOG:INFO:Session Started");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		System.out.println("LOG:INFO:Application loaded");
		
		System.out.println("Title is "+driver.getTitle());
		
	}

}
