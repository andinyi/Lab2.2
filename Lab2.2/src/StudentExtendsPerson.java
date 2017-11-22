
public class Student extends Person {
	private double GPA;
	public Student(double GPA) {
		super(firstName, familyName, height, zodiacSign);
		this.GPA = GPA;
	}
		public String toString() {
			return(super.getFirstName() + " ," + super.getFamilyName());
		}
		

	}
	
	
