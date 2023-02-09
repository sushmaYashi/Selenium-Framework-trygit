package sushma;

public class RecurringChar {
	
	public static void main(String[] args)
	{
		String input = "sssushma";
		
	
		int count=0;
		int len = input.length();
		for (int i=0;i<len; i ++) {
					
			for (int j=i+1; j<len;j++)
			{
				
				if(input.charAt(i)==input.charAt(j))
				{	
							
					count++;
					
				}
				
			}
			System.out.print(input.charAt(i));
			String d=String.valueOf(input.charAt(i)).trim();
			input = input.replaceAll(d, "");
			count=0;
			
			 
	
			}
	}		
	}
	
