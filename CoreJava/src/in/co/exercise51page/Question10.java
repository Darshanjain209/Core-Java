package in.co.exercise51page;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1634,reminder,count=0,armstrong=0;
		int temp=num;
		int temp1=temp;
				while(num>0)
				{
					count++;
					num=num/10;
				}
				while(temp>0)
				{
					reminder=temp%10;
					armstrong=armstrong+(reminder*reminder*reminder*reminder);
					temp=temp/10;
				}
				if(temp1==armstrong)
				{
					System.out.println(temp1+"is a armstrong number");
				}
				else
				{
					System.out.println(temp1+"is a not armstrong number");
				}
			
				
		
		
	}

}
