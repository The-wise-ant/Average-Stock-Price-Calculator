package triangles;

public class IsoscelesTriangle extends Triangle {

	private double perimeter;
	private double area;

	private double base;
	private double side;
	private double height;

	public IsoscelesTriangle(double newBase, double newSide) {
		setSide(newBase, newSide);

	}

	/////////////// GETTERS//////////////////////
	
	@Override
	public double getSide() {
		return this.side;
	}
	
	private double getBase() {
		return this.base;
	}

	@Override
	public double getPerimeter() {
		return this.perimeter;
	}

	@Override
	public double getArea() {
		return this.area;
	}

	//////////////// SETTERS///////////////////////

	public void setSide(double newSide, double newBase) {
		this.side = newSide;
		this.base = newBase;
		this.perimeter = base + newSide * 2;
		this.height = Math.sqrt(Math.pow(newSide, 2) - Math.pow((newBase / 2), 2));
		this.area = (newBase * height) / 2;
	}

	@Override
	public void setPerimeter(double newPerimeter) {
		this.perimeter = newPerimeter;
		this.side = (newPerimeter - base) / 2;
		this.height = Math.sqrt(Math.pow(side, 2) - Math.pow((base / 2), 2));
		this.area = (base * height) / 2;
	}

	@Override
	public void setArea(double newArea) {
		this.area = newArea;
		this.height = (2 * newArea) / base;
		this.side = Math.sqrt(Math.pow(height, 2) + Math.pow((base / 2), 2));
		this.perimeter = base + side * 2;
	}
	////////////////////
	
	@Override
	public String toString() {
		
		return "Your triangle has a base of " + this.getBase() + ", side of " + this.getSide()+ 
				", a perimeter of " + this.getPerimeter() + " and an area of " + this.getArea();
				}
	
	
	

	

}
