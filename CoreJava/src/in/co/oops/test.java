package in.co.oops;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account a=new account();
	    a.setNumber("9399008867");
	    a.setAccounttype("icici");
	    a.setBalance(5000);
	    a.deposit(2000);
	    a.fundtransfer(3000);
	    a.paybill(550);
	    a.withdraw(1500);
	    
	    System.out.println(a.getBalance());
	    System.out.println(a.getNumber());
        System.out.println(a.getAccounttype());
	}

}
