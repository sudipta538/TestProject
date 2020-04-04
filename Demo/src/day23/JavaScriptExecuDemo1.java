package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		WebElement element=driver.findElement(By.xpath(("(//div[@id='content-3']//input)[2]")));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		driver.findElement(By.xpath("(//div[@id='content-3']//input)[2]")).clear();
		
		driver.findElement(By.xpath("(//div[@id='content-3']//input)[2]")).sendKeys("Selenium");
		
		
		Thread.sleep(30000);
		driver.quit();
		

	}

}
