package Interview_BasicArrayQuestion;

public class RotationArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int  k=2;
		
		for(int i=0; i<k; i++)
		{
			int last = arr[arr.length-1];
			for(int j=arr.length-1; j>=0; j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]= last;
		}
		System.out.println("Rotate");
		for(int num : arr)
		
			System.out.print(num+" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//integer number rotate
//		int k =121; // 2 element rotate
//		
//		int LastIndex = k % 10;
//		int remaining = k /10;
//		
//		int total =  LastIndex * 100 + remaining;
//		System.out.println(LastIndex);
//		System.out.println(remaining);
//		System.out.println(total);
		
	}

}
