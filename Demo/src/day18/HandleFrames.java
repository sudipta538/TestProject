package day18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		System.out.println("Test1");
		
		driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		
		System.out.println("Test2");
		
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		
		System.out.println("Test3");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[contains(@src, 'offerType=PaymentOffer')]"));
		
		driver.switchTo().frame(frame);
		
		System.out.println("Switch to frame");
		
		driver.findElement(By.xpath("//div[@class='social-acc-box']//div[@class='facebook-text']")).click();
		
	}

	}


