package inher;

public class Cons {
	public static void main(String args[])
	{
		D1112 obj=new D1112();
		D1112 obj2=new D1112(1,2,3);
		
	}

}
class B111
{
	int i;
	B111()
	{
		System.out.println("B()");
	}
	B111(int i1)
	{
		i=i1;
		System.out.println("B("+i+")");
	}
}
class D111 extends B111
{
	int j;
	D111()
	{
		super();
		System.out.println("D()");
	}
	D111(int i1,int j1)
	{
		super(i1);
		j=j1;
		System.out.println("D("+j+")");
	}
}
class D1112 extends D111
{
	int k;
	D1112()
	{
		super();
		System.out.println("D2()");
	}
	D1112(int i1,int j1,int k1)
	{
		super(i1,j1);
		k=k1;
	}
}