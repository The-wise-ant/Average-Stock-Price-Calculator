import shapes.Shape;

public class Rectangle extends Shape {

	private double width;
	private double length;

	private double diagonal;

	Rectangle(double width, double length) {

		this.width = width;
		this.length = length;

		this.area = width * length;
		this.perimeter = 2 * (width * length);
		this.diagonal = Math.sqrt((Math.pow(length, 2) + Math.pow(width, 2)));

	}
	
	
	//////GETTERS///////////
	@Override
	public String getSides() {
		// TODO Auto-generated method stub
		return null;
	}
	

	

	public double getWidth() {
		return this.width;
	}


	public double getLength() {
		return this.length;
	}

	
	
	
	@Override
	public double getArea() {
		return this.area;
	}

	@Override
	public double getPerimeter() {

		return this.perimeter;
	}

	public double getDiagonal() {

		return this.diagonal;
	}
	

	@Override
	public void setPerimeter(double newPerimeter) {
	    // Calculate the new width and length based on the given perimeter
	    this.width = newPerimeter / (2 + this.length);
	    this.length = newPerimeter / (2 + this.width);

	    // Update the perimeter and area accordingly
	    this.perimeter = newPerimeter;
	    this.area = this.width * this.length;
	    
	    // Calculate and set the new diagonal
	    this.diagonal = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
	}

	
	

	@Override
	public void setArea(double newArea) {
	    // Calculate the new width or length based on the given area
	    if (newArea > 0) {
	        double newWidth = Math.sqrt(newArea * width / length);
	        double newLength = newArea / newWidth;
	        
	        // Update the width and length
	        this.width = newWidth;
	        this.length = newLength;

	        // Recalculate the perimeter and diagonal
	        this.perimeter = 2 * (this.width + this.length);
	        this.diagonal = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));

	        // Set the new area
	        this.area = newArea;
	    }
	}





}
