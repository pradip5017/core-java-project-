package file_handling;

import java.io.BufferedOutputStream;  
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStream_class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//creating buffer
        //Buffer is a temporary memory in which we can store data...means we are writing a 
       //data first in buffer and then that buffer writes a data into file..so that data can be written faster
       //if we are using Buffer with output stream then all the data  written once means in one go from application to buffer and the from buffer to file
		

FileOutputStream fout = new  FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\hello.txt");

	BufferedOutputStream  bout = new BufferedOutputStream(fout);
		
		bout.write(65);
		bout.write(66);
		bout.write(67);
		bout.write(105);
		bout.write(106);
		bout.write(107);
		bout.write(108);
		
		
		
		String s ="\nhello everyone...how are you.. hi ";
		
		byte b []= s.getBytes();
		
		bout.flush();
		
		
		
		
		System.out.println("Writing succesfully..");
		
	}

}
