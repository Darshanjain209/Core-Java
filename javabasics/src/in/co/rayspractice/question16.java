package in.co.rayspractice;

public class question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {23,56,178,98,60};
		int largest=ar[0];
		int slargest=ar[1];
		if(ar[0]>ar[1])
		{
			 largest=ar[0];
	          slargest=ar[1];
		}
		else
		{
			largest=ar[1];
	          slargest=ar[0];
		}
		for(int i=2;i<5;i++)
		{
			if(largest<ar[i])
			{
				slargest=largest;
				largest=ar[i];
				
			}
			else if(slargest<ar[i])
			{
				slargest=ar[i];
			}
			
		}
		System.out.println(largest);
         System.out.println(slargest);
	}

}
