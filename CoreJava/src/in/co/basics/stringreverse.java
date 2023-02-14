package in.co.basics;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Darshan jain";
		//char[]arr= name.split(name)
		int length=name.length();
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}

}
