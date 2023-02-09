package sushma;

public class Exam {
	static int a=10;
	static  String output="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//reverse string
	//String str = "sushma vrinda yashi";
	//sentenceReverse(str);
	//int a=10,b=20;
		
		//swap(a,b);
	//	String s1="Hello", s2="world";
		//swapString(s1,s2);
		//String str2= "hello world yashi vrinda vamsi sushma love you";
		//countwords(str2);
	//	int n=10;
		//isprime(n);
	//	firstPrime(n);
		
//		String str3="12121";
//		reverse(str3);
//		
//		System.out.println("string"+str3 +" reverse:"+output);
//		if(output.equalsIgnoreCase(str3))
//		{
//			System.out.println("string is palindrome "+str3 +" reverse:"+output);
//		}
		
		String dupli="sushmaa";
		
		eliminateDup(dupli);
		
		
		
	}
	private static void eliminateDup(String abc) {
		int count=0;
		
		  for(int i=0;i<abc.length();i++)
		    {
		        for(int j=i+1;j<abc.length();j++)
		        {
		            if(abc.charAt(i)==abc.charAt(j))
		            {
		            	//System.out.println(abc.charAt(i));
		            	
		            	//abc=abc.replace(abc.charAt(j),"");
		            	abc=abc.replace(String.valueOf(abc.charAt(j)),"");
		            } 	
		        }
		    }
		            	
		  System.out.println(abc);      	
		            	
		            	
		
//		char[] dup = dupli.toCharArray();
//		for (int i=0;i<=dup.length;i++)
//		{
//			for (int j=i+1; j<=dup.length;j++)
//			{
//				if(dup[i]==dup[j])
//				{
//					System.out.println(dup[j]);
//					count++;
//					break;
//				}
//					
//				
//			}
//			
//		}
		

		
	}
	private static void firstPrime(int n) {
		for(int i=2;i<=n;i++)
		{
		
			isprime(i);
			
		}
			
			
		// TODO Auto-generated method stub
		
	}
	private static void isprime(int n) {
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			
			int rem;
			rem=n%i;
			if(rem==0)
			{
				flag=1;	
				break;
			}
		
		
			
		}
		if(flag==1)
		System.out.println(n+ " is not prime number");
		else
			System.out.println(n+" is prime number");
		
	}
	private static void countwords(String str2) {
		int count=0;
		for(String word : str2.split(" "))
		{
			count++;
			System.out.print("word: " +word+"no: " +count);	
		}
	
		System.out.print("count:" + count);	
		
		
			
	}
	private static void swapString(String s1, String s2) {
		// TODO Auto-generated method stub
		
		System.out.print("Before swap s1 "+s1 +"s2 "+s2 );
		
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length(), s1.length());
		
		System.out.print("after swap s1 "+s1 +"s2 "+s2 );
		
		
	}
	public static void swap(int a, int b)
	
	{
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.print("a: "+a +"b: "+b );
	}
	public static void sentenceReverse(String str)
	{
		
		for(String word: str.split(" "))
		{
			System.out.print("--" + word);
			//reverse(word);
			 
		}
		
		
	}
	public static String reverse(String s)
	{
	   int len = s.length();
	 
	   
	   for (int t1 = len-1; t1>=0;t1--)
	   {
		   System.out.print(s.charAt(t1));
		   output = output +s.charAt(t1);
	   }
	
	return output;
	}
	
	
	
	
	
	/*	sentenceReverse(str);
		reverse
	//	fibinocci();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void fibinocci()
	{
		int n1=0,n2=1,n3;
		System.out.print(n1 + " "+n2 + " ");
		for (int i=2;i<a;i++)
			
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
		
		
		
	}
	*/
	
	
}
