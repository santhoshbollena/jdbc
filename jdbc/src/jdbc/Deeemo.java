package jdbc;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Deeemo {

	public static String login;
	public static String password;
	public static void main(String args[]) throws Exception
	{
		main34();
		Demo obj=new Demo();
	}
	static boolean flag=false;
	static String s="root";
	static String pass="12345";
	static String url="jdbc:mysql://localhost:3306/demo";
	static String q="select * from mypage ";
	static Connection con;
	static Statement st;
	static ResultSet rs;
	public static void main34() throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con=DriverManager.getConnection(url,s,pass);
		
		 st=con.createStatement();
		
		 rs=st.executeQuery(q);
	
		
		
	}

}
class Demo extends Deeemo
{
	JLabel jl1,jl2,jl3;
	JTextField jt1,jt2;
	JButton jb1;
	public Demo()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					method();
				}
			});
		}catch(Exception r){}
	}
	public void method()
	{
		JFrame frm=new JFrame("demo");
		frm.setSize(500,100);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		
		jl1=new JLabel("username");
		jl2=new JLabel("password");
		jt1=new JTextField(40);
		jt2=new JTextField(40);
		jb1=new JButton("login");
		
		frm.add(jl1);frm.add(jt1);frm.add(jl2);frm.add(jt2); frm.add(jb1);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String username1=jt1.getText();
				String password2=jt2.getText();
				try{
				while(rs.next()){
					login=rs.getString("login");
					 password=rs.getString("password");
					 if(username1.equals(login)&&(password2.equals(password))){
							JFrame frm=new JFrame("demo");
							frm.setSize(500,100);
							frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frm.setLayout(new FlowLayout());
							
							jl1=new JLabel(" succesfully loged in");
							frm.add(jl1);
							flag=true;
							
							frm.setVisible(true);
						}
						
				}
				
				//u
				if(flag==false)
				{
					JFrame frm=new JFrame("demo");
					frm.setSize(5000,100);
					frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frm.setLayout(new FlowLayout());
					
					jl1=new JLabel("username");
					jl2=new JLabel("password");
					jt1=new JTextField(40);
					jt2=new JTextField(40);
					jb1=new JButton("login");
					jl3=new JLabel("ENTERRD LOGIN OR PASSWORD ARE INCORRECT                          ");
						frm.add(jl3);
					frm.add(jl1);frm.add(jt1);frm.add(jl2);frm.add(jt2); frm.add(jb1);
					
					jb1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							String username1=jt1.getText();
							String password2=jt2.getText();
							try{
							while(rs.next()){
								login=rs.getString("login");
								 password=rs.getString("password");
								 if(username1.equals(login)&&(password2.equals(password))){
										JFrame frm=new JFrame("demo");
										frm.setSize(500,100);
										frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
										frm.setLayout(new FlowLayout());
										
										jl1=new JLabel(" succesfully loged in");
										flag=true;
										
										frm.setVisible(true);
									}
							}
							
							}
							catch(Exception r)
							{
								System.out.println("exception caught");
							}
							
							
							frm.setVisible(true);
							
							//
							
							
							//
							
							
							
							
							
						}
					});
					frm.setVisible(true);
				}
				//u
				
				}
				catch(Exception r)
				{
					System.out.println("exception caught");
				}
				
				
				
				
				//
			
				
				//
				
				
				
				
				
			}
		});
		frm.setVisible(true);
	}
}
