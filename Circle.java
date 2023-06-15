package shapes;

public class Circle  extends Shape{
	private int radius;
	

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		 double area=3.14*radius*radius;
		 System.out.println("area of circle =" +area);
	}

	@Override
	public void circumference() {
		// TODO Auto-generated method stub
		double circum=2*3.14*radius;
		System.out.println("Circumference of circle = "+circum);
		
	}

       @Override
	public void set() {
		// TODO Auto-generated method stub
		radius=9;
		System.out.println("value updated = " +radius);
	}
@Override
  public void print() {
		// TODO Auto-generated method stub
		System.out.println("Demo of abstract classes");
		
	}

}
