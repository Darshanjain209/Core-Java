package in.co.Thread;

public class myrunnable implements Runnable {
//runnable interface present in java lang so that we dont have to import anything here
	//and it contains only run method
	@Override
	public void run() {
		//this for loop is considered as the job of thread
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
		
		
	}

}
