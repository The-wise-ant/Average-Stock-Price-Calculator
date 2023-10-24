package triangles;

import shapes.*;

public class EquilateralTriangle extends Triangle {

	private double side;
	private double perimeter;

	private double area;

	protected EquilateralTriangle(double newSide) {
		setSide(newSide);
	}

	//////// GETTERS//////////////

	public double getSide() {
		return this.side;
	}

	public double getPerimeter() {

		return this.perimeter;
	}

	public double getArea() {
		return this.area;
	}

	/////// SETTERS////////////

	public void setSide(double newSide) {
		this.side = newSide;
		this.perimeter = newSide * 3;
		this.area = (Math.pow(newSide, 2) * Math.sqrt(3)) / 4;

	}

	public void setPerimeter(double newPerimeter) {
		this.perimeter = newPerimeter;
		double newSide = newPerimeter / 3;
		this.side = newSide;

		this.area = (Math.pow(newSide, 2) * Math.sqrt(3)) / 4;
	}

	public void setArea(double newArea) {
		this.area = newArea;
		double newSide = Math.sqrt((4 * area) / Math.sqrt(3));
		this.side = newSide;
		this.perimeter = newSide * 3;

	}
	///////////////////////////////

	@Override
	public String toString() {
         return "Your triangle is an equilateral triangle. " + 
	             "It has three sides of " + this.getSide() + ", a perimeter of " 
		          + this.getPerimeter() + " and an area of " + this.getArea() + "\n";
	}

}
