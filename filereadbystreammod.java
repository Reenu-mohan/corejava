import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filereadbystreammod {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("hello");
		BufferedReader br=new BufferedReader(fr);
		int flag=0;
		
		String line=br.readLine();
		while(line!=null)
		{
			if(line.contains("java"))
			{
				flag=1;
				break;
			}
			line= br.readLine();
			
		}
		if(flag==1)
			System.out.println("success");
		else
			System.out.println("not found");
		fr.close();
	}

}
