package in.co.basics;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=5;
		int key=18;
		switch (key) {
		case 1:
			int add=a+b;
			System.out.println(add);
			
			break;
		case 2:
			int sub=a-b;
			System.out.println(sub);
			break;
		case 3:
			int mul=a*b;
			System.out.println(mul);
			break;
			

		default:
			int div=a/b;
			System.out.println(div);
			break;
		}
	}

}
