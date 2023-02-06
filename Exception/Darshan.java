package in.co.Exception;

public class Darshan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =0, i = 15;
		System.out.println("before exception");
		
		try{
		
			double d = i / k;
		
		}catch(ArithmeticException e){
			
			//System.out.println(e.getMessage());
			System.out.println("divide by zero");
		}
	
		//System.out.println("after exception");
		
		//System.out.println(d);
	}

}
