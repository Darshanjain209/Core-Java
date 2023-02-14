package in.co.exercise51page;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=21,i;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(num+"is not a prime number");
				break;
			}
			
		}
		if(i==num)
		{
			System.out.println(num+"is a prime number");
		}

	}

}
