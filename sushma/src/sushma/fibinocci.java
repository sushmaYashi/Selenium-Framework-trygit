package sushma;

public class fibinocci {
//output = 0 1 1 2 3 5 8 13 
	public static void main(String[] args) {
	int n1 =0, n2=1, n3;
	System.out.print(n1 +" "+ n2 + " ");
	for (int i=2;i<8; i++)
	{
		n3=n1+n2;
		System.out.print(n3+" ");
		
		n1=n2;
		n2=n3;
	}
		
		
		
	}

}
