/* 
* Program to print all the substrings of a given string
* @author Vivek Manchikatla
*/

import java.io.*;

class PrintAllSubstringsOfString {
	public static void main (String[] args) {
		String s = "123";
		printSubstrings(s);
	}
	public static void printSubstrings(String s){
	    int len = s.length();
	    for(int i=0;i<len;i++){
	        for(int j=i+1;j<=len;j++){
	            String temp = s.substring(i,j);
	            if(temp.length()<=2){
	                System.out.println(temp);
	            }
	        }
	    }
	}
}
/* Sample Output
1
12
123
2
23
3
*/
