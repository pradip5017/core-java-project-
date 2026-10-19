package file_handling;

import java.io.BufferedWriter;   
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;

public class writting_characters_into_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	     FileWriter fw = new FileWriter("C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\hello.txt");
	     
	     BufferedWriter bw = new BufferedWriter(fw);
	     
	     bw.write("hello everyone");
	     bw.write("Welcome to Java Language..!!");
	     bw.write("Java is a plateform independent Language ");
	     bw.write("Java is a Object Oriented Language and Java is a high Level Language..!!");
	     bw.write("Java is a Secure Language ");
	     bw.close();
	     System.out.println("Writting successfully..!!");
	     
	    }



	}


