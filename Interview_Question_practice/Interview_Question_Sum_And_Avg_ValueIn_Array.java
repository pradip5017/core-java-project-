package Interview_Question_practice;

public class Interview_Question_Sum_And_Avg_ValueIn_Array {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		
		int sum =0;  //1+2, 3+3=6+4=19+5=15+6+21+7=28+8=36 
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum +arr[i];
			
		}
		
		double avarage = sum / arr.length;
		System.out.println(sum);
		System.out.println(avarage);
		
	}

}
