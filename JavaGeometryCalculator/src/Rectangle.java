
public class Rectangle {

	private double width;
	private double length;

	Rectangle(double width, double length) {

		this.width = width;
		this.length = length;

	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {

		return 2 * (width * length);
	}

	public double getDiagonal() {

		return Math.sqrt((Math.pow(length, 2) + Math.pow(width, 2)));
	}

}
