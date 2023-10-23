package triangles;

import shapes.*;

public class TriangleFactory {
	public static Triangle createTriangle(double a, double b, double c) {
		if (a == b && a == c) {
			return new EquilateralTriangle(a);
		}

		else if (a != b && b != c) {

			return new ScaleneTriangle(a, b, c);
		}

		else {

			if (a == b && c != a && c != b) {
				return new IsoscelesTriangle(c, a);
			} else if (c == b && a != b && a != c) {
				return new IsoscelesTriangle(a, b);
			} else if (a == c && b != a && b != c) {
				return new IsoscelesTriangle(b, a);
			}
		}

		return null;
	}
}
