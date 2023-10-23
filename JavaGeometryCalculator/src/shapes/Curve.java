package shapes;

public abstract class  Curve extends Shape{
	
	private double radius;
	private double diameter;
	
	
	/////////GETTERS/////////////////
	public double getRadius() {
		return this.radius;
		}
	
	public double getDiameter() {
		return this.diameter;
		}
	
	

	/////////SETTERS/////////////////
	
	
	public abstract double setRadius();
	
	public abstract double setDiameter();


}
