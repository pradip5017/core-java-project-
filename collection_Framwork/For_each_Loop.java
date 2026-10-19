package collection_Framwork;

import java.util.ArrayList;
//for each loop is used to traverse/visit collection object one by one and print them accordingly

//there are 4 types of loops
//1.for loop  => repeat the and check condition and increate/ deccreate property on for loop

//2.while loop 
//3.do-while loop
//4.for each loop/enhanced for loop          (and  traversing of loop and check line by line code and execute of code)

//loops is travelsing allocate in loop for loop and for each loops
public class For_each_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer>  l1= new ArrayList(); //OR
	
			ArrayList<Integer>  l1= new ArrayList();  //array can store same type of data 
						   l1.add(29);  //0
						   l1.add(67); //1
						   l1.add(12); //2
						   l1.add(3);  //3
						   l1.add(15); //4
						   l1.add(12);
						   l1.add(22);
						   
						   System.out.println(l1);
						   
						 
							  /*
							   for( ; ; )
							   {
							   
							   */
							 
						   //to iterate an array we can use=> for  loop
		                   //to iterate collection we can use=> for each loop(enhanced for loop)

							 for(Integer   n : l1  ) //forEach loop for traversing L1 connect to n
							  {
								  System.out.println(n);
							  }
							  
							  
							  System.out.println("Accessing even numbers from the nums list :");
							  for(Integer   n :  l1   )
							  {
								  if(n %2 ==0)
								  {
									  System.out.println(n); //34
								  }
							  }			   

	}

}
