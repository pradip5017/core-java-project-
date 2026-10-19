package Interview_BasicArrayQuestion;

public class FindTheLarget_Small_Element_inArray {
	public static void main(String args[])
	{
		int arr[]= {252,333,55,67,87,45,63,32};
		
//		int small=arr[0];
		int max =arr.length;
		
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}			
		}
//		System.out.println("Small Element of Array..!!: "+small);
		System.out.println("Largesh Element of Array :"+max);
	}

}
