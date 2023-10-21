import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Pick a 2D geometric shape among square, rectangle and circle ");
			String inputShape = scan.nextLine();

			while (!(inputShape.equalsIgnoreCase("square") || inputShape.equalsIgnoreCase("circle")
					|| inputShape.equalsIgnoreCase("rectangle"))) {

				System.out.println("please enter a shape among circle, square and rectangle.");
				inputShape = scan.nextLine();
			}

			if (inputShape.equalsIgnoreCase("circle")) {

				System.out.println("Enter the radius of the circle in number:");
				double radiusLength = Double.valueOf(scan.nextLine());

				Circle circle = new Circle(radiusLength);

				System.out.println("your circle has a radius of " + circle.getRadius() + ", a circumference of "
						+ circle.getCircumference() + ", an area of " + circle.getArea() + " and a diameter of "
						+ circle.getDiameter() + "\n");

			}

			else if (inputShape.equalsIgnoreCase("square")) {

				System.out.println("Enter the side length of the square in number:");
				double squareLength = Double.valueOf(scan.nextLine());

				Square square = new Square(squareLength);

				System.out.println("your square has a side of " + square.getSide() + ", a perimeter of "
						+ square.getPerimeter() + " and an area of " + square.getArea() + "\n");

			}

			else if (inputShape.equalsIgnoreCase("rectangle")) {

				System.out.println("Enter the width of the rectangle in number:");
				double widthLength = Double.valueOf(scan.nextLine());

				System.out.println("Enter the length  of the rectangle in number:");
				double lengthLength = Double.valueOf(scan.nextLine());

				Rectangle rectangle = new Rectangle(widthLength, lengthLength);

				System.out.println("your rectangle has a width of " + rectangle.getWidth() + ", a length of "
						+ rectangle.getLength() + ", a perimeter of " + rectangle.getPerimeter() + ", an area of "
						+ rectangle.getArea() + " and finally, a diagonal of " + rectangle.getDiagonal() + "\n");

			}

			System.out.println(
					"would you add another geometrical shape? Press \" yes \" to continue, anything other to exit");
			String answer = scan.nextLine();

			if (answer.equalsIgnoreCase("yes")) {
				continue;
			} else {
				scan.close();
				break;
			}

		}
		
		System.out.println("You exited the cycle, program finished.");

	}
}