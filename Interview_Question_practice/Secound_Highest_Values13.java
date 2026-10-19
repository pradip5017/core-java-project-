package Interview_Question_practice;

public class Secound_Highest_Values13 {
	public static void main(String args[])
	{
	
	// find out secound highest number in array
	
	int arr[]= {2,4,66,88,4,5,8,0,83};
	
	int first =0;
	int secound =0;
	
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] > first)
		{
			secound = first;
			first = arr[i];
		}
		else if(arr[i] > first && arr[i] != secound)
		{
			secound = arr[i];
		}
	}
	System.out.println("SecoundHighest :"+secound);

}
}