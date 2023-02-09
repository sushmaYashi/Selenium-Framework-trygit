package sushma;

public class exam2 {

	public static void main(String[] args) {
		String str="sushma11101988 vamsi13041985";
		String str2=str.replaceAll("[^0-9]", "");  
		 System.out.println(str2);
		
		str2=str.replaceAll("[0-9]", "");
		 System.out.println(str2);
		
	/*	String str = "a             b           c   d  e  f  g hfdfnd";
		//output: abcdefghfdfnd
		StringBuffer sb = new StringBuffer();
		//System.out.print(str.replaceAll("  ", ""));
		int len=str.length();
		char [] str2 = str.toCharArray();
		for(int i=0; i<str2.length; i++)
		{
			if(str2[i]!=' ')
			{
				sb.append(str2[i]);
				
			}
			
		}
		 System.out.println(sb);
		
		*/
		// TODO Auto-generated method stubn
/*order numbers in array
//		int [] nums = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
//		int len=nums.length;
//		for(int i=0;i<len;i++)
//		{
//			
//			for(int j=i+1;j<len;j++)
//			{
//				if(nums[i]>nums[j])
//				{
//					int temp;
//					temp=nums[i];
//					nums[i]=nums[j];
//					nums[j]=temp;
//				}
//				
//			}
//			
//		}
//		System.out.println("ascending order: ");
//		for (int i=0; i<nums.length;i++)
//		{System.out.print(nums[i]+" ");}
//		
//		System.out.println("Desending order: ");
//		for (int i=nums.length-1; i>=0;i--)
//		{System.out.print(nums[i]+" ");}
//	*/	
	}

}
