import java.io.*;

public class filewritedemo1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos= new FileOutputStream("D:\\reenu\\sample.txt");
		fos.write('h');
		fos.write('e');
		fos.write('l');
		fos.write('l');
		fos.write('o');
		fos.close();
		System.out.println("file is created ");
		
		
		
		
	}

}
