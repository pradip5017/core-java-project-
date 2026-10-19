package Interview_Question_practice;

// fetching smalest and largers Array number
public class Smalest_Array_Number0 {
	public static void main(String args[])
	{
	
	int arr[]= {22,33,5,7,9,55,76,99,23};
	

	int small = arr[0];
	
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] < small)
		{
			small = arr[i];
		}
	}
	System.out.println("Smalest Number Of Array :"+small);
	}
}
