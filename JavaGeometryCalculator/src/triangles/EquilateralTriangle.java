package triangles;
import shapes.*;


public class EquilateralTriangle extends Triangle{

		private double side;
		private double perimeter;

		private double area;

		private double diagonal;

		protected EquilateralTriangle(double newSide) {
			setSide(newSide);
		}

		//////// GETTERS//////////////

		@Override
		public String getSides() {
			// TODO Auto-generated method stub
			return  this.side + ", " + this.side +" and " + this.side;
		}
		
		
		
		public double getSide() {
			return this.side;
		}

		public double getPerimeter() {

			return this.perimeter;
		}

		public double getArea() {
			return this.area;
		}

		public double getDiagonal() {
			return this.diagonal;
		}

	

		/////// SETTERS////////////

		public void setSide(double newSide) {
			this.side = newSide;
			this.perimeter = newSide * 3;
			this.area = (Math.pow(newSide, 2) * Math.sqrt(3)) / 4;
			double diagonal = newSide * Math.sqrt(3);

		}

		public void setPerimeter(double newPerimeter) {
			this.perimeter = newPerimeter;
			double newSide = newPerimeter / 3;
			this.side = newSide;

			this.area = (Math.pow(newSide, 2) * Math.sqrt(3)) / 4;
			this.diagonal = newSide * Math.sqrt(3);
}
		
		

		public void setArea(double newArea) {
			this.area = newArea;
			double newSide = Math.sqrt((4 * area) / Math.sqrt(3));
			this.side = newSide;
			this.perimeter = newSide * 3;
			this.diagonal = newSide * Math.sqrt(3);

		}

		public void setDiagonal(double newDiagonal) {
			this.diagonal = newDiagonal;
			double newSide = newDiagonal / Math.sqrt(3);
			this.side = newSide;
			this.perimeter = newSide * 3;
			this.area = (Math.pow(newSide, 2) * Math.sqrt(3)) / 4;

		}


	}
	