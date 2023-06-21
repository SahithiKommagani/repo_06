//Program on Generic Types
package Generic;
//generic class //unbounded parameters
public class Generic<T> {//can accept any type of objects
	private T a,b,c;

	public Generic(T a, T b, T c) {
		super();
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void print()
	{
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		System.out.println(c.getClass());
	}
	//using generic method unbounded parameters
	public static <T> void print1(T[] array)//here return type maybe anything we are using void if we dont return also it will not throw any error
	{
		for(T ar:array)
			System.out.println(ar);
		System.out.println(array.getClass());
		System.out.println();
	}
	//using generic unbounded
	public static <T1> boolean isEven1(T1 E)//here E is element
	{
		return ((Number) E).doubleValue()%2==0;//casting is required if the method is unbounded
	}
	//using generic bounded
	public static <T extends Number> boolean isEven(T E)
	{
		return E.doubleValue()%2==0;//no casting required if method is bounded
	}
	public static void main(String[] args)
	{
		Generic<Double> obj=new Generic<Double>(10.0,11.5,7.8);
		obj.print();
		Generic<String> obj1=new Generic<String>("j","k","l");
		obj1.print();
		Double[] array= {1.6,4.5,8.7,3.5};
		print1(array);
		String[] array1= {"Sahithi","Hyderabad","HV"};
		print1(array1);
		System.out.println("checking whether given input is even using unbounded parameters = " + isEven1(10));
		System.out.println("checking whether given input is even using bounded parameters = " + isEven(8));
		//System.out.println(isEven1("sahithi"));//compile time error
		//System.out.println(isEven("sahithi"));//throws error because of bounded parameter //runtime error
		
	}

}
