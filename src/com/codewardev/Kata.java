package com.codewardev;

// https://www.codewars.com/kata/find-the-missing-letter/train/java

public class Kata {

	public static char findMissingLetter(char[] array) {
		char[] alphabets = {'a', 'b', 'c', 'd', 'e',
		                    'f', 'g', 'h', 'i', 'j',
		                    'k', 'l', 'm', 'n', 'o',
		                    'p', 'q', 'r', 's', 't',
		                    'u', 'v', 'w', 'x', 'y',
		                    'z'};
		boolean isLower = true;
		if(Character.isUpperCase(array[0])) {
			array = String.valueOf(array).toLowerCase().toCharArray();
			isLower = false;
		}
		
		char found = ' ';
		int started=0;
		for(int i=0; i<alphabets.length; i++) {
			System.out.println("Compare: "+alphabets[i]+" and "+array[started]);
			if(started == 0 && alphabets[i] == array[started]) {
				started++;
			} else
			if(started != 0 && alphabets[i] != array[started]) {
				found = alphabets[i];
				break;
			} else
			if(started != 0 && alphabets[i] == array[started]){
				started++;
			}
		}
		return !isLower ? Character.toUpperCase(found): found;
	}

}
