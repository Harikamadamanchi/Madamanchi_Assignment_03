package singletonExample;

public class PureSingletonExample {
	private static PureSingletonExample single_instance = null;
	public String s;
	private PureSingletonExample()
	{
		s = "string part of Singleton class";
	}
	public static PureSingletonExample getInstance()
	{
		if (single_instance == null)
			single_instance = new PureSingletonExample();

		return single_instance;
	}

}
class SingletonDriver {
	public static void main(String args[])
	{
		PureSingletonExample x = PureSingletonExample.getInstance();
		PureSingletonExample y = PureSingletonExample.getInstance();
		PureSingletonExample z = PureSingletonExample.getInstance();
		System.out.println("Hashcode of x is "+ x.hashCode());
		System.out.println("Hashcode of y is "+ y.hashCode());
		System.out.println("Hashcode of z is " + z.hashCode());
		if (x == y && y == z) {
			System.out.println(
					"Three objects will point to the same memory location on the heap i.e, to the same object");
		}
		else {
			System.out.println(
					"Three objects will not point to the same memory location on the heap");
		}
	}
}



