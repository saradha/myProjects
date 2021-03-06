package com.bomber.remove.consecutive.character;

/**
 * Bomber algorithm to remove consecutive duplicate characters in a string
 * 
 * @author Saradha.M
 *
 */
public class BomberAlgorithm {

	public static void main(String[] args) {
		// String s = "abbabba";-case 1
		String s = "abcdeedcbfgf";// case 2
		// String s = "aabcccdee"; //case 3
		s = findSubString(s, 0, 1);
		System.out.println(s);
	}

	private static String findSubString(String s, int i, int j) {
		if (j > s.length() - 1) {
			return s;
		}
		boolean isRemove = false;
		// loop through till find equal characters if found make isRemove
		// boolean true to remove the characters
		while (s.charAt(i) == s.charAt(j)) {
			j++;
			isRemove = true;
			if (j > s.length() - 1) {
				break;
			}
		}
		// remove same characters
		if (isRemove) {
			s = s.substring(0, i) + s.substring(j);
			i = 0;
			j = i + 1;
		} else {
			i++;
			j++;
		}
		return findSubString(s, i, j);
	}
}
