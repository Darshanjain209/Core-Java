package in.co.basics;

public class switchcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char name='r';
		switch(name)
		{
		case 'q':
			System.out.println("your character is"+name+"and you are printing q");
			break;
		case 'w':
			System.out.println("your character is"+name+"and you are printing w");
			break;
		case 'e':
			System.out.println("your character is"+name+"and you are printing e");
			break;
		case 'r':
			System.out.println("matched");
			break;
		default:
				System.out.println("the character you are entering not matched");
			
		}
	}

}
