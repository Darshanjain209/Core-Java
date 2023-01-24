package in.co.OOP;

public class testaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accountgettersetter d=new accountgettersetter();
		d.setAccounttype("234567");
		d.setBalance(10000.0d);
		d.setNumber("2345678");
		System.out.println(d.getAccounttype());
		System.out.println(d.getBalance());
		System.out.println(d.getNumber());
		d.setDeposit(340);
		System.out.println(d.getDeposit());
		d.setFundtransfer(500);
		System.out.println(d.getFundtransfer());
		d.setWithdrawal(1000);
		System.out.println(d.getWithdrawal());
		d.setPaybill(1000);
		System.out.println(d.getPaybill());
		
		
		
	

	}

}
