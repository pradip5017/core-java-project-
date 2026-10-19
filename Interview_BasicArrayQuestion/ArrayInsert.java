package Interview_BasicArrayQuestion;

public class ArrayInsert {
	public static void main(String args[])
	{
		// insert element array
		
		/*
		int arr[]= {1,2,3,4,5,6};
		
		int index =3;
		int element = 100;
		
		//1
		int newArray[]= new int [arr.length+1];
		
		//2
		
		for(int i=0; i<index; i++)
		{
			newArray[i]= arr[i];
		}
		
		//insert 
		newArray[index]= element;
		
		
		// copy remaining elements
		
		for(int i=index; i<arr.length; i++)
		{
			newArray[i+ 1]= arr[i];
		}
		// travers
		for(int n :newArray)
		{
			System.out.print(n+" ");
		}
		
		*/
		
		
		int  arr[]= {1,2,3,5,6};
		
		int index =3;
		
		int element = 4;
		int newArray[]= new int [arr.length + 1];
		
		for(int i=0; i<arr.length; i++)
		{
			newArray[i]=arr[i];
		}
		
			newArray[index]=element;
			
			for(int i=index; i<arr.length; i++)
			{
				newArray[i+1]= arr[i];
			}
		
			for(int n : newArray)
			{
				System.out.print(n+" ");
			}
	}
	

}
