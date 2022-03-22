package springb;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int marks;
	private String email;
	private String branch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		//System.out.println("Setting id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//System.out.println("Setting name");
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		//System.out.println("Setting marks");
		this.marks = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
