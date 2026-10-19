package Interview_BasicArrayQuestion;

public class BinarySearchProgram {
	
	public static void main(String args[])
	{
		int arr[]= {10,20,30,40,50,60,70,80,90};
		
		int index = 50;
		
		int li =0;
		int hi = arr.length-1;
		
		while(li <= hi)
		{
			 int mid = (li + hi)/2;
				if(arr[mid]==index)
				{
					System.out.println("Element is mind position "+mid);
				}
				if(index > arr[mid])
				{
					li = mid+1;
				}
				else
				{
					hi = mid -1;
				}
		}
	}

}
