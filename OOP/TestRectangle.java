package in.co.OOP;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.setLength(20);
		r.setWidth(40);

		System.out.println(r.getLength()*r.getWidth());
	}

}
