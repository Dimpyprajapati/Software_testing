package File_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_writerReader  {
	public static void main(String[] args) throws IOException {
		String s = "file handling by file writer and reader";
		FileWriter fr = new FileWriter("t2.txt");
		fr.write(s);
		fr.flush();
		fr.close();
		System.out.println("file written successfully");
		
		FileReader f = new FileReader("t2.txt");
	    int i;
		while((i = f.read())!=-1) {
			System.out.print((char)i);
		}
    }
}

	
	
	
	


