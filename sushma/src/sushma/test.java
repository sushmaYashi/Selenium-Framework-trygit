package sushma;

//public class duplicatechar {
//	public static void main(String[] args) {
//	String str = "Vamsush";
//	char[] carray = str.toCharArray();
//	int len= carray.length;
//	System.out.println(len);
//	for (int i=0;i<=len;i++)
//	{
//		for(int j=0;j<=len;j++)
//		{
//			if(carray[i]!=carray[j])
//			{
//				System.out.print(carray[i]);
//			}
//		}
//		
//		
//	}
//	
public class test {

    public static void main(String[] args) {
    	
    	
    String abc="developer";
    
//    The unique characters are-
   // dvlopr


    System.out.println("The unique characters are-");

    for(int i=0;i<abc.length();i++)
    {
        for(int j=i+1;j<abc.length();j++)
        {
            if(abc.charAt(i)==abc.charAt(j))
            	// System.out.println(abc.charAt(j));
           
                abc=abc.replace(String.valueOf(abc.charAt(j)),"");
            
        }

    }   
    System.out.println(abc);
}

}
