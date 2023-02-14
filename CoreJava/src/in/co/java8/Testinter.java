package in.co.java8;

public class Testinter {

	public static void main(String[] args) {
	
		inter t=(a,b)->{
			return a+b;
		};
		int t1=t.add(10, 20);
		System.out.println(t1);
		
		inter t2=(a,b)->{
			return a*b;
	};
	int a=t2.add(10, 20);
	System.out.println(a);
     t.defmethod();
     t.Static();

}
}
