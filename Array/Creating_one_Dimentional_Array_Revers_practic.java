package Array;

public class Creating_one_Dimentional_Array_Revers_practic {
	public static void main(String[] args) {
		
		
		int a [] = {1,2,3,4,5,6,7,8,9,44,67,867,89,98,45,};  //declaration and initialization of array 
		System.out.println("the number of array");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
			
		}
		
	}

}


//for loop execution steps => 1.initialization  2.condition 3.execution of loop    4.increment/decre
		/*
		 				for(initialization;		  condition  ; 	 increment/decre) 	//0,1,2,3,4,5,6,7
		{
			//execution of loop
		}
		 */