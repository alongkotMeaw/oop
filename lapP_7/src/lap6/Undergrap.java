package lap6;

public class Undergrap extends Student {
	//attibute
	private String year;
	
	//constructer
	public  Undergrap(int id, String name, double gpa, String year) {
		super(id, name,  gpa);	
		this.year = year;
	}
	
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getYear() {
		return this.year;
	}
	//to string
	public String toString() {
		System.out.println("Undergraduate Student:");
		return "ID: " + id + "\nName: " + name + "\ngpa: " + gpa + "\nYear: " +year;
	}

}
