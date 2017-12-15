
public class Dmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj1=new B1();
		D1 obj2=new D1();
		Den2 obj3=new Den2();
		method(obj1);
		method(obj2);
		method(obj3);

	}
	static void method(B1 obj)
	{
		obj.disp();
	}

}
 class B1
{
	void disp()
	{
		System.out.println("base");
	}
}
class D1 extends B1
{
	 public void disp()
	{
		System.out.println("d1");
	}
}
class Den2 extends B1
{
	public void disp()
	{
		System.out.println("d2");
	}
}
