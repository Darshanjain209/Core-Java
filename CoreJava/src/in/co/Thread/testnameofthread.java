package in.co.Thread;

public class testnameofthread {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		//give the name of current thread
       //current thread naam ki ek ststic method Thread class me rkhi h.
	namesofthread n=new namesofthread();
		System.out.println(n.getName());
      Thread.currentThread().setName("darshan");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}

}
