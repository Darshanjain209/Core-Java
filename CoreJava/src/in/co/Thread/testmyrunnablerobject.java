package in.co.Thread;

public class testmyrunnablerobject {

	public static void main(String[] args) {
		
		//object creation
		myrunnablerobject j=new myrunnablerobject();
		Thread t=new Thread(j);
		Thread t1=new Thread();
        t.start();
       
        t1.start();
        t.run();
        t1.run();
//        j.start();// j.start() k time p compile time error aaega
        j.run(); 
        for(int i=0;i<10;i++)
        {
        	System.out.println("main thread");
        }
		
	}

}
