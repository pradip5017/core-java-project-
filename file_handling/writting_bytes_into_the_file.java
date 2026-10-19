package file_handling;


import java.io.FileOutputStream;
import java.io.IOException;


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


public class writting_bytes_into_the_file {

	public static void main(String[] args) throws IOException {
		
		//types of stream(container in which data is stored in the form of sequence of bytes/characters)
				//1.Output stream(System.out)
				//2.Input stream(System.in)
				//3.Error stream(System.err)
				
				
				//write/output
				//read/input
				
				
				//FileOutputStream  class is use do create file(if file does not exists alredy),open file,and writing data into the file and then closing that file

		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\hp\\Desktop\\file_handling\\demoNew.tx");

		fout.write(65);      //fout is object..
		fout.write(66);
		fout.write(67);
		fout.write(109);
		
		String s="\n Hello EveryOne... How are You ? \n Thank Youu..";
		byte b[]=s.getBytes();   //String to byte Conversion using getBytes().
		
		fout.write(b);
		
		fout.flush();   //removing data from File Output stream
		
		fout.close();
		
		System.out.println("Writting Successfully__");
	}

}
