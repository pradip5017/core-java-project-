package Array;
//1D and 2D

//types of loops in java
//1.for loop
//2.while loop
//3.do-while loop
//4.for each loop(used to print/traverse collections)

public class Creating_one_Dimentional_Array {

	public static void main(String[] args) {
		
		int a[]= {34,56, 76, 98, 98 };
		System.out.println("printing in a array forward..");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+",");
		}
//	for loop execution steps:	1. initialize , 2. condition ,  3. execution of loop , 4. increament ,
	}

}

//for loop execution steps => 1.initialization  2.condition 3.execution of loop    4.increment/decre
		/*
		 					for(initialization;  condition  ;  increment/decre) //0,1,2,3,4,5,6,7
		{
			//execution of loop
		}
		 */