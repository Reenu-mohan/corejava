import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class jdbccondemo4 {

	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		String sql="{?=call BIG(?,?)}";
		CallableStatement cstm=con.prepareCall(sql);
		
		cstm.registerOutParameter(1,Types.INTEGER);
		
		cstm.setInt(2,200);
		cstm.setInt(3,4);
		
		
		cstm.execute();
		
			System.out.println("execteded sucessfully");
			System.out.println("result is: "+cstm.getInt(1));
			cstm.close();
			con.close();
		}
		
		
		catch(SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println(ce.getMessage());
		}
	}

}
