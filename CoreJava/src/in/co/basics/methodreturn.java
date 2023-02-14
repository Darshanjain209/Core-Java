package in.co.basics;

public class methodreturn {
	public int sum()
	{
		int a=10,b=20;
		int addition=a+b;
		return addition;
	}
	public String addition()
	{
		return "hello";
		}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodreturn e=new methodreturn();
		System.out.println(e.sum());
		System.out.println(e.addition());
		}
}
