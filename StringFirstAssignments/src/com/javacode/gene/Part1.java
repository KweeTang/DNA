package com.javacode.gene;

public class Part1 {
	public static String findSimpleGene(String dna)
	{
		// Start Codon = "ATG"
		// Stop Codon = "TAA"
		/*
		String result = "";
		int startIndex = 0;
		int stopIndex = 0;
		*/
		
		String result;
		int startIndex;
		int stopIndex;
		
		if (dna.toUpperCase().equals(dna))
			startIndex = dna.indexOf("ATG");
		else
			startIndex = dna.indexOf("atg");
	
		if (startIndex == -1)
			{
				return "ATG missing";
			}
		
		if (dna.toUpperCase().equals(dna))
			stopIndex = dna.indexOf("TAA", startIndex+3);
		else
			stopIndex = dna.indexOf("taa", startIndex+3);
		
		if (stopIndex == -1)
			{
				return "TAA missing";
			}
		
		result= dna.substring(startIndex, stopIndex+3);
		
		if ( (result.length() % 3) == 0)
			return result;
		else
			return "Malformed Codon";
	}
}
