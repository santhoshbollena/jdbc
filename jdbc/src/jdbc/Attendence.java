package jdbc;
import java.sql.*;
import java.util.Scanner;
import java.util.*;
public class Attendence {
	static String str;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","12345");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		String query="";
		
		//	getting computers time
		Calendar cal=Calendar.getInstance();
		Formatter f=new Formatter();
		f.format("%tH",cal);
		str=f.toString();
		System.out.println(str);
	
		int hr=Integer.parseInt(str);
		System.out.println(hr);
		
		
		f.format("%tM", cal);
		String min=f.toString();
		int mn=Integer.parseInt(min);
		System.out.println(mn);
		
		int time=hr*60+mn;
		System.out.println(time);
		
		
		//setting attendence for first period
		if(time<580&&time>550)
		{
			while(time<580&&time>550)
			{
				f.format("%tH",cal);
				str=f.toString();							
				 hr=Integer.parseInt(str);								
				f.format("%tM", cal);
				 min=f.toString();
				 mn=Integer.parseInt(min);	
				 time=hr*60+mn;
				
				
				System.out.println("enter your roll number");
				String roll=sc.next();
				query="update attendence set attendfirstp='P' where rollno='"+roll+"';";
			}
		}
		else 
		{
			query="update attendence set attendfirstp='A' where attendfirstp='-'";
		}
		
		
		st.execute(query);
		
		//if absent sending absent message to absent people
		
		query="select phono,name from attendence where attendfirstp='A';";
		ResultSet rst=st.executeQuery(query);
		while(rst.next())
		{
			System.out.println("sending absent messages to these numbers "+rst.getInt("phono")+" as "+rst.getString("name")+" your ward absent for first period");
		}
		
		
		//attendence for second period 
		
		if(time<630&&time>610)
		{
			while(time<630&&time>610)
			{
				f.format("%tH",cal);
				str=f.toString();							
				 hr=Integer.parseInt(str);								
				f.format("%tM", cal);
				 min=f.toString();
				 mn=Integer.parseInt(min);	
				 time=hr*60+mn;
				
				
				System.out.println("enter your roll number");
				String roll=sc.next();
				query="update attendence set attendsecondp='P' where rollno='"+roll+"';";
			}
		}
		else 
		{
			query="update attendence set attendsecondp='A' where attendsecondp='-'";
		}
		
		
		st.execute(query);
		
		//if absent sending absent message to absent people
		
		query="select phono,name from attendence where attendsecondp='A';";
		 rst=st.executeQuery(query);
		 System.out.println();
		while(rst.next())
		{
			System.out.println("sending absent messages to these numbers "+rst.getInt("phono")+" as "+rst.getString("name")+" your ward absent for second period");
		}
		
		//attendence for third period
		
		if(time<680&&time>660)
		{
			while(time<680&&time>560)
			{
				f.format("%tH",cal);
				str=f.toString();							
				 hr=Integer.parseInt(str);								
				f.format("%tM", cal);
				 min=f.toString();
				 mn=Integer.parseInt(min);	
				 time=hr*60+mn;
				
				
				System.out.println("enter your roll number");
				String roll=sc.next();
				query="update attendence set attendthirdp='P' where rollno='"+roll+"';";
			}
		}
		else 
		{
			query="update attendence set attendthirdp='A' where attendthirdp='-'";
		}
		
		
		st.execute(query);
		
		//if absent sending absent message to absent people
		System.out.println();
		query="select phono,name from attendence where attendthirdp='A';";
		 rst=st.executeQuery(query);
		while(rst.next())
		{
			System.out.println("sending absent messages to these numbers "+rst.getInt("phono")+" as "+rst.getString("name")+" your ward absent for third period");
		}
		
		//attendence for fourth period
		
		if(time<730&&time>710)
		{
			while(time<730&&time>710)
			{
				f.format("%tH",cal);
				str=f.toString();							
				 hr=Integer.parseInt(str);								
				f.format("%tM", cal);
				 min=f.toString();
				 mn=Integer.parseInt(min);	
				 time=hr*60+mn;
				
				
				System.out.println("enter your roll number");
				String roll=sc.next();
				query="update attendence set attendfourthp='P' where rollno='"+roll+"';";
			}
		}
		else 
		{
			query="update attendence set attendfourthp='A' where attendfourthp='-'";
		}
		
		
		st.execute(query);
		
		//if absent sending absent message to absent people
		System.out.println();
		query="select phono,name from attendence where attendfourthp='A';";
		 rst=st.executeQuery(query);
		while(rst.next())
		{
			System.out.println("sending absent messages to these numbers "+rst.getInt("phono")+" as "+rst.getString("name")+" your ward absent for fourth period");
		}
		
		
		
		st.close();
		con.close();
		
	}
	

}
