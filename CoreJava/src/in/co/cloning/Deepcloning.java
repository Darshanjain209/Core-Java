package in.co.cloning;

public class Deepcloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
       customer c1=new customer("ajay");
       customer c2=(customer) c1.clone();
       c2.name="darshan";
       System.out.println(c1.name);
       System.out.println(c1.account.balance);
       System.out.println(c2.name);
       System.out.println(c2.account.balance);
	}

}
