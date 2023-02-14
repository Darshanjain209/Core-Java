package in.co.OOP;

public class triangle {

	private int height;
	private int base;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public double area()
	{
		return height*base;
	}
	
}
