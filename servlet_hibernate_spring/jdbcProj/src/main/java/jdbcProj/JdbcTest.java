package jdbcProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tapan_db", "root", "root");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from emp");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		}

		System.out.println("--------------PreparedStatement---------------------");
		PreparedStatement ps = con.prepareStatement("select * from emp where sal between ? and ?");
		ps.setInt(1, 2000);
		ps.setInt(2, 3000);

		ResultSet rs1 = ps.executeQuery();

		while (rs1.next()) {
			System.out.println(rs1.getInt(1) + " : " + rs1.getInt(6));
		}

	}

}
