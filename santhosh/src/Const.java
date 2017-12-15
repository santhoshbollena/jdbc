


public class Const {
	public static void main(String args[])
	{
		D2 obj=new D2();
		D2 obj2=new D2(1,2,3);
		
	}

}
class B
{
	int i;
	B()
	{
		System.out.println("B()");
	}
	B(int i1)
	{
		i=i1;
		System.out.println("B("+i+")");
	}
}
class D extends B
{
	int j;
	D()
	{
		super();
		System.out.println("D()");
	}
	D(int i1,int j1)
	{
		super(i1);
		j=j1;
		System.out.println("D("+j+")");
	}
}
class D2 extends D
{
	int k;
	D2()
	{
		super();
		System.out.println("D2()");
	}
	D2(int i1,int j1,int k1)
	{
		super(i1,j1);
		k=k1;
	}
}
