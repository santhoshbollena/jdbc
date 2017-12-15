package ocp;
import java.util.Scanner;
class Binery
{

	 
        public static void main(String arg[])
        {
        	 
                int number,n;
                Scanner sc=new Scanner(System.in);
                number=sc.nextInt();
                n=sc.nextInt();
                D obj=new D();
                obj.Bits(number);
                System.out.println();
                obj.Bitss(n);
                obj.add();

        }       
}
class D
{
	int a[]=new int[40];
	  int b[]=new int[40];
	  int c[]=new int[40];
	  void Bits(int n)
     {
             int m=0x80000000;
           
             for(int i=1;i<=32;i++,m>>>=1)
             {
              int r=n&m;
              b[i]=r;
             if(r==0)
                     System.out.print("0");
             else
                     System.out.print("1");
              }
     }
	  void Bitss(int n)
	     {
	             int m=0x80000000;
	           
	             for(int i=1;i<=32;i++,m>>>=1)
	             {
	              int r=n&m;
	              a[i]=r;
	             if(r==0)
	                     System.out.print("0");
	             else
	                     System.out.print("1");
	              }
	     }
	  void add()
	  {
		  for(int i=0;i<=32;i++)
		  {
			  c[i]=a[i]+b[i];
		  }
		  System.out.println();
		  for(int i=32;i>=1;i--)
		  {
			  System.out.print(c[i]);
		  }
		  
	  }
	  
}