package in.co.Thread;

public class Display {

	public void wish(String name)//instance method it is because of not a static keyworf in it
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("good morning");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(name);
			}
		}
	
	}
	
}
