package jdbc;
import  javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Appletdemowithpageview
{
	public static String login;
	public static String password;
	public static void main(String args[]) throws Exception
	{
		main34();
		Mypage obj=new Mypage();
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
class Mypage extends Appletdemowithpageview
{
	JButton jb1,jb2,jb3,jb4;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;
	JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8;
	Mypage()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable()
			{
				public void run()
				{
					createGui();
				}
			});
		}catch(Exception e)
		{
			
		}
	}
	public void createGui()
	{
		//	BASIC HOME PAGE
		JFrame frm=new JFrame("MYPAGE ");
		frm.setSize(300,500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		jb1=new JButton("home");
		jb2=new JButton("about us");
		jb3=new JButton("contact us");
		jb4=new JButton("log in");
		jl1=new JLabel("My Page");
		jl2=new JLabel("decription of my page");
		
		frm.add(jl1);
		frm.add(jb1);
		frm.add(jb2);
		frm.add(jb3);
		frm.add(jb4);
		frm.add(jl2);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				// HOME PAGE WHEN HOME BUTTON IS PRESSED

				JFrame frm=new JFrame("MYPAGE ");
				frm.setSize(300,500);
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm.setLayout(new FlowLayout());
				jb1=new JButton("home");
				jb2=new JButton("about us");
				jb3=new JButton("contact us");
				jb4=new JButton("log in");
				jl1=new JLabel("My Page");
				jl2=new JLabel("decription of my page");
				
				frm.add(jl1);
				frm.add(jb1);
				frm.add(jb2);
				frm.add(jb3);
				frm.add(jb4);
				frm.add(jl2);
				frm.setVisible(true);
			}
		});
		
		//ABOUT US BUTTON INFO
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFrame frm=new JFrame("MYPAGE ");
				frm.setSize(300,500);
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm.setLayout(new FlowLayout());
				jl2=new JLabel("decription of my page");
				jl1=new JLabel("My Page");
				frm.add(jl1);
				frm.add(jl2);
				frm.setVisible(true);
			}
		});
		//CONTACT US INFO
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFrame frm=new JFrame("MYPAGE ");
				frm.setSize(300,500);
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm.setLayout(new FlowLayout());
				jl2=new JLabel("decription of my page");
				jl1=new JLabel("My Page");
				jl3=new JLabel("contact us");
				jl4=new JLabel("santhosh kumar");
				frm.add(jl1);
				frm.add(jl3);
				frm.add(jl4);
				//frm.add(jl2);
				frm.setVisible(true);
			}
		});
		//LOGIN INFO
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFrame frm=new JFrame("demo");
				frm.setSize(500,100);
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm.setLayout(new FlowLayout());
				
				jl1=new JLabel("username");
				jl2=new JLabel("password");
				jt1=new JTextField(40);
				jt2=new JTextField(40);
				jb1=new JButton("login");
				jb2=new JButton("forget password");
				jb3=new JButton("new registration");
				
				frm.add(jl1);frm.add(jt1);frm.add(jl2);frm.add(jt2); frm.add(jb1);
				frm.add(jb2);frm.add(jb3);
				//login info
	
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
												frm.add(jl1);
												frm.setVisible(true);
											}
									}
									
									}
									catch(Exception r)
									{
										System.out.println("exception caught 1 +" +r);
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
							System.out.println("exception caught 2"+r);
						}
						
						
						
						
						//
					
						
						//
						
						
						frm.setVisible(true);
						
						
					}
				});
				
				//FORGET PASSWORD INFO
				jb2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						JFrame frm=new JFrame("MYPAGE ");
						frm.setSize(300,500);
						frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frm.setLayout(new FlowLayout());
						jb1=new JButton("home");
						
						jb4=new JButton("log in");
						jl1=new JLabel("My Page");
						
						jl2=new JLabel("FORGET PASSWORD                                              ");
						jl3=new JLabel("enter username");
						jt1=new JTextField(40);
						jb2=new JButton("submit");
						frm.add(jl1);
						frm.add(jb1);
						frm.add(jb4);
						frm.add(jl2);frm.add(jl3);frm.add(jt1);frm.add(jb2);
						String forpass=jt1.getText();
						String forgotpassq="select password from mypage where login=forpass";
						frm.setVisible(true);
					}
				});
				//NEW REGISTRATION INFO
				jb3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						JFrame frm=new JFrame("MYPAGE ");
						frm.setSize(300,500);
						frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frm.setLayout(new FlowLayout());
						jl1=new JLabel("REGISTRATION PAGE                                          ");
						jl2=new JLabel("First name");
						jt1=new JTextField(30);
						jl3=new JLabel("Last name");
						jt2=new JTextField(30);
						jl4=new JLabel("Email id");
						jt3=new JTextField(30);
						jl5=new JLabel("contact number");
						jt4=new JTextField(30);
						jl6=new JLabel("password");
						jt5=new JTextField(30);
						jl7=new JLabel("re-enter password");
						jt6=new JTextField(30);
						jl8=new JLabel("date of birth");
						jt7=new JTextField(30);
						jb1=new JButton("CONFIRM");
						frm.add(jl1);
						frm.add(jl2);
						frm.add(jt1);
						frm.add(jl3);
						frm.add(jt2);
						frm.add(jl4);
						frm.add(jt3);
						frm.add(jl5);
						frm.add(jt4);
						frm.add(jl6);
						frm.add(jt5);
						frm.add(jl7);
						frm.add(jt6);frm.add(jl8);frm.add(jt7);frm.add(jb1);
						
						frm.setVisible(true);
					}
				});
				
				frm.setVisible(true);
			}
		});
		frm.setVisible(true);
		
	}
}