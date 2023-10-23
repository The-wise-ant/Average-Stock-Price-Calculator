package shapes;

public abstract class Shape {

	protected double area;
	protected double perimeter;

	/////////////// GETTERS//////////////////


	public abstract double getPerimeter();

	public abstract double getArea();

	/////////////// SETTERS//////////////////



	public abstract void setPerimeter(double newPerimeter);

	public abstract void setArea(double newArea);

}
