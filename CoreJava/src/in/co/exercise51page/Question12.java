package in.co.exercise51page;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1313,reminder,reverse=0;
		int temp=num;
		while(num>0)
		{
			reminder=num%10;
			num=num/10;
			reverse=reverse*10+reminder;
		}
		if(temp==reverse)
		{
			System.out.println(temp+"is a palindrome number");
		}
		else
		{
			System.out.println(temp+"is not a palindrome number");
		}
	}

}

