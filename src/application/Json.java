package application;

import java.util.ArrayList;
import java.lang.Object.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class Json {
	
	public static String JSONEncode(ArrayList<Product> tempProductArray ) {
		
		Gson gson = new Gson();
		String gsonArray = gson.toJson(tempProductArray);
		return gsonArray;
		
	}
	
	public static ArrayList<Product> JSONDecode(String tempGsonArray ) {
		ArrayList<Product> productArray = null;
		Gson gson = new Gson(); 
		productArray = gson.fromJson(tempGsonArray, new TypeToken<ArrayList<Product>>(){}.getType());
		
		
		
				//new ArrayList<Product>();
		//JsonArray jArray = new JsonArray();
		
		
		
		
		return productArray;
	}
	
	public static void main(String[] args) {
		Product product0 = new Product("hi", "123", 0, "blue", 1, 1, 1, 1, 1, 1, "");
		Product product1 = new Product("hello", "456", 0, "red", 2, 2, 2, 2, 2, 2, "");
		ArrayList<Product> productArray = new ArrayList<Product>();
		productArray.add(product0);
		productArray.add(product1);
		
		String temp = JSONEncode(productArray);
		System.out.println(temp);
		
		
		
//		ArrayList<Product> ahha = JSONDecode(temp);
//		System.out.println(ahha.get(1));
//		
		
		
		
	}

}
