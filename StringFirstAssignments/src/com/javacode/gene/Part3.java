package com.javacode.gene;

public class Part3 {
	public static boolean twoOccurrences(String stringa, String stringb)
	{
		int startIndex = 0;
		int stopIndex = 0;
		
		startIndex = stringb.indexOf(stringa);
		
		// check for stringa in string b
		if (startIndex == -1) {
				return false;
			}
		
		stopIndex = stringb.indexOf(stringa, startIndex+stringa.length());
		
		if (stopIndex == -1) 
			return false;
		else
			return true;
	}
	
	public static String lastPart (String stringa, String stringb)
	{
		int straIndex = stringb.indexOf(stringa);
		
		if (straIndex == -1 )
		{
			return  stringb;
		}
		
		return stringb.substring(straIndex+stringa.length(), stringb.length());
	}
	
}
