package file_handling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStream_class_practice {
	public static void main(String args[]) throws IOException {
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\hp\\Desktop\\file_handling\\demoNew.txt");
		
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		bo.write(64);
		bo.write(54);
		bo.write(74);
		bo.write(94);
		
		
		String s = "\n Hello everyone \n Thank your \n byyye";
		
		
		byte b [] = s.getBytes();
		
		bo.write(b);
		bo.close();
		
		
		System.out.println("writting successfully");
		
		
		
		
		
 	}

}
