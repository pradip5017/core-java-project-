package Interview_BasicArrayQuestion;
//insert 7  element of Squence Array
// insert 6 index of 7 element number in array
public class InsertElementInArray1 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,8,9};
		
		int index = 6;
		int element =7;
		
		int arr1[]= new int [arr.length+1];
		for(int i=0; i<arr.length; i++)
		{
			arr1[i]=arr[i];
		}
		
		arr1[index]=element;
		for(int i=index; i<arr.length; i++)
		{
			arr1[i+ 1]=arr[i];
		}
		for(int n : arr1)
		{
			System.out.print(n+" ");
		}
	}

}
