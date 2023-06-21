package Generic;
// class bounded parameters
public class BoundedClass<T extends Number> {
	private T E;

	public T getE() {
		return E;
	}

	public void setE(T e) {
		E = e;
	}
	public void display( T E)
	{
		System.out.println("Value of Element =" +E);
	}
	public static void main(String[] args)
	{
		BoundedClass<Number> b1=new BoundedClass<Number>();
		Integer E=8;
		b1.display(E);
		Double E1=9.0;
		b1.display(E1);
		
	}
	
}