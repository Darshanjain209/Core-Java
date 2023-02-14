package in.co.basics;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123,i;
		for( i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(" not prime number");
				break;
			}
		}
		if(i==num)
		{
			System.out.println("prime number");
		}

	}

}
