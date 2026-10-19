package Interview_BasicArrayQuestion;

public class FindTheLarget_And_Small_Element_Array2 {
	public static void main(String[] args) {
		
		int arr[]= {12,4,6,8,9,3,4,6,5};
		
//		int max =0;
		int min =arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = min = arr[i];
			}
		}
		System.out.println(min);
	}

}
