package file_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**********Difference between Scanner and InputStreamReader class
//1.Scanner reads the input in form of characters
//2.In case of scanner class, we cannot use buffer with scanner class
//hence it reads a data in the form of one character at a time(if we are using buffer with Scanner class then its size is around 1kb)
//-------------------------------------
//1.InputStreamReader reads the input in form of bytes and after reading,
//it convert that bytes into character format
//2.In case of InputStreamReader class, we can use buffer with InputStreamReader class hence 
//it reads all data at once(the size of buffer in case of InputStreamReader is 
//around 8kb)
*/

public class Taking_input_from_user_using_InputStreamReader_class {

	public static void main(String[] args) throws IOException {
	
		/*
		   //1.taking input using scanner class
//		String name;
//		System.out.println("Enter your name");
//		
//		Scanner sc= new Scanner(System.in);
//		name = sc.next();
//		
//		System.out.println("your name  is = " +name);
//				
	*/
		
		//2.taking input using InputStreamReader class.
		
		String name;
		
		System.out.println("Enter your name  ");
		
		InputStreamReader ir = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(ir);
		 //sc.nextLine();
		name = br.readLine();  //here are we reading data from user.
		System.out.println("your name is = " +name);
		
		
		
		
		

	}

}
