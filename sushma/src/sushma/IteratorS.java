package sushma;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class IteratorS {
	public static void main(String args[]){
	    ArrayList products = new ArrayList();
	    products.add("Chercher tech");
	    products.add("Google");
	    products.add("Bing");

	    Iterator it = products.iterator();

	    while(it.hasNext()) {
	      String obj = (String) it.next();
	      System.out.println("Value : " +obj);
	    }System.out.println("Reverse of =-===");
	    
	    System.out.println("*********Reverse the Iteration*********");
	    while(it.hasPrevious()) {
	      String objPrev = it.previous();
	      System.out.println("Value : " +objPrev);
		}
	    
	  }
	
	
	
	
	
	
}
