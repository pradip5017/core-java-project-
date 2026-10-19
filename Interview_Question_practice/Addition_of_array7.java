package Interview_Question_practice;

public class Addition_of_array7 {
	public static void main(String args[])
	{
	int arr[]= {2,3,4,6,7,8};
	
	int add =0;
	int mul =1;
	for(int i=0; i<arr.length; i++)
	{
		add = add +arr[i];
		mul = mul *arr[i];
	}
	System.out.println("Addition:"+add);
	System.out.println("Multiplication :"+mul);
	double avarage = add = add/arr.length;
	System.out.println("Avarage :"+avarage);
	}
}
