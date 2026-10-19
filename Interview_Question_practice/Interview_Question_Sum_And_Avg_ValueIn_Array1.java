package Interview_Question_practice;

public class Interview_Question_Sum_And_Avg_ValueIn_Array1 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		
		int num =0;
		for(int i=0; i<arr.length; i++)
		{
			num = num +arr[i];
		}
		double avarage = num /arr.length;
		System.out.println(num);
		System.out.println(avarage);
	}

}
