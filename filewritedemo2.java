import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class filewritedemo2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos= new FileOutputStream("D:\\reenu\\sample1.html");
		DataOutputStream dos= new DataOutputStream(fos);
		dos.writeBytes("hai am reenu\n"); 
		dos.writeBytes("so first pgrm");
		dos.close();
		fos.close();
		
}
}