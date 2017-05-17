package com.javacode.gene;

public class Part1 {
	public static int findStopCodon(String dna, int startIndex, String stopCodon)
	{
		// Find stopCodon starting from startIndex + 3
		int currIndex = dna.indexOf(stopCodon, startIndex+3);
		
		// returns the index of the first occurrence of stopCodon that appears past startIndex and is a multiple of 3 away from startIndex
		// As long as currIndex != 1
		while(currIndex != -1){
			// If (currIndex - startIndex) is a multiple of 3
			if ((currIndex - startIndex) % 3 == 0)
			{
				return  currIndex;
			}
			else { // CurrIndex - startIndex is not multiple of 3
				   // Search for next stopCodon
			       currIndex = dna.indexOf(stopCodon, currIndex +1 );	
			}		
		}
		// No stopCodon Found thus returning the dna length.
		return dna.length();
	}
	
	public static String findGene(String DNA)
	{
		// Find the index of the first occurrence of the startCodon “ATG”. If there is no “ATG”, return the empty string.
		int startIndex;
		int taaIndex;
		int tagIndex;
		
		startIndex = DNA.indexOf("ATG");
	
		// If "ATG not found, Return "" 
		if (startIndex == -1)
		{
			return "";
		} 
		else {		
				taaIndex = findStopCodon(DNA, startIndex, "TAA");
				tagIndex = findStopCodon(DNA, startIndex, "TAG");
			
				if (taaIndex != DNA.length() || tagIndex != DNA.length())
				{
					if (taaIndex < tagIndex )
						return DNA.substring(startIndex, taaIndex+3);
					else
						return DNA.substring(startIndex, tagIndex+3);
				}
				else
					return "";	
		}
		
	}
}
