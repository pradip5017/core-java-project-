package file_handling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_class {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\hp\\Desktop\\file_handling\\demoNew.tx");
		
		//creating buffer
		 //Buffer is a temporary memory in which we can store data...means we are writing a 
		//data first in buffer and then that buffer writes a data into file..so that data can be written faster
	    //if we are using Buffer with output stream then all the data  written once means in one go from application to buffer and the from buffer to file
		
	
		
		BufferedOutputStream bout = new BufferedOutputStream(f);
		
		
		bout.write(65);   //A   //bout is object..
		bout.write(55);  //B    //writting data into the buffer
		bout.write(60);
		bout.write(78);
		
		
		String ss = "hello everyone  \n how are your \n thank you";
		
		byte b [] = ss.getBytes();  //String to byte Conversion using getBytes().
		
		bout.write(b);
		bout.close();
		
		System.out.println("Succesfully.....!!");
		
		

	}

}
