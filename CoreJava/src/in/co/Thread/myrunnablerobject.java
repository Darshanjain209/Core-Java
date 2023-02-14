package in.co.Thread;

public class myrunnablerobject  implements Runnable{
	@Override
	public void run() {
		//this for loop is considered as the job of thread
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}

}
