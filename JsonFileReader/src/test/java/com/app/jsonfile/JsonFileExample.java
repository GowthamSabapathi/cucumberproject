package com.app.jsonfile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileExample {
	public static void readprogram()
	{
		
		try {
			File f=new File("C:\\Users\\eximt\\Downloads\\eclipse-jee-2022-12-R-win32-x86_64\\eclipse\\API\\JsonFileReader\\src\\test\\resources\\TestData\\test.json");
			FileReader read=new FileReader(f);
			JSONParser jpar=new JSONParser();
			Object obj=jpar.parse(read);
			JSONObject jobj=(JSONObject)obj;
			String name=jobj.get("name").toString();
			System.out.println(name);
			String age=jobj.get("age").toString();
			System.out.println(age);
			JSONArray jary=(JSONArray)jobj.get("bike");
			for(Object x:jary) {
				System.out.println(x);
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		
	}
	
	public static void main(String[] args) {
		readprogram();	
	}
}
