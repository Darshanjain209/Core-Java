package in.co.Thread;

public class testcurrentthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		currentthread c=new currentthread();
		c.start();
		//start is responsible for running run method.
		System.out.println("main method executed by Thread"+Thread.currentThread().getName());
        
	}

}
