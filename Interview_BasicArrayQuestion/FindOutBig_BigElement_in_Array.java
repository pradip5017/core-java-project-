package Interview_BasicArrayQuestion;
// find out output is 24, 45, 67 in array element
public class FindOutBig_BigElement_in_Array {
	public static void main(String args[])
	{
		int arr[]= {24,12,21, 45,32,42,34,67};
		
//		int num =0;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i] > num)
//			{
//				num =+ arr[i];
//				System.out.print(num+" ");
//			}
//		}
		
		
		int num = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > num)
			{
				num =+arr[i];
				
				System.out.print(num+" ");
			}
		}
	}

}
