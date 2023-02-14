package in.co.polymorphism;

public class Circle extends Shape {

	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double area() {

		double carea = 3.14 * (radius * radius);
		System.out.println("circle="+carea);
		return carea;
	}
}
