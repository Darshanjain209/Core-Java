package in.co.polymorphism;

public class Testall {

	// TODO Auto-generated method stub
//		Rectangle r=new Rectangle(20,30);
//		System.out.println(r.area());
//		Triangle t=new Triangle(30,80);
//		System.out.println(t.area());
//		Circle c=new Circle(90);
//		System.out.println(c.area());
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle(10, 20);
		s[1] = new Triangle(40, 50);
		s[2] = new Circle(90);
		double totalarea = 0;
		for (int i = 0; i < s.length; i++) {
			totalarea = totalarea + s[i].area();
		}
		System.out.println(totalarea);

	}
}
