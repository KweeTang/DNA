package com.javacode.gene;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Part3Test {
	@Test
	public void testTwoOccurrences()
	{
		// "by" occurs more than once
		// assertTrue(Part3.twoOccurrences("by", "A story by Abby Long"));
		assertTrue(Part3.twoOccurrences("a", "banana"));
	}
	@Test
	public void testOneOccurrence()
	{
		// "by" occurs more than once
		// assertTrue(Part3.twoOccurrences("by", "A story by Long"));
		assertFalse(Part3.twoOccurrences("atg", "ctgtatgta"));
	}
	@Test
	public void testZeroOccurrence()
	{
		// "by" does not existing
		assertFalse(Part3.twoOccurrences("by", "A story Long"));
	}	
	
	@Test
	public void testFoundSubString()
	{
		System.out.println("Last Part: " + Part3.lastPart("an", "banana"));
	}
	
	@Test
	public void testNotFoundSubtring()
	{
		System.out.println("Last Part: " + Part3.lastPart("zoo", "forest"));
	}
	
}



