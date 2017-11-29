
public class Runner {
	public static void main(String[] args) {
		String[] firstNames = {"Annie", "Jessica", "Nicholas", "Kevin", "Daniel", "Ash", "Jane", "Robbie", "Carlos", "Doyle", "Randall", "Jaiden", "William", "Samuel", "Steven"};
		String[] familyNames = {"Wu", "Chang", "Ng", "Mash", "Lin", "Feliz", "Johnson", "Jones", "Wood", "Boyd", "Li", "Chen", "Moy", "Chan", "Huang"};
	    String[] titles = {"Mr.", "Mrs.", "Ms.", "Mx."}; 
	    double[] height = {6.1,6.0,5.9,5.8,5.7,5.6,5.5,5.4,5.3,5.2,5.1,5.0};
	    String[] zodiacSign = {"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn","Aquarius","Pisces"};
		double GPA = Math.floor(Math.random() * 100);
		String[] Major = {"Software", "BioScience", "Artitecture", "Liberal Arts", "Environmental", "Chemistry", "Physics", "Law", "Robotics", "Media"};
		int satScore = (int) Math.floor(Math.random() * 1600);
		String[] Subject = {"Math", "Science", "Social Studies", "Foreign Language", "Psychology", "Drama", "Artitecture"};
		
		String pickFirstName = firstNames[(int) Math.floor(Math.random() * firstNames.length)];
		String pickFamilyName = familyNames[(int) Math.floor(Math.random() * familyNames.length)];
		String pickTitle = titles[(int) Math.floor(Math.random() * titles.length)];
		double pickHeight = height[(int) Math.floor(Math.random() * height.length)];
		String pickZodiacSign = zodiacSign[(int) Math.floor(Math.random() * zodiacSign.length)];
		String pickMajor = Major[(int) Math.floor(Math.random() * Major.length)];
		String pickSubject = Subject[(int) Math.floor(Math.random() * Subject.length)];
	
		Teacher test1 = new Teacher(pickFirstName, pickFamilyName, pickHeight, pickZodiacSign, pickSubject, pickTitle);
		System.out.println(test1);
}
}

