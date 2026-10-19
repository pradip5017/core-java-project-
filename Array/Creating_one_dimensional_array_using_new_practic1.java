package Array;


//array is a collect the all similar type  data to store in one variable is called as Arrays..!!
public class Creating_one_dimensional_array_using_new_practic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a []= new int[8];
	
	a= new int [] {1,2,3,4,5,6,7,8,9};
	
	System.out.println("\n the Array element is..\n");
	
	
	for(int i=0; i<=8; i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println("\nthis is a reverse array..!!\n");
	for(int j=a.length-1; j>=0; j-- )
	{
		System.out.println(a[j]+" ");
	}
		
	}

}
