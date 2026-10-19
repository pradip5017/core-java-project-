package file_handling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fou= new FileOutputStream("D:\\\\file_handling\\\\demo.txt");
		FileOutputStream fou1= new FileOutputStream("D:\\\\file_handling\\\\demo.txt");
		FileOutputStream fou2= new FileOutputStream("D:\\\\file_handling\\\\demo.txt");
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		String ss = "hello everyone\n, my name pradip";
		
		byte b []= ss.getBytes();   //writing data into ByteArrayOutputStream
		bout.write(b);
		
		
		bout.writeTo(fou);   //writing data from ByteArrayOutputStream  to FileOutputStream
		bout.writeTo(fou1);
		bout.writeTo(fou2);
		
		
		
		
		
		

	}

}
