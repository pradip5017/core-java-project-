package Interview_Question_practice;

public class Avarage_of_array {
	public static void main(String args[])
	{
	int arr[]= {1,2,3,4,5,6,7,8,9};
	
	int sum =0;
	
	for(int i=0; i<arr.length; i++)
	{
		sum = sum +arr[i];	
	}
	System.out.println(sum);
	double avarage = sum / arr.length;
	System.out.println(avarage);
		
	}
}
