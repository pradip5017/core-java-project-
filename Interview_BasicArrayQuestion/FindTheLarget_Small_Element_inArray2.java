package Interview_BasicArrayQuestion;

public class FindTheLarget_Small_Element_inArray2 {

	public static void main(String[] args) {
		
	
	int arr[]= {2,3,16,8,0,9,5,2,3};
	
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