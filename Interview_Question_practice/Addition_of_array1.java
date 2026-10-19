package Interview_Question_practice;

public class Addition_of_array1 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,45,6,7,8,65,43,34,65,34,78};
		
		int sum =0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
			
		}
		double avarage = sum / arr.length;
		System.out.println("Sume : "+sum);
		System.out.println("Avarage :"+avarage);
	}

}
