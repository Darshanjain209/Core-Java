package in.co.exercise51page;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=234,reminder,reverse=0;
		while(num>0)
		{
			reminder=num%10;
			num=num/10;
			reverse=reverse*10+reminder;
		}
		System.out.println(reverse);

	}

}
