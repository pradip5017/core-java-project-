package file_handling;

import java.io.BufferedInputStream;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_charectors_into_file {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\hello.txt");
		
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		

	}

}
