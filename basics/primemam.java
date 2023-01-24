package in.co.basics;

public class primemam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=19,i;
			int count=0;
			for(i=2;i<=num/2;i++)
				 
			{
				if(num%i==0)
				{
					count++;
				}
				
				
				
			}
			
			if(count==0)
			{
				System.out.println("num is  prime");
			}
			else
			{
				System.out.println("num is not prime");
			}
				
			
			
			
	}

}
