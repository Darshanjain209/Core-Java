package in.co.Exception;

public class Testlogin {

	public static void main(String[] args) {
		
		String name="admn";
		if(name=="admin")
		{
			System.out.println("valid ");
		}
		else
		{
			try
			{
				throw new login();
			}catch(Exception a)
			{
				System.out.println("hello");
				System.out.println(a.getMessage());
			}
		}

	}

}
