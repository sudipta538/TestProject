package demoPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
		Test t = new Test();
		t.gitdemo();
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	
	public void gitdemo()
	{
		System.out.println("First Git chanage from Eclipse");
	}

}
