import java.util.Scanner;
public class VV {
	public static void main(String args[])
	{
		System.out.println("enter the number of member");
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		System.out.println("enter the member name");
		String s[]=new String[20];
		String str[]=new String[20];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		//for(int i=0;i<=n;i++)
		//{
		//	System.out.println(s[i]);

		//}
		int k=0;
		for(int i=n-1;i>=0;i--)
		{
			for(int j=i;j>0;j--)
			{
			if(s[i].equals(s[j-1]))
			{
			
				str[k]=s[i];
				k++;
				
			}
			}

		}
		//System.out.println("the");
		
		System.out.println(str[0]);
		//System.out.println();System.out.println(str[1]);
		
		
		
	}

}

