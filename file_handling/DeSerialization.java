package file_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static <Emp10> void main(String[] args)throws IOException, ClassNotFoundException {
		
		FileInputStream fin=new FileInputStream("D:\\BACK END (pooja ma'am)\\Core Java\\File Handling\\Samplee.txt");
	
		ObjectInputStream oin=new ObjectInputStream(fin);   //here, ObjectInputStream
		
		Emp10 ee = (Emp10)oin.readObject();    //object to Emp10 conversion
//		//fin.read
//		
		System.out.println(ee);
//		
//		
		oin.close();
//	
	}

}

//e1=>ObjectOutputStream o_out=>FileOutputStream fout
//here, ObjectInputStream reads data from file i.e from FileInputStream by converting bytestream into object states
//Object to Emp10 conversion
//DeSerialization in Java is a mechanism of converting byte-stream into object-states