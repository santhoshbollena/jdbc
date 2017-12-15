package ocp;
import java.util.Scanner;
public class Voter {
	public static void main(String args[])
	{
		System.out.println("enter 2 names of the candidates who are partispating in electio");
		Scanner sc=new Scanner(System.in);
		String s,m;
		s=sc.nextLine();
		m=sc.nextLine();
		System.out.println("the two candidates are"+m+s);
		System.out.println("enter number of voters");
		int n;
		n=sc.nextInt();
		System.out.println("enter your choice");
		String ch[]=new String[10];
		for(int i=0;i<=n;i++)
		{
			ch[i]=sc.nextLine();
		}
		int ss=0,mm=0;
		for(int i=0;i<=n;i++)
		{
			if(ch[i].equals(s))
			{
				ss++;
			}
			else if(ch[i].equals(m))
			{
				mm++;
			}
		}
		
		System.out.println("the number of voters for "+s+"="+ss);
		System.out.println("the number of voter for "+m+"="+mm);
		if(mm>ss)
		{
			System.out.println("winner is"+m);
		}
		else if(ss>mm)
		{
			System.out.println("winner is"+s);
		}
		else if(mm==ss)
		{
			System.out.println("the voyes for each candidate is same so the winner in name sorted order is");
			if(s.compareTo(m)>0)
			{
				System.out.println(s);
			}
			else 
				System.out.println(m);
		}
	}

}
