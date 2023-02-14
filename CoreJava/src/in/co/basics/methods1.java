package in.co.basics;

public class methods1 {
		public void m2()
		{
			System.out.println("i am non static");
		}
		public static void m1()
		{
			System.out.println("i am method");
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			methods1 ex=new methods1();
			ex.m2();
			m1();

	}

}
