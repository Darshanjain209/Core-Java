package in.co.basics;

public class bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=100,deposit=0,transfer=00;
		if(balance>0)
		{
		 if(transfer>0&&deposit>0)
			{
				System.out.println("invalid entry");
			}
			else if(deposit>0)
			{
				balance=balance+deposit;
				System.out.println("YOUR NEW BALANCE IS- "+balance);
			}
			else if(transfer>0)
			{
				if(transfer>balance)
				{
					System.out.println("insufficient fund");
				}
				else
				{
					balance=balance-transfer;
					System.out.println("YOUR NEW BALANCE IS- "+balance);
				}
			}
			
			
		}
		else
		{
			System.out.println("not enough balance in your account");
		}

	}

}
