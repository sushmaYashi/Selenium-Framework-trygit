package sushma;

public class recurring {
	
	public static void main(String args[]) {
		    String s="vamsisushma";
		    int distinct = 0 ;

		    for (int i = 0; i < s.length(); i++) {

		        for (int j = 0; j < s.length(); j++) {

		            if(s.charAt(i)==s.charAt(j))
		            {
		                distinct++;
		               // System.out.println(s.charAt(i)+"--"+distinct);
		            }
		        }   
		        
		        System.out.println(s.charAt(i)+"--"+distinct);
		      
		        distinct = 0;

		    }
		   
		}

}
