package in.co.Thread;

public class overriddingstartmethod extends Thread{
	
	public void run()
	{
		System.out.println("hello");
	}
	public void start()
	{
		System.out.println("start method");
	}
}
