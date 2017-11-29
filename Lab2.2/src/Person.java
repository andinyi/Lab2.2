
public abstract class Person {
	private String firstName;
	private String familyName;
	private double height;
	private String zodiacSign; 
	
	public Person(String firstName, String familyName, double height, String zodiacSign) {
		this.height = height;
		this.firstName = firstName;
		this.familyName = familyName;
		this.zodiacSign = zodiacSign;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public double height() {
		return height;
	}
	
	public String zodiacSign() {
		return zodiacSign;
	}
	
	@Override
	public abstract String toString();


}
