package shapes;

public abstract class Shape {

	protected double area;
	 protected double perimeter;
	 
		public abstract String getSides();

	public abstract double getPerimeter();

	public abstract double getArea();

	public abstract void setPerimeter(double newPerimeter);

	public abstract void setArea(double newArea);



}
