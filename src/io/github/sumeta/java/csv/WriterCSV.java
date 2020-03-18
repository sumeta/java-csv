package io.github.sumeta.java.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriterCSV {

	public static void main(String[] args) throws IOException {
		
		System.out.println("--> Start Writer CSV");
		
		List<List<String>> rows = Arrays.asList(
		    Arrays.asList("1", "Sumeta", "Firstname"),
		    Arrays.asList("2", "Pongpanna", "Lastname"),
		    Arrays.asList("3", "Top", "Nickname")
		);
		
		FileWriter csvWriter;
		
		csvWriter = new FileWriter("export\\data.csv");
		csvWriter.append("Code");
		csvWriter.append(",");
		csvWriter.append("Name");
		csvWriter.append(",");
		csvWriter.append("Detail");
		csvWriter.append("\n");
		
		for (List<String> rowData : rows) {
		    csvWriter.append(String.join(",", rowData));
		    csvWriter.append("\n");
		}

		csvWriter.flush();
		csvWriter.close();
		
		System.out.println("--> End Writer CSV");
		
	}
}
