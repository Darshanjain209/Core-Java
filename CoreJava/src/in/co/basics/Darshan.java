package in.co.basics;

public class Darshan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths=10,english=123,hindi=52,chemistry=12,physics=34;
		float totalmarks=maths+english+physics+chemistry+hindi;
		float per=totalmarks/5;
		if(maths>32&&english>32&&hindi>32&&chemistry>32&&physics>32)
		{
			if(per>=90)
			{
				System.out.println("a+ grade");
			}
			else if(per>=80 && per<90)
			{
				System.out.println("a grade");
			}
			else if(per>=70 && per<80)
			{
				System.out.println("b+ grade");
			}
			else if (per>=60 && per<70)
			{
				System.out.println("b grade");
			}
			else if (per>=50 && per<60)
			{
				System.out.println("c + grade");
			}
			else if (per>=40 && per<50)
			{
				System.out.println("c grade");
			}
			else
			{
				System.out.println("d grade");
			}
			
		}
		 if(physics<33 || chemistry <33 || english<33 || hindi <33 || maths<33)
		{
			if(physics <33)
			{
				System.out.println("fail in physics");
			}
			if(hindi < 33)
			{
				System.out.println("fail in hindi");
			}
			if(chemistry <33)
			{
				System.out.println("fail in chemistry");
			}
			 if(maths <33)
			{
				System.out.println("fail in maths");
			}
			 if (english <33)
			{
				System.out.println("fail in english");
			}
		}
		 if(maths>100||english>100||chemistry>100||physics>100||hindi>100)
		{
			System.out.println("invalid input in the numbers");
		}
	}

}
