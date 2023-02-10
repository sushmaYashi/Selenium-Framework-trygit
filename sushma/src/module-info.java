import java.lang.*;
import java.io.*;
import java.util.*;
 
// Class of ReverseString
class ReverseString {
    public static void main(String[] args) 
    {
        String input = "Geeks for Geeks";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        System.out.println(input1);
    }
}

//commenting for github conflict







//
//class sushma {
//	
//	
//	public static void main(String[] args)
//	{
//	String input ="Hello World";
//	//olleh dlrow
//	
//	for (String s: input.split(" "))
//	{
//		System.out.println(s);
//		System.out.println("reverse of word:" + Str.reverse(s));
//		
//	}
//	
//	}
//}
