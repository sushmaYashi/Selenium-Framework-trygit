package sushma;

public class NameStartingWithS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"vamsi","sushma","Vrinda","swetha","sirish"};
	int	len=a.length;


	for(int i=0;i<len;i++)
	{	
	
	//String temp=a[i];
	if(a[i].charAt(0) == 's')
		{
			System.out.print(a[i]);
			
		}
		
	}
	

	}

}
