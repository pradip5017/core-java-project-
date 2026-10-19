package Interview_BasicArrayQuestion;

public class CalculatorCode1 {
	public static void main(String args[])
	{
		int arr[]= {2,3,5,6,7,9};
		int add =0;
		int mul=1;
		
		for(int i=0; i<arr.length; i++)
		{
			add = add +arr[i];
			mul = mul * arr[i];
		}
		System.out.println("addition :"+add);
		System.out.println("Muliplication :"+mul);
		double avarage = add= add/arr.length;
		System.out.println("avarage :"+avarage);
	}
}
