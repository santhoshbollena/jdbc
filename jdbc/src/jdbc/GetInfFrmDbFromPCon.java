package jdbc;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GetInfFrmDbFromPCon {

	public static String login;
	public static String password;
	public static void main(String args[]) throws Exception
	{
		main34();
		
	}
	static boolean flag=false;
	static String s="root";
	static String pass="12345";
	static String url="jdbc:mysql://localhost:3306/demo";
	static String sa="santhosh";
	static String q="select password from mypage where login='santhosh'";
	static Connection con;
	static Statement st;
	static ResultSet rs;
	public static void main34() throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con=DriverManager.getConnection(url,s,pass);
		
		 st=con.createStatement();
		
		 rs=st.executeQuery(q);
		 rs.next();
		 String name=rs.getString("password");
		 System.out.println(name);
		
		
	}

}