import shapes.Shape;

public class Circle extends Shape {

	double piValue = GeometryConstants.PI.getValue();
	private double radius;
	private double diameter;

	public Circle(double radius) {

		this.radius = radius;
		this.diameter = 2 * radius;
		this.perimeter = 2 * (piValue * radius);
		this.area = piValue * (radius * radius);
	}

	//////// GETTERS//////
	@Override
	public String getSides() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public double getArea() {
		return this.area;
	}

	public double getCircumference() {
		return getPerimeter();
	}

	@Override
	public double getPerimeter() {
		return this.perimeter;
	}

	public double getDiameter() {
		return this.diameter;
	}

	public double getRadius() {
		return this.radius;
	}

	/////// SETTERS

	@Override
	public void setPerimeter(double newPerimeter) {

	    double newRadius = newPerimeter / (2 * piValue);
	    this.radius = newRadius;
	    this.diameter = 2 * newRadius;
	    this.area = piValue * (newRadius * newRadius);
	    this.perimeter = newPerimeter;
	}


	@Override
	public void setArea(double newArea) {

	    double newRadius = Math.sqrt(newArea / piValue);
	    this.radius = newRadius;
	    this.diameter = 2 * newRadius;
	    this.area = newArea;
	  
	    this.perimeter = 2 * (piValue * newRadius);
	}




}
