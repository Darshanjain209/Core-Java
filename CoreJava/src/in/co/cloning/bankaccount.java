package in.co.cloning;

public class bankaccount implements Cloneable{
	double balance=0;
	
	public bankaccount(double balance)
	{
		this.balance=balance;
	}

	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
