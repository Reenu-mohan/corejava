import java.io.*;
import java.io.IOException;

public class filereaddemo1 {

	public static void main(String[] args) throws IOException{
		FileInputStream fis= new FileInputStream("hello");
		
		int xx=fis.read();
		while(xx!=-1)
		{
			//System.out.print((char)xx);
			xx=fis.read();
			
		}
		fis.close();
		
	}

}
