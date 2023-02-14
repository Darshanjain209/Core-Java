package in.co.exercise51page;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=50,even=0,odd=0,add=0,add1=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				even++;
				add=add+i;
			}
			else 
			{
				odd++;
				add1=add1+i;
			}
		}
		System.out.println(add/even);
		System.out.println(add1/odd);

	}

}
