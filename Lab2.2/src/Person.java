
public abstract class Person {
	private String firstName;
	private String familyName;
	private int height;
	private String zodiacSign; 
	
	public Person(String firstName, String familyName, int height, String zodiacSign) {
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
	
	public int height() {
		return height;
	}
	
	public String zodiacSign() {
		return zodiacSign;
	}
	
	@Override
	public abstract String toString();


}
