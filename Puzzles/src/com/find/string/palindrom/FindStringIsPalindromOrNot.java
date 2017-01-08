package com.find.string.palindrom;

public class FindStringIsPalindromOrNot {
	
	
	public static void main(String args[]){
		String original="madam";
		String rev="";
		int n=original.length();
		for(int i=n-1;i>=0;i--){
			rev=rev+(original.charAt(i));
			
		}
		
		if(original.equals(rev)){
			System.out.println("Given string is palindrom");
		}else{
			System.out.println("Not palindrom");
		}
		
		
	}

}
