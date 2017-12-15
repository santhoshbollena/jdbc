package santhosh;
import java.util.Scanner;;
public class CodevitaF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int count=0;
		int a[]=new int[200];
		for(int y=0;y<N;y++)
		{
			a[y]=y;
		}
		for(int i=1;i<N;i++)
		{
			
			for(int j=1;j<N;j++)
			{
				if(N==a[i]+a[j]&&(i<j)&&(((a[i]%2==0)||(a[i]%3==0))&&((a[j]%2==0)||(a[j]%3==0))))
				{
					//System.out.println(a[i]+"+"+a[j]+"="+N);
					count++;
				}
				for(int m=1;m<N;m++)
				{
					
					if(N==a[i]+a[j]+a[m]&&(j<m&&i<j)&&(((a[i]%2==0)||(a[i]%3==0))||(((a[j]%2==0)||(a[j]%3==0))||((a[m]%2==0)||(a[m]%3==0))))&&(a[m-1]+a[j-1]>a[m]+a[j]))
					{
						count++;
						//System.out.println(a[i]+"+"+a[j]+"+"+a[m]+"="+N);
					}
					
				}
				
			}
			
		}
		System.out.println(count);
		
	}

}
