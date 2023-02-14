package in.co.inheritance;

public class Testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo d=new Demo();
       d.setBorderwidth(10);
       d.setColor("red");
       d.setLength(10);
       d.setWidth(20);
       System.out.println(d.getColor());
       System.out.println(d.getBorderwidth());
       System.out.println(d.getLength());
       System.out.println(d.getWidth());
	}

}
