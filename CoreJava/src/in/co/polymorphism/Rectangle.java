package in.co.polymorphism;

public class Rectangle extends Shape {
	private int length;

	private int width;

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public Rectangle(int length, int width) {

		this.length = length;
		this.width = width;
	}

	public double area() {

		double tarea = length * width;
		System.out.println("Rectangle_area"+(tarea));
		return tarea;
	}
}
