package de.pifrasso.fileRead;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader in =null;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream("text.csv")));
			  String line;
			  while((line = in.readLine()) != null) {
			    System.out.println("line:"+line);
			  }
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				 
				  try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}

}
