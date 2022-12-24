package GirisPaneli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Panel {

	static final String DB = "jdbc:mysql://localhost:3306";
	static final String USER = "root";
	static final String PASS = "rott";

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB, USER, PASS);
		Statement st = con.createStatement();
		System.out.println("Veri tabanina baglandi");

	}

}
