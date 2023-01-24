package in.co.basics;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num=120034,reverse=0,remainder;
		while(num>0)
		{
			remainder=num%10;
			num=num/10;
			reverse=reverse*10+remainder;
		}
	
		System.out.println(reverse);
	}

}
