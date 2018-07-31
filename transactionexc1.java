import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class transactionexc1 {

	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		Statement stm = con.createStatement();
		con.setAutoCommit(false);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter the name");
		String name = br.readLine();
		
		System.out.println("enter the date");
		String date1 = br.readLine();
		
		System.out.println("enter the steps");
		int steps=Integer.parseInt(br.readLine());
		
		PreparedStatement ps = con.prepareStatement("insert into dailysteps values (?,?,?)");

		ps.setString(1, name);
		ps.setDate(2, Date.valueOf(date1));
		ps.setInt(3, steps);
		
		int i=ps.executeUpdate();
		
		PreparedStatement ps1 = con.prepareStatement("update totalsteps set steps= steps + ? where trim(name)=?");
		
		ps1.setInt(1, steps);
		
		ps1.setString(2, name);
		
		int j=ps1.executeUpdate();
	
		
		if((i>0)&&(j>0))
		{
			con.commit(); 
			System.out.println("committed");
		}
		else 
			{con.rollback();
			System.out.println("rollbacked");
			}
		ps1.close();
		ps.close();
		con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception ee) {
			System.out.println(ee.getMessage());
		}
		
	}

}
