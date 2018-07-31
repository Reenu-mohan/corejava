import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class jdbccon3demo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcurl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcurl, username, password);
			Statement stm = con.createStatement();// create a statement obj

			System.out.println("enter the choice ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String name = br.readLine();
			PreparedStatement ps = con
					.prepareStatement("UPDATE employee SET name=?,salary=?,department=? where name=?");

			ps.setString(1, "reenu");
			ps.setDouble(2, 120000);
			ps.setString(3, "Finance");
			ps.setString(4, name);
			ps.addBatch();

			System.out.println("UPADTE");

			// ps.setString(1,"ibin");
			// ps.setDouble(2,150000);
			// ps.setString(3,"Finance");
			// ps.addBatch();

			// ps.executeBatch();
			ps.executeBatch();

			ps.clearBatch();

			// rs.close();
			stm.close();
			con.close();

		} catch (Exception i) {
			System.out.println(i.getMessage());
		}

	}

}
