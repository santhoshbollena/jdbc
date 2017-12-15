package inher;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		de o=new de();
		o.eat();
		Ba obj=new Ba();
		obj.eat();
		System.out.println();
		dee obj1=new dee();
		obj1.me(o);//de
		obj1.me(obj);//ba
		Ba oo=new de();
		obj1.me(oo);
	    

	}

}
class Ba
{
	  void eat()
	{
		System.out.println("eat ba");
	}
}
class de extends Ba
{
	public void eat()
	{
		
		System.out.println("eat de");
	}
}
class dee
{
	void me(Ba obj)
	{
		System.out.println("baa in dee");
	}
	void me(de obj)
	{
		System.out.println("de in dee");
	}
}