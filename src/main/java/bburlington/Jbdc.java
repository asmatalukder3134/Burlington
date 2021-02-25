package bburlington;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jbdc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String uname="null";
		String pword="null";
		String url="url";
		Connection con;
		Statement st;
		ResultSet rs;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(uname,pword,url);
		st=con.createStatement();
		rs=st.executeQuery(null);
		if(rs.next()) {
			System.out.println(rs.getString(0) );
		}

	}

	
}
