
public class Classroom {
	private Student[] students;
	private Teacher teacher;
	
	public Classroom(Student[] students, Teacher teacher, String Subject) {
		this.students = students;
		this.teacher = teacher;
		
		
	}
	
	public String getSubject() {
		return teacher.getSubject();
	}
	
		private double total = 0;
	
		public double classAverage() {
		for(Person p:this.students) {
			if(p instanceof Student)  {
				((Student) p).getGPA();
				total = total + ((Student) p).getGPA();
			}
		}
		return (total/students.length);
		
		
	}
		
	public void printClass() {
		
	}
}
