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
	    this.width = newPerimeter / (2 + this.length);
	    this.length = newPerimeter / (2 + this.width);

	    this.perimeter = newPerimeter;
	    this.area = this.width * this.length;
	    
	    this.diagonal = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
	}

	
	

	@Override
	public void setArea(double newArea) {
	    if (newArea > 0) {
	        double newWidth = Math.sqrt(newArea * width / length);
	        double newLength = newArea / newWidth;
	        
	        this.width = newWidth;
	        this.length = newLength;

	        this.perimeter = 2 * (this.width + this.length);
	        this.diagonal = Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));

	        this.area = newArea;
	    }
	}
	
	

	@Override
	public String toString() {
		return  "your rectangle has a width of " + this.getWidth() + ", a length of "
				+ this.getLength() + ", a perimeter of " + this.getPerimeter() + ", an area of "
				+ this.getArea() + " and finally, a diagonal of " + this.getDiagonal() + "\n";
				
	}
	
	
	
	/*    
	 * 
	 *  
	 *   
	 *   */





}
