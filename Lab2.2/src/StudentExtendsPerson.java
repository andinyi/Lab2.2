
public class Student extends Person {
	private double GPA;
	private String Major;
	private int satScore;
	
	public Student(String firstName, String familyName, int height, String zodiacSign, double GPA, String Major, int satScore) {
		super(firstName, familyName, height, zodiacSign);
		this.GPA = GPA;
		this.Major = Major; 
		this.satScore = satScore;
		
	}
	
	public double getGPA() {
		return GPA;
		
	}
	
	public String getMajor() {
		return Major;
	}
	
	public int getsatScore() {
		return satScore;
	}
	
		public String toString() {
			return("Student First Name = " + super.getFamilyName() + " , Student Family Name = " + super.getFirstName());
		}
		

}



	
	
