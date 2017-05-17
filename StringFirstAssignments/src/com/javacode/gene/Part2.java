package com.javacode.gene;

public class Part2 {
	public static String findSimpleGene(String dna, String startCodon, String stopCodon)
	{
		// Start Codon = "ATG"
		// Stop Codon = "TAA"
		String result = "";
		
		int startIndex = dna.indexOf("ATG");
		if (startIndex == -1)
			{
				return "ATG missing";
			}
		
		int stopIndex = dna.indexOf("TAA", startIndex+3);
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
