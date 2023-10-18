import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		
		System.out.println("create a new square, add the side length in cm");
		
		double side = scan.nextDouble();
		
		
		*/
		
		Square square = new Square(3);
		
		
	
		
		
		System.out.println("A square with the side of " + 	
		square.getSide() + "cm have a perimeter of " + square.getPerimeter() + 
		"cm and an area of " + square.getArea() + " cm2");
		

		
		square.setSide(4);
		
		System.out.println("A square with the side of " + 	
				square.getSide() + "cm have a perimeter of " + square.getPerimeter() + 
				"cm and an area of " + square.getArea() + " cm2");
		
		
		
	}

}
