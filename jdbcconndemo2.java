
import java.io.*;
import java.sql.*;

public class jdbcconndemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcurl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(jdbcurl, username, password);
			Statement stm = con.createStatement();// create a statement obj

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("please enter your name ");
			String name1 = br.readLine();

			// ResultSet rs=stm.executeQuery("delete from employee where name=?");
			String sql = "delete from employee where  name  =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name1);
			ps.executeUpdate();
			System.out.println("DELETED");

			ResultSet rs = stm.executeQuery("select * from employee");
			while (rs.next()) {
				String fname = rs.getString(1);
				int sal = rs.getInt(2);
				String dep = rs.getString(3);

				System.out.println("name: " + fname + "    Salary: " + sal + "    Department: " + dep);

			}

			ResultSetMetaData md = rs.getMetaData();
			System.out.println("no of columns in table: " + md.getColumnCount());
			System.out.println(md.getColumnDisplaySize(2));
			System.out.println(md.getColumnType(2));

			DatabaseMetaData dmd = con.getMetaData();
			System.out.println(dmd.getDatabaseProductName());
			System.out.println(dmd.getCatalogs());
			System.out.println(dmd.allProceduresAreCallable());
			System.out.println(dmd.getCatalogSeparator());
			System.out.println(dmd.getCatalogSeparator());
			// ps.setString("X01"); 3a
			// ps.setString("Finance");
			// ps.setString("A00");
			// ps.addBatch();

			rs.close();
			stm.close();
			con.close();

		} catch (SQLException  e ) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}
	}

}
