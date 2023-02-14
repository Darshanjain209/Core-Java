package in.co.sorting;

public class Marksheet implements Comparable<Marksheet> {

	@Override
	public int compareTo(Marksheet o) {
		
		return rollno.compareTo(o.rollno);
	}
	String rollno;
	String firstname;
	String lastname;
	int marks;
	public Marksheet(String rollno, String firstname, String lastname, int marks) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.marks = marks;
	}
	public String getRollno() {
		return rollno;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getMarks() {
		return marks;
	}
	
	
	
	

}
