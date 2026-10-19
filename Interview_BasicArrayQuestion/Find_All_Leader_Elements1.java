package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements1 {
	public static void main(String args[])
	{
		int arr[]= {44,34,32,65,45,77};
		
		for(int i=0; i<arr.length; i++)
		{
			if(i==0|| arr[i] > arr[i-1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	
		
	}

}
