
public class OverSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Der2 obj=new Der2();
		obj.method();

	}

}
class Base
{
	void method()
	{
		System.out.println("base ");
	}
}
class Der extends Base
{
	void method()
	{
		super.method();
		System.out.println("derved 1");
	}
}
class Der2 extends Der
{
	
	void method()
	{
		super.method();
		System.out.println("derived 2");
	}
}