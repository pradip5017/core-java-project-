package file_handling;

import java.io.ByteArrayInputStream;

//ByteArrayInputStream class is used to read byte type of an array

public class ByteArrayInputStream_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b [] = {78,122,106,112,103};
		
		
		//=> 1st way---
//		String s = new String(b);
//		System.out.println(s);
		
		//2nd way---
		
		ByteArrayInputStream br = new ByteArrayInputStream(b);
		
		int i;
		
		do {
			i=br.read();
			System.out.println((char)i);
		}
		
		while( i != -1);
		
		
		
		
	}

}
