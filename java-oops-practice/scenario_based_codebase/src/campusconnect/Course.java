package campusconnect;
import java.util.*;

public class Course {
	private Faculty faculty;
	List<Student> students = new ArrayList<>();
		
	String courseName;

	public Course(String courseName, Faculty faculty) {
		super();
		this.courseName = courseName;
		this.faculty = faculty;
		this.students = new ArrayList<>();
		
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public String getCourseName() {
		return courseName;
	}

}
