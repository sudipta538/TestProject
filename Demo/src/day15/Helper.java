package day15;


	
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

	public class Helper {
		
	
			public static String getCurrentDateTime()
			
			{
				SimpleDateFormat myFormat=new SimpleDateFormat("HH_mm_ss_dd_mm_yyyy");
				
				Date d=new Date();
				
				String date=myFormat.format(d);
				
				return date;
				
			}
				
				public static String CaptureScreenshot(WebDriver driver)
				{
				String path=System.getProperty("user.dir")+"\\Screenshots\\"+Helper.getCurrentDateTime()+".png";
				
				try
				{
					FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File(path));
					
				}
				
				catch(IOException e)
				{
					System.out.println("Exception trace is "+e.getMessage());
				}
				
				return path;
			}
			
		

	}



