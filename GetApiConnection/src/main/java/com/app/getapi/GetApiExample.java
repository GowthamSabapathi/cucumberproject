package com.app.getapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

public class GetApiExample {

	public static void getMethod() {
		try {
			URL url = new URL("https://dummy.restapiexample.com/");
			HttpURLConnection Connection = (HttpURLConnection) url.openConnection();
			Connection.setRequestMethod("GET");
			Connection.connect();
			int statusCode = Connection.getResponseCode();
			System.out.println(statusCode);
			String message = Connection.getResponseMessage();
			System.out.println(message);
			InputStream is = Connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br=new BufferedReader(isr);
            String line;
            StringBuffer buffer=new StringBuffer();
            while((line=br.readLine())!=null) {
            	buffer.append(line);
            }
            System.out.println(buffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getMethod();
	}
}