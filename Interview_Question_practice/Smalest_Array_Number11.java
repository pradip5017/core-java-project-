package Interview_Question_practice;

public class Smalest_Array_Number11 {
	public static void main(String args[])
	{
		int arr[]= {11,22,3,44,55,46,7,8};
		
		int num =arr.length;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > num)
			{
				num = arr[i];
			}
		}
		System.out.println(num);
	}

}
