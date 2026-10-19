package Interview_BasicArrayQuestion;

public class FindTheLarget_Small_Element_inArray11 {

	public static void main(String[] args) {
		
		int arr[]= {21,2,3,5,7,91,43,2,5};
		
//		int min = arr[0];
		int max = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =+ arr[i];
			}
		}
		System.out.println(max);
		
	}
}

