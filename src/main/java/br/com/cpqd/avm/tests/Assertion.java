package br.com.cpqd.avm.tests;

import org.json.JSONArray;
import org.json.JSONObject;

public class Assertion {

	public static boolean responseText(String jsonResponse, String message) {
		JSONObject jsonObject = new JSONObject(jsonResponse);
		return responseText(jsonObject, message);
	}
	
	public static boolean responseText(JSONObject jsonResponse, String message) {
		boolean out = false;
		System.out.println("json >>> " + jsonResponse);
		
		if (jsonResponse.has("responses")) {
			JSONArray jsonArray = jsonResponse.getJSONArray("responses");
			
			System.out.println("jsonArray >>> " + jsonArray);
			
			for (Object object : jsonArray) {
				JSONObject jsonObject = new JSONObject(object);
				
				System.out.println("jsonObject >>> " + jsonObject);
				
				String text = jsonObject.getString("text");
				if (text.contains(message)) {
					out = true;
				}
			}
		}
		return out;
	}

	public static boolean responseStatus(String jsonResponse) {
		JSONObject jsonObject = new JSONObject(jsonResponse);
		return responseStatus(jsonObject);
	}

	public static boolean responseStatus(JSONObject jsonResponse) {
		boolean out = false;
		if (jsonResponse.has("status")) {
			out = jsonResponse.getBoolean("status");
		}
		return out;
	}

}
