
import java.io.*;

public class filewritedemo3 {

	public static void main(String[] args) throws IOException {
		FileWriter fos= new FileWriter("D:\\reenu\\sample3.txt");
		BufferedWriter bw=new BufferedWriter(fos);
		bw.write("first line");
		bw.newLine();
		bw.write("Second line");
		bw.newLine();
		bw.write("Third line");
		bw.newLine();
		bw.write("Four line");
		bw.newLine();
		bw.close();
		fos.close();
	}
	

}
