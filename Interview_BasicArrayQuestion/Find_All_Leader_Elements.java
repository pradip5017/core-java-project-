package Interview_BasicArrayQuestion;
//Find all “leader” elements in an array (same as your “big elements” question).
public class Find_All_Leader_Elements {
	public static void main(String[] args) {
		/*
		int arr[]= {44,33,23,67,54,46,77};
		
		for(int i=0; i<arr.length; i++)
		{
			if(i==0|| arr[i]> arr[i-1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		*/
		
		int arr[]= {44,33,23,67,54,46,77};
		
		for(int i=0;i<arr.length; i++)
		{
			if(i==0|| arr[i] >arr[i-1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
