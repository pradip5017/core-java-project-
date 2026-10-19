package Interview_BasicArrayQuestion;
// find out max and min element in array
public class FindMaxAndMinElementInArray {
	public static void main(String[] args) {
		
		int arr[]= {81,32,63,74,233,45,67,53};
		
		//int min =arr[0]; //min element
		int max = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =arr[i];
			}
		}
//		System.out.println("Minimum Element :"+min);
		System.out.println("Maximum Element: "+max);
	}

}
