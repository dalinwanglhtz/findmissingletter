package com.codewardev;

// https://www.codewars.com/kata/find-the-missing-letter/train/java

public class Kata {

	public static char findMissingLetter(char[] array) {

		int thisChar = array[0];
		for(int i=0; i<array.length; i++) {
			if(thisChar != array[i]) return (char) thisChar;
			thisChar++;
		}
		
		return ' ';
	}

}
