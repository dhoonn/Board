package DB;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/OracleDB");
			con = ds.getConnection();
			con.setAutoCommit(true);
			System.out.println("DBCP 연결");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
