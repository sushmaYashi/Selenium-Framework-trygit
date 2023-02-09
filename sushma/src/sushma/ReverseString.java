package sushma;

import java.lang.*;
import java.io.*;
import java.util.*;
 
//// Class of ReverseString
class ReverseString {
	
	public static void main(String[] args)
	{
		String input = "Hello World I love you";
			//	reverse(input);
				SenToWord(input);
		
		
	}
	private static void SenToWord(String input) {
		// TODO Auto-generated method stub
		for (String word: input.split(" ") )
		{
			//System.out.println(word);
			reverse(word);
			System.out.print("\t");
		}
	}
	private static void reverse(String input) {
		// TODO Auto-generated method stub
		int ilength = input.length();
		//System.out.println("Reverse of word: " + "\t");
	//	System.out.println();
		for (int i=ilength-1;i >=0;i--)
		{
		
			System.out.print(input.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//        String str = "Welcome to Javatpoint portal";    
//		  for (int i=str.length()-1; i>0; i--) {  
//	          
//	                System.out.println("Char at "+i+" place "+str.charAt(i));  
//	           
//	        } 
	}
	
	
	
	
	
	
}