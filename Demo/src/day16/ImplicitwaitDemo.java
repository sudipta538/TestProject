package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitwaitDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='Try it']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());
		
		
		
		
		
		
		

	}

}
