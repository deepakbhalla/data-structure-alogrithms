package com.ds.example;

public class AlgoClass {

	public static void main(String[] args) {

		// String input = "a4k3b2";
		String input = "A4k3B2";
		String output = replaceCharacters(input);
		System.out.println(output);
	}

	private static String replaceCharacters(String input) {

		char[] charArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char ch : charArray) {
			if (Character.isAlphabetic(ch)) {
				sb.append(ch);
			} else {
				char previousAlphaChar = sb.charAt(sb.length() - 1);
				sb.append(String.valueOf((char) (previousAlphaChar + Integer.valueOf(String.valueOf(ch)))));
			}
		}

		return sb.toString();
	}

}
