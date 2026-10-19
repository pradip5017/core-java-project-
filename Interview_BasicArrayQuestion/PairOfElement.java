package Interview_BasicArrayQuestion;
// -7 +1 = 6 ,  1+ 5 = 8
public class PairOfElement {
	public static void main(String[] args) {
		int arr[]= {2,3,6,-7,1,8,5};
		
		int target = 6;
		int count =0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+target);
					count++;
				}
			}
		}
		System.out.println("Count: "+count);
	}	

}
