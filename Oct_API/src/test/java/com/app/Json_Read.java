package com.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Read {
	
	public static void read() {
		try {
			File f = new File("src\\test\\resources\\TestData\\Google+Place+APIs.postman_collection.json");
			FileReader read = new FileReader(f);
			JSONParser jpar = new JSONParser();
			Object obj = jpar.parse(read);
			JSONObject jobj = (JSONObject)obj;
			String name = jobj.get("name").toString();
			System.out.println(name);
			String age = jobj.get("age").toString();
			System.out.println(age);
			JSONArray jar = (JSONArray)jobj.get("bike");
			for (Object x : jar) {
				System.out.println(x);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		read();
	}
}
