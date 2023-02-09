package sushma;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class recurrstring {
	static String str1="tehh I am I am java java";
	public static void main(String args[]) 
	{ 
		String str="tehh I am I am java java";
		
		findduplicateword(str);
		findduplicatechar(str1);
	}
	
	
private static void findduplicatechar(String str1) {
	
	
		HashMap<Character, Integer> hm1= new HashMap<>();
		for(int i=0;i<str1.length();i++)
		{
			
			
		}
		
		
	}


static void findduplicateword(String str)
{
	
HashMap<String, Integer> hm= new HashMap<>();
String [] s = str.split(" ");
for(String tempString : s)
{
	if(hm.get(tempString)!= null)
	{
		hm.put(tempString, hm.get(tempString)+1);
	}
	else
	hm.put(tempString, 1);
}
System.out.println(hm);

}
	
//	for (int j = 0; j < a.length(); j++) 
//	{ 
//		for (int i = 0; i < a.length(); i++) 
//		{
//			if (a.charAt(j) == a.charAt(i))
//			{ 
//				count++;
//				} 
//			}
//		System.out.println("Number of occurences of " + a.charAt(j) + " is " + count);
//		String d=String.valueOf(a.charAt(j)).trim();
//        a=a.replaceAll(d,"");
//		count=0;
////		char s =a.charAt(j);
////		String s1=Character.toString(s);
////		a=a.replaceAll(s1, "");
////		System.out.println("Number of occurences of " + a.charAt(j) + " is " + count);
////		
//		// String s=String.valueOf(input.charAt(i)).trim();
//				
				
		
	
}
