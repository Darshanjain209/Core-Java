package in.co.Thread;

public class Testmyrunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       myrunnable m=new myrunnable();
       Thread t=new Thread();
       t.start();// this start calls Thread class start method and thread class start
       //method is responsible to call thread class run method but there is no run method 
       //override by thread class here. so no out[put will be got.
       for(int i=0;i<10;i++)
       {
    	   System.out.println("main thread");
       }
	}
	//thhis program contains only one thread main thread because t.start() will not called.

}
