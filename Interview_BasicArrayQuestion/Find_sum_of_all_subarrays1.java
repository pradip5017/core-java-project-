package Interview_BasicArrayQuestion;

public class Find_sum_of_all_subarrays1 {
	public static void main(String args[])
	{
		int arr[]= {2,3,5,7,9,76};
		
		int sum =0;
		int mul =1;
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
			mul = mul+arr[i];
			
		}
		System.out.println("Addition:"+sum);
		System.out.println("Multiplication :"+mul);
		double avarage = sum / arr.length;
		System.out.println("Division:"+avarage);

}
}
