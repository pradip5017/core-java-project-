package file_handling;


//File handling => to perform create, open,write,read,close operations on the file, through java application

//in java,we can read/write 2 types of data
//1.byte oriented data/streams(container in which data is stored in the form of sequence of bytes)
//java.io;
//write => FileOutputStream
//read  => FileInputStream
//  BufferedOutputStream
//BufferedInputStream
//ByteArrayOutputStream
//ByteArrayInputStream
//ObjectOutputStream => serialization
//ObjectInputStream  => deserialization
//InputStreamReader



//2.character oriented data/streams
//write => FileWriter
//   BufferedFileWriter
//read => FileReader  
//BufferedFileReader

import java.io.FileOutputStream; 
import java.io.IOException;

public class Writing_bytes_into_file {

	public static void main(String[] args) throws IOException {
		
		//types of stream(container in which data is stored in the form of sequence of bytes/characters)
				//1.Output stream(System.out)
				//2.Input stream(System.in)
				//3.Error stream(System.err)
				
				
				//write/output
				//read/input
				
				
				//FileOutputStream  class is use do create file(if file does not exists alredy),open file,and writing data into the file and then closing that file
		
		FileOutputStream fout = new  FileOutputStream("C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\hello.txt");
		
		fout.write(65);
		fout.write(66);
		fout.write(67);
		fout.write(105);
		fout.write(106);
		fout.write(107);
		fout.write(108);
		
		
		
		String s ="\nhello everyone...how are you..";
		
		byte b []= s.getBytes();
		
		fout.write(b);
		fout.close();
//		fout.write(null);
		
		System.out.println("Writing succesfully..");
		System.out.println("Writing succesfully pradip rathod..");
		

	}

}
