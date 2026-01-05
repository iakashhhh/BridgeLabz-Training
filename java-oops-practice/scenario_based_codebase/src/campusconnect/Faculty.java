package campusconnect;

public class Faculty extends Person{
	private String department;

	public Faculty(String name, String email, int id, String department) {
		super(name, email, id);
		this.department = department;
	}
	
	void printDetails(){
		System.out.println("Name: " + name);
		System.out.println("email: " + email);
		System.out.println("Id: " + id);
		System.out.println("Department: " + department);
	}

}
