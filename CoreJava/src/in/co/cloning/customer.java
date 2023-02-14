package in.co.cloning;

public class customer implements Cloneable{
	
	String name=null;
	bankaccount account=null;
	
	public customer(String name)
	{
		this.name=name;
		account=new bankaccount(10);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		customer c=(customer) super.clone();
		c.account=(bankaccount) account.clone();
		return c;
	}

}
