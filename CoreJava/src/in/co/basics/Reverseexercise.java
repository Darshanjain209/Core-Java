package in.co.basics;

public class Reverseexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1809,remainder,reverse=0;
		while(num>0)
		{
          remainder=num%10;
          num=num/10;
          reverse=reverse*10+remainder;
	}
		System.out.println(reverse);

}
}