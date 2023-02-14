package in.co.Thread;

public class superstart extends Thread{

	
	public void start()
	{
		super.start();//responsible for  making thread
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}
