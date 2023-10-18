
public class Square {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	public Square(double value, String parameterType) {
		if (parameterType.equalsIgnoreCase("area")) {
			this.side = Math.sqrt(value);
		} else if (parameterType.equalsIgnoreCase("perimeter")) {
			this.side = value / 4;
		}
	}

	public double getArea() {
		return side * side;
	}

	public double getPerimeter() {
		return 4 * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double newSide) {
		side = newSide;
	}

	public void setPerimeter(double newPerimeter) {
		side = newPerimeter / 4;
	}

	public void setArea(double newArea) {
		side = Math.sqrt(newArea);
	}
}
