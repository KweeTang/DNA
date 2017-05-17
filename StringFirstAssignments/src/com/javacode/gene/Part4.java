package com.javacode.gene;

import edu.duke.*;

public class Part4 {

	public static void ReadFromURL()
	{
		URLResource Resource = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
	
		for (String line: Resource.lines()) {
			System.out.println(line);
			for (String word: Resource.words())
			{
				
				System.out.println("Word: " + word);
			}
		}
	}
	
	
	public static void main(String[] args) {
	
		ReadFromURL();
		
	}
}
