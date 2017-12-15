package ocp;
import java.util.Scanner;
class AddBinery
{
	    public static void  main(String args[])
	    {
	       int number1,number2;
	       Scanner obj=new Scanner(System.in);
	       number1=obj.nextInt();
	       number2=obj.nextInt();
	       int a[]=new int[20];
	       int b[]=new int[20];
	       int c[]=new int[20];
	       for(int i=0;i<10;i++)
	       {
	          a[i]=number1%2;
	          number1=number1/2;
	       }
	       for(int i=0;i<10;i++)
	       {
	         b[i]=number2%2;
	         number2=number2/2;

	       }
	       for(int i=10;i>=0;i--)
	       {
	          System.out.print(a[i]);
	       }
	       System.out.println();
	       for(int i=10;i>=0;i--)
	       {
	          System.out.print(b[i]);
	       }
	       for(int i=10;i>=0;i--)
	       {
	          c[i]=a[i]+b[i];
	       }
	       System.out.println();
	       for(int i=0;i<=10;i++)
	       {
	    	   if(c[i]==2)
	    	   {
	    		   c[i]=0;
	    		   c[i+1]=c[i+1]+1;
	    		  
	    	   }  
	    	   if(c[i]==3)
	    	   {
	    		   c[i]=1;
	    		   c[i+1]=c[i+1]+1;
	    		  
	    	   }
	    	  
	       }
	      // int x=0;
	      // int k=0;
	   /*    for(int i=10;i>=0;i--)
	       {
	    	   x +=c[i]*(2^k);
	    	   k++;
	       }
	       */
	       for(int i=10;i>=0;i--)
	       {
	    	   
	    	   System.out.print(c[i]);
	    	   
	       }
	       System.out.println();
	       one:
	       for(int i=10;i>=0;i--)
	       {
	    	   if(c[i]==1)
	    	   {
	    		   for(int j=i;j>=0;j--)
	    		   {
	    			   System.out.print(c[j]);
	    			  
	    		   }
	    		   break one;
	    	   }
	       }
	       //System.out.println();
	       //System.out.println(x);
	       
	      // System.out.println(2^7);
	       
	    }

		
		
	    
	}



