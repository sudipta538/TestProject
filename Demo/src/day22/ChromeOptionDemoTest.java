package day22;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeOptionDemoTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		
		Map<String,Object> prefs= new HashMap<String,Object>();
		
		prefs.put("credential_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		
		//prefs.put("profile.default_content_setting_value.notifications",2);
		
		opt.setExperimentalOption("prefs", prefs);
		
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(opt);
		
		System.out.println("LOG:INFO:Session Started");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		System.out.println("LOG:INFO:Application loaded");
		
		System.out.println("Title is "+driver.getTitle());
		
	}

}
