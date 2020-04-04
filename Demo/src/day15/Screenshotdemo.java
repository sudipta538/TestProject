package day15;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotdemo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");

		TakesScreenshot ts=(TakesScreenshot)driver; 
			
		File scr=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Screenshot\\2.png");
		
		
	   FileHandler.copy(scr, dest);
		
			}
		
	}


