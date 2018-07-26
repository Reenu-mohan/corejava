
import java.io.*;

public class filewriterexc {
	
	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr= new  InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		FileWriter fos= new FileWriter("D:\\reenu\\sample3.txt");
		BufferedWriter bw=new BufferedWriter(fos);	
		System.out.println("please enter your city ");
		String city =br.readLine();
		while(!city.equalsIgnoreCase("stop"))
		{
			
			System.out.println("please enter your city ");
			city =br.readLine();
			
			bw.write(city);
			bw.newLine();
				}
		
			bw.close();
			fos.close();
			br.close();
			isr.close();
			
			

}
}