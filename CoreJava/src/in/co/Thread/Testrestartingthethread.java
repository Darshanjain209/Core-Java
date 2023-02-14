package in.co.Thread;

public class Testrestartingthethread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restartingthethread r=new Restartingthethread();
		r.start();
		System.out.println("main");// this main is executed by main thread
		r.start();//once a thread starts then it will dead after some time you cant start
		//the dead thread Exception will occur
	}

}
