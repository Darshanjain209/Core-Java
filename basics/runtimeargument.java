package in.co.basics;

public class runtimeargument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]+" "+args[1]);
		if(args.length==2){
			System.out.println(args[0]);
		}
		else
		{
			System.out.println("parameter name is requierd");
		}
		
		

	}

}
