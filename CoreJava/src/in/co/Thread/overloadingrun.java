package in.co.Thread;

public class overloadingrun extends Thread {

	
	public void run()
	{
		System.out.println("run without args");
	}
	public void run(char r)
	{
		System.out.println("run with args");
	}
}
