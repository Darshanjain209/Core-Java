
package in.co.basics;

public class Marksheet {
	public static void main(String[] args) {
		int physics=50,english=43,maths=80,hindi=90,chemistry=40;
		float totalmarks=physics+maths+hindi+chemistry+english;
		float percentage=totalmarks/5;
		if(physics>32&&chemistry>32&&maths>32&&hindi>32&&english>32)
		{
			if(percentage>=90)
			{
				System.out.println("a+ grade");
			}
			else if(percentage>=80 && percentage<90)
			{
				System.out.println("A grade");
			}
			else if (percentage>=70 && percentage<80)
			{	
				System.out.println("B + grade");
			}
			else if(percentage>=60 && percentage<70)
			{
				System.out.println("B grade");
			}
			else if (percentage>=50 && percentage<60)
			{
				System.out.println("c+ grade");
			}
			else
			{
				System.out.println("D grade");
			}
		}
		else
		{
			System.out.println("fail in subjects");
		}
		System.out.println(percentage);
		System.out.println(totalmarks);
	}

}
