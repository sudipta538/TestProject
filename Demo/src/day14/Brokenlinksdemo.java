package day14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Brokenlinksdemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		HttpURLConnection httpurlconnection=(HttpURLConnection) new URL("http://www.google.com").openConnection();
		
		httpurlconnection.connect();
		
		System.out.println("Responde code is"+ httpurlconnection.getResponseCode());
		
		if(httpurlconnection.getResponseCode()== HttpURLConnection.HTTP_OK)
		{
			System.out.println("Link is Working");
		}
		
		else
		{
			System.out.println("Link is not Working");
		}
	}

	}
