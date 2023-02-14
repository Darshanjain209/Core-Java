package in.co.basics;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num=1818,reminder,reverse=0,temp;
          temp=num;
          while(num>0)
          {
        	  reminder=num%10;
        	  num=num/10;
        	  reverse=reverse*10+reminder;
          }
          System.out.println(reverse);
          if(reverse==temp)
          {
        	  System.out.println(temp+"is a palindrome number");
          }
          else
          {
        	  System.out.println(temp+"is not a palindrome number");
          }
	}

}
