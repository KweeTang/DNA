package com.javacode.gene;

import org.junit.Test;

public class Part1Test {
	
	@Test
	public void testFindStopCodon() {
		
		String dna = "testATGTAGHTAA";
		int startIndex = dna.indexOf("ATG");
		String stopCodon = "TAA";
			
		System.out.println(Part1.findStopCodon(dna, startIndex, stopCodon));
	}
	
	@Test
	public void testFindGene(){
		
		// No ATG
		String DNA1 = "DNAWithNo@TG";
		// ATG
		String DNA2 = "DNAWithATG";
		// ATG + 1 valid StopCodon
		String DNA3 = "DNAATGTAA";
		// ATG + Multiple valid stop codons
		String DNA4 = "DNAATGTAATAG";
		// ATG + No valid stop condons
		String DNA5 = "DNAATGABCDEFG";
				
		System.out.println(DNA1);
		System.out.println(Part1.findGene(DNA1));
		
		System.out.println(DNA2);
		System.out.println(Part1.findGene(DNA2));
		
		System.out.println(DNA3);
		System.out.println(Part1.findGene(DNA3));
		
		System.out.println(DNA4);
		System.out.println(Part1.findGene(DNA4));
		
		System.out.println(DNA5);
		System.out.println(Part1.findGene("DNA5"));
	}
}
