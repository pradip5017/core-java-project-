package Interview_Question_practice;

public class Interview_Question_Sum_And_Avg_ValueIn_Array5 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		int sum =0;
		int mul = 1;
		for(int i=0; i<arr.length; i++)
		{
			 sum = sum +arr[i];
			 mul = mul *arr[i];
		}
		System.out.println("Additions of Array :"+sum);
		System.out.println("Multiplication of Array:"+mul);
		
		int avarage = sum = sum /arr.length;
		System.out.println("Avarage of Array :"+avarage);
	}

}
