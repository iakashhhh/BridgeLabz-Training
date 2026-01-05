package campusconnect;

public class Student extends Person implements ICourseActions{
	private String grades;
	private Course course;

	public Student(String name, String email, int id, String grades) {
		super(name, email, id);
		this.grades = grades;
	}
	public double calculategpa() {
		switch(grades) {
		case "A+": return 10;
		case "A" : return 9;
		case "B+" : return 8;
		case "B" : return 7;
		case "C" : return 6;
		}
		return 6.5;
	}
	@Override
	public void enrollCourse(Course course) {
		this.course = course;
		course.addStudent(this);
	}
	@Override
	public void dropCourse(Course course) {
		this.course = null;
		course.removeStudent(this);
	}
	@Override 
	void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("email: " + email);
		System.out.println("Id: " + id);
		System.out.println("GPA: " + calculategpa());
		
		 if (course != null) {
	            System.out.println("Course: " + course.getCourseName());
	        } else {
	            System.out.println("Course: Not Enrolled");
	        }
	}
	
}
