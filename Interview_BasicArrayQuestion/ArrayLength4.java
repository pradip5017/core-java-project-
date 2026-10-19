package Interview_BasicArrayQuestion;

public class ArrayLength4 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,6,7,8,9};
		
		int num = 6;
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]==num)
			{
				System.out.print("index Of Array :"+i);
			}
			
		}
	}

}
