package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Parser {
	
	public static ArrayList<Product> parser() throws FileNotFoundException{
		ArrayList<Product> productArray = null;
		Scanner input = new Scanner(new File("data/products_in.txt"));
		String inputString = input.next();
		
		productArray = Json.JSONDecode(inputString);
			
		input.close();
		return productArray;
	}
	
	public static void writer(ArrayList<Product> tempProductArray) throws IOException{
		try {
			Writer wr = null;
			File f = new File("data/products_in.txt");
			wr = new BufferedWriter(new FileWriter(f));
			
			String stringProduct = Json.JSONEncode(tempProductArray);
			wr.write(stringProduct);
			
			
			wr.close();
		}
		catch (IOException e){
			e.printStackTrace();
			
		}
		
		
		
	}
}
