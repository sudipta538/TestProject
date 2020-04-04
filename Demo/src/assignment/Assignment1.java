package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		/* Enter all details again */
		
		for(int i=0; i<=1; i++)
		{

			/*Open https://opensource-demo.orangehrmlive.com/index.php/dashboard */
			
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		/* Verify title contains HRM */

		String Title = driver.getTitle();

		System.out.println("Title is :" + Title);

		if (Title.contains("HRM")) {
			System.out.println("Title contain HRM");
		} else {
			System.out.println("Title does not contains HRM");
		}
		
		/* In footer section verify social icon presence */

		List<WebElement> icons = driver.findElements(By.xpath("//div[@id ='social-icons']//img"));

		for (WebElement ic : icons) {
			String y = ic.getAttribute("src");
			

			if (y.contains("linkedin.png"))

			{
				System.out.println("Linkedin icon is available");

			}

			else if (y.contains("facebook.png")) {
				System.out.println("Facebook icon is available");
			} else if (y.contains("twiter.png")) {
				System.out.println("Twitter icon is available");
			} else if (y.contains("youtube.png")) {
				System.out.println("Youtube icon is available");
			}

			else {
				System.out.println("icon is not available");
			}

		}
		
		/*Verify each social icon attribute (href)is pointing to correct platform*/
		 
		
		/* Login with valid credentials and verify welcome admin text */

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

		String text = driver.findElement(By.xpath("//a[@id='welcome']")).getText();

		// System.out.println(text);

		if (text.equals("Welcome Admin")) {
			
			System.out.println("Welcome admin text is available");

		}
		else
		{
			System.out.println("Welcome admin text is not available");
			
		}
		
		/* Click on PIM Tab */
		
	     driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
	     
	     String x= driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).getText();
	
		System.out.println(x);
		
		/* Enter FirstName, Middle name and last name */
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Suchi");
		
		driver.findElement(By.id("middleName")).sendKeys("Sarita");
		
		driver.findElement(By.id("lastName")).sendKeys("Mohapatra");
		
		/* Clear the EmpID Field and enter new EmpId */
		
		driver.findElement(By.id("employeeId")).clear();
		
		driver.findElement(By.id("employeeId")).sendKeys("0015");
		
		/* Upload any picture */
	
		driver.findElement(By.id("photofile")).sendKeys("D:\\sudipta\\camera.jpg");
		
		/* Verify Create Login Details checkbox is unchecked and check the same */
		
		WebElement logCheckin=driver.findElement(By.xpath("//input[@name='chkLogin']"));
		
		if(!logCheckin.isSelected())
		{
			logCheckin.click();
		}
		
		/* Verify Save button is present and capture the text of button and then click */
		
		WebElement btn=driver.findElement(By.xpath("//input[@value='Save']"));
		
		if(btn.isDisplayed())
		{
			System.out.println(btn.getAttribute("value"));
			btn.click();
			
		}
		

		Thread.sleep(10000);

		driver.quit();
		}

	}
}
