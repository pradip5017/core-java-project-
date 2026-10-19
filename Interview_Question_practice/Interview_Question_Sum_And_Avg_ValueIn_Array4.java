package Interview_Question_practice;

public class Interview_Question_Sum_And_Avg_ValueIn_Array4 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6};
		int sum =0;
		int mul = 1;
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum +arr[i];
			mul = mul *arr[i];
		}
		System.out.println("Sum of Array:"+sum);
		System.out.println("Multiplication :"+mul);
		
		double avarage = sum = sum /arr.length;
		System.out.println("Avarage :"+avarage);
		
	}

}
