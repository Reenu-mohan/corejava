import java.io.*;

public class filereadbystream {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("hello");
		BufferedReader br=new BufferedReader(fr);
		
		
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line= br.readLine();
			
		}
		fr.close();
	}

}
