package in.co.polymorphism;

public class Triangle extends Shape {

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	public Triangle(int base, int height) {

		this.base = base;
		this.height = height;
	}

	public double area() {
		double tarea = (base * height) / 2;
		System.out.println("triangle="+tarea);
		return tarea;
	}

}
