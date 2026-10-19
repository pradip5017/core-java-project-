package Interview_BasicArrayQuestion;

public class FindTheLarget_Small_Element_inArray1 {
	public static void main(String[] args) {
		
		int arr[]= {2,3,5,6,78,435,234,24,546,541};
		
		int first =0;
		int secound =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}else if(arr[i] > secound && arr[i] != first)
			{
				secound = arr[i];
			}
		}
		System.out.println("First Highest Number :"+first);
		System.out.println("SEcound higherst number :"+secound);
}
}
