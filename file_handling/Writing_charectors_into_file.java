 package file_handling;

import java.io.BufferedWriter;  
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Writing_charectors_into_file {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		
		FileWriter  fw = new FileWriter("C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\hello.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		fw.write("java is an object oriented programming language..");
		
		fw.flush();
		fw.close();
		
		System.out.println("Writting successfully..!!");
		
	}

}
