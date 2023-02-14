package in.co.inheritance;

public class Testchildparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new child();
		child c=new child();
		p.m1();
		//p.m2();//not valid 
        c.m1();
        c.m2();
	}

}
