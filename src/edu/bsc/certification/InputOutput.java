package edu.bsc.certification;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 *  System.out.println("Enter your Name");
		 * // System.out.println(sc.next()); String name = sc.nextLine();
		 * System.out.println(name);
		 */
		
		
		Path file = FileSystems.getDefault().getPath("C:\\bqsa\\workspace\\JavaCertification\\src\\edu\\bsc\\certification","file.txt");
		List<String> lines = Files.readAllLines(file);
		
		for ( String line:lines) {
			
			System.out.println(line);
		}
		
		lines.forEach((str)-> System.out.println(str));
		
		lines.forEach((str) ->System.out.println(str));
		
	}

}
