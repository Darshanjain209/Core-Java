package in.co.exercise51page;

public class Question6 {

	public static void main(String[] args) {
	
		int x=0,y=0,z=1;
	
		while(x<50)
		{

			System.out.print(y+",");
			x=y;
			y=z;
			z=x+y;

		}
	}

}
