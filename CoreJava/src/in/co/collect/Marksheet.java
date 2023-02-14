package in.co.collect;

public class Marksheet {

	String rollno;
	String name;
	int physics;
	int chemistry;
	int maths;

	public Marksheet(String rollno, String name, int physics, int chemistry, int maths) {

		this.rollno = rollno;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}

	public String getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getPhysics() {
		return physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public int getMaths() {
		return maths;
	}
	

}
