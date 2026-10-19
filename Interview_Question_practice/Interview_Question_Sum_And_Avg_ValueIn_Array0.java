package Interview_Question_practice;

public class Interview_Question_Sum_And_Avg_ValueIn_Array0 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6};
		int add = 0;
		int mul = 1;
		int sub =1;
		for(int i=0; i<arr.length; i++)
		{
			
			add = add + arr[i];
			mul = mul*arr[i];
			sub = sub - arr[i]; 
		}
		System.out.println("Addition:"+add);
		
		System.out.println("Multiplication:"+mul);
		System.out.println("Substriction:"+sub);
		
		int avag = add = add / arr.length;
		System.out.println("Avarage of Array :"+avag);
		
	}
	

}
