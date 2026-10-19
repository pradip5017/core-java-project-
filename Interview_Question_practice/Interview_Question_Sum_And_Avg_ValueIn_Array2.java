package Interview_Question_practice;

public class Interview_Question_Sum_And_Avg_ValueIn_Array2 {
	public static void main(String args[])
	{
		int arr[]= {2,3,4,56,75,67,53,32,32};
		
		int num =0;
		for(int i=0; i<arr.length; i++)
		{
			num = num +=arr[i];
		}
		double avarage = num/arr.length;
		System.out.println(num);
		System.out.println(avarage);
	}

}
