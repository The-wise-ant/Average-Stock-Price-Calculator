package triangles;
import shapes.*;



public class TriangleFactory {
	    public static Triangle createTriangle(double a, double b, double c) {
	        if (a == b && a == c) {
	            return new EquilateralTriangle(a);
	        }
	        // Add more conditions here to create other types of triangles
	        return null;
	    }
	}



