package in.co.basics;

public class pyramidstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i=1;i<=5;i++)
		{
			for(int space=1;space<=5-i;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int space=1;space<=i;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=9-2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
