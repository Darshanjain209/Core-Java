package in.co.basics;

public class switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=1;
		String name;
		switch(day)
		{
		case 1:    
			name="monday";
			System.out.println(name);
			break;
		case 2:
			name="tuesday";
			System.out.println(name);
			break;
		case 3:
			name="wednesday";
			System.out.println(name);
			break;
		case 4:
			name="thursday";
			System.out.println(name);
			break;
		case 5:
			name="friday";
			System.out.println(name);
			break;
		case 6:
			name="saturday";
			System.out.println(name);
			break;
		case 7:
			name="sunday";
			System.out.println(name);
			break;
		default:
			System.out.println("invalid day");
		}
	}

}
