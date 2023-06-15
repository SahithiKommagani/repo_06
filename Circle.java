package shapes;

public class Circle  extends Shape{
	private int radius;
	

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public void area() {
		// TODO Auto-generated method stub
		 double area=3.14*radius*radius;
		 System.out.println("area of circle =" +area);
	}

	
	public void circumference() {
		// TODO Auto-generated method stub
		double circum=2*3.14*radius;
		System.out.println("Circumference of circle = "+circum);
		
	}


	public void set() {
		// TODO Auto-generated method stub
		radius=9;
		System.out.println("value updated = " +radius);
	}

  public void print() {
		// TODO Auto-generated method stub
		System.out.println("Demo of abstract classes");
		
	}

}
