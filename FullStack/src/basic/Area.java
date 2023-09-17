package basic;

class AreaOf implements Formulae{

	public void triangle(int h, int b) {
		System.out.println("Area of triangle: " + (h*b*PI));
	}

	public void square(int s) {
		System.out.println("Area of square: " + s*s);
	}

	public void rectangle(int l, int b) {
		System.out.println("Area of rectangle: " + l*b);
	}

	public void rhoumbus(int d1, int d2) {
		System.out.println("Area of rhoumbus: " + (0.5*d1*d2));
	}

}

public class Area {
	
	public static void main(String args[]) {
		AreaOf a = new AreaOf();
		a.triangle(2, 5);
		a.square(10);
		a.rectangle(20, 50);
		a.rhoumbus(15, 10);
	}
}