package com.jbd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) throws Exception {
		
		//goal: taking input from one file and remove dupliates and storing in another file
		//taking input from file
		BufferedReader br = new BufferedReader(new FileReader("E://digvijay very imp//Java2020//DataStructureAssignment4//input.txt"));
		PrintWriter pw = new PrintWriter("E://digvijay very imp//Java2020//DataStructureAssignment4//output.txt");
		
		String line = br.readLine();
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		while (line!=null) {
			if (lhs.add(line)) {
				pw.println(line);
			}
		}
		pw.flush();
		br.close();
		pw.close();
		
		System.out.println("Operation performed successfully");
		
	}
}
