package lap6;

public class Student {
	//attibute
	protected String name = "";
	protected int id;
	protected double gpa;
	
	//constructer
	public  Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public  Student(int id, double gpa) {
		this.id = id;
		this.gpa = gpa;
	}
	
	//method
	
	//getter
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return this.gpa;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
    ///to string
	public String toString() {
		System.out.println("Student:");
		return "ID: " + id + "\nName: " + name + "\ngpa: " + gpa;
	}
}
