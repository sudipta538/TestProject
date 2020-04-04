package day14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Helper {
	
	
	public static boolean isLinkBroken(String url)
	{
		
		boolean status=false;
		
		System.out.println("Sending request to server for"+url);
		System.out.println("Waiting for response code");
		
		HttpURLConnection httpurlconnection=null;
		
		try {
			
			httpurlconnection=(HttpURLConnection) new URL(url).openConnection();
			
			httpurlconnection.setConnectTimeout(150000);
			
			httpurlconnection.connect();
			
			System.out.println("Response code is :"+httpurlconnection.getResponseCode());
			
			if(httpurlconnection.getResponseCode()==HttpURLConnection.HTTP_OK||httpurlconnection.getResponseCode()==201
			  ||httpurlconnection.getResponseCode()==202
			  ||httpurlconnection.getResponseCode()==204
			  ||httpurlconnection.getResponseCode()==301
			  ||httpurlconnection.getResponseCode()==302)
			{
				
			}
			
			else
			{
				status=true;
			}
			
		   } catch(MalformedURLException e) {
			System.out.println("Exception trace is "+e.getMessage() );
		 
		   }catch(IOException e) {
			System.out.println("Exception trace is "+e.getMessage() ); 
			   
		   }
		
		return status;
		
	}

}
