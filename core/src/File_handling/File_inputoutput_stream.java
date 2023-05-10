package File_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//file handling : To store data or output in any file we are having this concept 
//                is called file handling.
//1.FileOUputStream -> to write data into file
//2.FileInputStream -> to read data from file
//3.FileWriter -> to write data into file
//4.FileReader -> to read data from file

public class File_inputoutput_stream {
	public static void main(String[] args) throws IOException  {
		String s = "file handling by file input output stream.";
		FileOutputStream fos = new FileOutputStream("t1.txt"); 
		byte b[] = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File written Succesfully");
		
	    FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
	}	
}



