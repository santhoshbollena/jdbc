import java.util.Scanner;
public class Voterss {
	public static void main(String args[])
	{
		System.out.println("enter the number of member");
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		System.out.println("enter the member name");
		String s[]=new String[10];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		//for(int i=0;i<=n;i++)
		//{
		//	System.out.println(s[i]);

		//}
		for(int i=0;i<n-1;i++)
		{
			if(s[0].equals(s[i+1]))
			{
				System.out.println(s[0]);
			}

		}
		for(int i=2;i<n;i++)
		{
			if(s[1].equals(s[i]))
			{
				System.out.println(s[1]);
			}

		}
		for(int i=3;i<n;i++)
		{
			if(s[2].equals(s[i]))
			{
				System.out.println(s[2]);
			}

		}
		for(int i=4;i<n-1;i++)
		{
			if(s[3].equals(s[i]))
			{
				System.out.println(s[3]);
			}

		}for(int i=5;i<n-1;i++)
		{
			if(s[4].equals(s[i]))
			{
				System.out.println(s[4]);
			}

		}
		for(int i=6;i<n-1;i++)
		{
			if(s[5].equals(s[i]))
			{
				System.out.println(s[5]);
			}

		}
		for(int i=7;i<n-1;i++)
		{
			if(s[6].equals(s[i]))
			{
				System.out.println(s[6]);
			}

		}
		for(int i=8;i<n-1;i++)
		{
			if(s[7].equals(s[i]))
			{
				System.out.println(s[7]);
			}

		}
		
		
		
		
	}

}
