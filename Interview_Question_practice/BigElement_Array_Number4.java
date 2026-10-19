package Interview_Question_practice;

public class BigElement_Array_Number4 {
	public static void main(String args[])
	{
		//find out minimul value of array
		int arr[]= {12,33,46,557,54,54,12,6,67};
		
		int max=arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =arr[i];
			}
		}
		System.out.println("Minimum Value of Array :"+max);
	}

}
