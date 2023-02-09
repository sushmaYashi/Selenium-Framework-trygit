package sushma;

public class primeornot {

	public static void main(String[] args) {

int num=100;
for(int a=1;a<=num;a++)
{
checkifprime(a);
}
	}

	private static void checkifprime(int input) {
		int reminder;
		// TODO Auto-generated method stub
		for(int i=2;i<input/2;i++)
		{
			reminder = input/i;
			if(reminder==0)
			{
				System.out.println(input+"is not prime");
			}else
				System.out.println(input+"is prime");
		}
		
	}

}
