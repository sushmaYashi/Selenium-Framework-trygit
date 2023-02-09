package sushma;

public class SwapString {

	public static void main(String[] args) {
		        String a ="Vamsi";
				String b="Motay";
				System.out.println("a before swap: "+a);
				System.out.println("b before swap"+ b);
//				String c;
//				c=a;
//				a=b;
//				b=c;
//				System.out.println("a:::"+a);
//				System.out.println("b:::"+b);   a=a+b;b=a-b;a=a-b;
				a=a+b;
				System.out.println(a);//10
				
				b=a.substring(0, a.length()-b.length());//0,10-5
				a=a.substring(b.length(),a.length());
				
				System.out.println("a after swap: "+a);
				System.out.println("b after swap"+ b);
			
				
		
		// TODO Auto-generated method stub

	}

}
