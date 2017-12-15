package inher;

public class Single {
	public static void main(String args[])
	{
		D2 obj=new D2();
		D obj2=new D();
		obj2.mehtodd(2);
		obj.methodb(7);
		obj.md2(6);
	}

}
class B
{
	int i;
	void methodb(int k)
	{
		i=k;
		System.out.println("i in base class ="+i);
		
	}
}
class D extends B
{
	int i;
	void mehtodd(int k)
	{
		i=k;
		System.out.println("value of j in derived ="+i);
	}
}
class D2 extends B
{
	int k;
	void md2(int j)
	{
		k=j;
		System.out.println(k);
	}
}