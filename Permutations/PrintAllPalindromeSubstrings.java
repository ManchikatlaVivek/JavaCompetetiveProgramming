/*
* Program to print all the palindrome substrings of the given string.
* Note: the code doesnot handle the duplicate substrings.
* @author Vivek Manchikatla
*/

import java.io.*;

class PrintAllPalindromeSubstrings {
	public static void main (String[] args) {
		String s = "ababa";
		printSubstrings(s);
		
	}
	public static void printSubstrings(String s){
	    int len = s.length();
	    for(int i=0;i<len;i++){
	        for(int j=i+1;j<=len;j++){
	            String temp = s.substring(i,j);
	            if(checkPalindrome(temp)){
	                System.out.println(temp);
	           }
	        }
	    }
	}
	public static boolean checkPalindrome(String s){
	    int len = s.length();
	    int j=0;
	    for(int i=len-1;i>=len/2;i--){
	        char start = s.charAt(j);
	        char end = s.charAt(i);
	        if(start!=end) return false;
	        j++;
	    }
	    return true;
	}
}
