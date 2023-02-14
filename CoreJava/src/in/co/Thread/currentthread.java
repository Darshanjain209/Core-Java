package in.co.Thread;

public class currentthread extends Thread{
	public void run() {
		System.out.println("run method executed by thread"+ Thread.currentThread().getName());
	}

}
