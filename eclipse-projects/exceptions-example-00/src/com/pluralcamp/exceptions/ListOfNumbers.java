package com.pluralcamp.exceptions;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

	private List<Integer> list;
	private static final int SIZE = 10;
	
	public ListOfNumbers() {
		this.list = new ArrayList<Integer>(SIZE);
		for(int i = 0; i < SIZE; i++) {
			this.list.add(i * 3);
		}
	}
	
	public void writeList() throws MaintenanceException {
		FileWriter writer;
		try {
			writer = new FileWriter("output.txt");
			PrintWriter out = 
					new PrintWriter(writer);
			for (int i = 0; i < SIZE; i++) {
				out.println("Value at " + i + " = " + 
								this.list.get(i));
			}
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//System.err.println(e.getMessage());
			throw new MaintenanceException("Mantenimiento");
//			try {
//				throw new MaintenanceException("Mantenimiento");
//			} catch (MaintenanceException ex) {
//				System.out.println(ex.getMessage());
//			}
		} 
	}
}
