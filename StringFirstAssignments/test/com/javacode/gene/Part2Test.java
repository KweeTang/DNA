package com.javacode.gene;

import org.junit.*;

public class Part2Test {

	@Test
	public void testSimpleGene()
	{
		final String startCodon = "ATG";
		final String stopCodon = "TAA";
			
		String DNA1 = "ATGAAATTTGGGTTTTAA";
		System.out.println("DNA 1: " + DNA1);
		String DNA1Result1 = Part2.findSimpleGene(DNA1, startCodon, stopCodon);
		System.out.println("Gene in DNA1: " + DNA1Result1);
		
		String DNA2 = "AATGAAATTTGGGTTTTAAA";
		System.out.println("DNA 2: " + DNA2);
		String DNA1Result2 = Part2.findSimpleGene(DNA2, startCodon, stopCodon);
		System.out.println("Gene in DNA2: " + DNA1Result2);
		
		String DNA3 = "AATAAATTTGGGTTTTAAA";
		System.out.println("DNA 3: " + DNA3);
		String DNA1Result3 = Part2.findSimpleGene(DNA3, startCodon, stopCodon);
		System.out.println("Gene in DNA3: " + DNA1Result3);
		
		String DNA4 = "AATGAAATTTGGGTTTTA";
		System.out.println("DNA 4: " + DNA4);
		String DNA1Result4 = Part2.findSimpleGene(DNA4, startCodon, stopCodon);
		System.out.println("Gene in DNA4: " + DNA1Result4);
		
		String DNA5 = "ATGAATTTGGGTTTTAA";
		System.out.println("DNA 5: " + DNA5);
		String DNA1Result5 = Part2.findSimpleGene(DNA5, startCodon, stopCodon);
		System.out.println("Gene in DNA5: " + DNA1Result5);
	}
}
