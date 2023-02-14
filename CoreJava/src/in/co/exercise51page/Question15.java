package in.co.exercise51page;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,54876,6674,7651,889};
		int largest=ar[0];
		for(int i=1;i<5;i++)
		{
			if(largest<ar[i])
			{
				largest=ar[i];      
			}
		}
		System.out.println(largest);
	}

}
