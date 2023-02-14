package in.co.OOP;

public class accountgettersetter {

	private String number;
	private String accounttype;
	private double balance;
	private int deposit;
	private int withdrawal;
	private int fundtransfer;
	private int paybill;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return balance+deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public double getWithdrawal() {
		return balance-withdrawal;
	}
	public void setWithdrawal(int withdrawal) {
		this.withdrawal = withdrawal;
	}
	public double getFundtransfer() {
		return balance-fundtransfer;
	}
	public void setFundtransfer(int fundtransfer) {
		this.fundtransfer = fundtransfer;
	}
	public double getPaybill() {
		return balance-paybill;
	}
	public void setPaybill(int paybill) {
		this.paybill = paybill;
	}
}
	