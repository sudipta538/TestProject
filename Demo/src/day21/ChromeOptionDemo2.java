package day21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptionDemo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium_setup\\\\chromedriver_win32\\\\chromedriver.exe");
		
		System.out.println("LOG:INFO:Driver path set");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		System.out.println("LOG:INFO:Browser property changed");
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.setAcceptInsecureCerts(true);
		
		opt.merge(cap);
		
		WebDriver driver=new ChromeDriver();
		
		System.out.println("LOG:INFO:Session Started");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		System.out.println("LOG:INFO:Application loaded");
		
		System.out.println("Title is "+driver.getTitle());
		
		
		
		
		
		
		
		
		
		

	}

}
