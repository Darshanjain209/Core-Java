package in.co.Thread;

public class Mythread extends Thread{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}
	
	

}
