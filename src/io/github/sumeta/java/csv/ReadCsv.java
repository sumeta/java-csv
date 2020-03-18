package io.github.sumeta.java.csv;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadCsv {
	
	public static void main(String[] args) {
		String row = "";
		BufferedReader csvReader;
		try {
			csvReader = new BufferedReader(new FileReader("import\\data.csv"));
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    System.out.println("===================================================================");
			    System.out.print("Col1 : " + data[0]);
			    System.out.print("Col2 : " + data[1]);
			    System.out.print("Col3 : " + data[2]);
			    System.out.print("Col4 : " + data[3]);
			    System.out.println("Col5 : " + data[4]);
			}
			csvReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
