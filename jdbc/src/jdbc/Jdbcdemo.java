package jdbc;
import java.sql.*;
import java.util.Scanner;
public class Jdbcdemo {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String s="root";
			String pass="12345";
			String url="jdbc:mysql://localhost:3306/demo";
			String q="select * from mypage ";
			
			Connection con=DriverManager.getConnection(url,s,pass);
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(q);

			Scanner sc=new Scanner(System.in);
			System.out.println("enter login id");
			String login=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			boolean flag=false;
			while(rs.next())
			{
				String loginid=rs.getString("login");
				String passwordid=rs.getString("password");
			    //cheaking code
				

				if(login.equals(loginid) & password.equals(passwordid))
				{
					System.out.println("permission granted");
					flag=true;
					break;
				}	
				
			}
			if(flag==false)
			{
				System.out.println("permission denined password or login id are incorrect");
			}
			if(flag==true)
			{
				while(true){
				System.out.println("enter your option");
				System.out.println("home , message, notification ,signout,changepassword");
				String option=sc.next();
				switch(option)
				{
				case "home":
					System.out.println("display home content");
					break;
				case "message":
					System.out.println("messageing");
					break;
				case "notification":
					System.out.println("show notification");
					break;
				case "signout":
					System.exit(0);
					break;
				case "changepassword":
					System.out.println("enter old password");
					String pass1=sc.next();
					if(pass1.equals(password)){
						System.out.println("enter new password");
						String newpass=sc.next();
						System.out.println("reenter tne password again");
						String newpass2=sc.next();
						if(newpass.equals(newpass2))
						{
							String querry="update mypage set password=newpass where login=loginid";
							st.executeQuery(querry);
						}
						else
						{
							System.out.println("reenterd password does not match with the new password");
						}
					}
					else
					{
						System.out.println("you entered wrong old password");
					}
					
				}}
			}
			st.close();
			con.close();
			
				
	}
	
}
