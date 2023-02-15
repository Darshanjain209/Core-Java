package in.co.oops;

public class account {
	private String number;
	private String accounttype;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public void deposit(double d)
	{
		balance = getBalance()+d;
		
	}
	public void withdraw(double d)
	{
		balance = getBalance()-d;
		
	}
	public void paybill(double d)
	{
		balance = getBalance()-d;
		
	}
	public void fundtransfer(double d)
	{
		balance = getBalance()-d;
		
	}
	
	

}
