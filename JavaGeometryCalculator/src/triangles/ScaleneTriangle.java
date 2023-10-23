package triangles;

import java.util.Scanner;

public class ScaleneTriangle extends Triangle {

	private double sideA;
	private double sideB;
	private double sideC;

	public ScaleneTriangle(double newSideA, double newSideB, double newSideC) {

		this.perimeter = newSideA + newSideB + newSideC;

		double s = (newSideA + newSideB + newSideC) / 2;
		this.area = Math.sqrt(s * (s - newSideA) * (s - newSideB) * (s - newSideC));

	}

	/////////////////////// GETTERS/////////////////////

	private double getSideA() {
		return this.sideA;
	}

	private double getSideB() {
		return this.sideB;
	}

	private double getSideC() {
		return this.sideC;
	}

	@Override
	public double getPerimeter() {
		return this.perimeter;
	}

	@Override
	public double getArea() {
		return this.area;
	}

	/////////////////////// SETTERS/////////////////////

	public void setSide() {
	}

	@Override
	public void setPerimeter(double newPerimeter) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter new lengths for Side A, Side B and Side C in this order separeted by comma");
		String input = scan.nextLine();

		String[] sides = input.split(",");
		this.sideA = Integer.valueOf(sides[0]);

		this.sideB = Integer.valueOf(sides[1]);

		this.sideC = Integer.valueOf(sides[2]);

		this.perimeter = newPerimeter;

		double s = (this.sideA + this.sideB + this.sideC) / 2;
		this.area = Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));

	}

	@Override
	public void setArea(double newArea) {
		this.area = newArea;

		Scanner scan = new Scanner(System.in);
		System.out.println("enter new lengths for Side A, Side B and Side C in this order separeted by comma");
		String input = scan.nextLine();

		String[] sides = input.split(",");
		this.sideA = Integer.valueOf(sides[0]);

		this.sideB = Integer.valueOf(sides[1]);

		this.sideC = Integer.valueOf(sides[2]);

		this.perimeter = this.sideA + this.sideB + this.sideC;

	}

	//////////////////////////////////

	@Override
	public String toString() {
		return "Your triangle has three sides of " + this.getSideA() + ", " + this.getSideB() + " and "
				+ this.getSideC() + ", a perimeter of " + this.getPerimeter() + " and an area of " + this.getArea();
	}

	@Override
	public double getSide() {

		return 0;

	}

}
