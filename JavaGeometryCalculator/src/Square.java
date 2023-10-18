
public class Square extends Shape {
	private double side;
	
	////CONSTRUCTORS//////

	public Square(double side) {
		this.side = side;
		this.perimeter = side * 4;
		this.area = side * side;
	}

	public Square(double value, String parameterType) {
		if (parameterType.equalsIgnoreCase("area")) {
			setArea(value);

		} else if (parameterType.equalsIgnoreCase("perimeter")) {
			setPerimeter(value);
		}
	}

	//// GETTERS///////

	public double getSide() {
		return this.side;
	}

	@Override
	public double getArea() {
		return this.area;
	}

	@Override
	public double getPerimeter() {
		return this.perimeter;
	}

	///// SETTERS///////

	public void setSide(double newSide) {
		this.side = newSide;
		this.perimeter = newSide * 4;
		this.area = newSide * newSide;
	}

	@Override
	public void setPerimeter(double newPerimeter) {
		this.perimeter = newPerimeter;
		this.side = newPerimeter / 4;
		this.area = (newPerimeter / 4) * (newPerimeter / 4);
	}

	@Override
	public void setArea(double newArea) {
		this.side = Math.sqrt(newArea);
		this.perimeter = Math.sqrt(newArea) * 4;
	}

}
