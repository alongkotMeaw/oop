package lap6;

public class Graduate extends Student {
	//attibute
    private String thesis; 
	
    //constructer
	public Graduate(int id, String name, double gpa, String thesis) {
		super(id, name, gpa);
		this.thesis = thesis;
	}
	
	//method
	public String ngetThesisTitle() {
		return thesis;
	}
	
	public void setThesisTitle(String Thesis) {
		 this.thesis = thesis;
	}
	
	
	
	//to string
		public String toString() {
			System.out.println("Graduate Student: ");
			return "ID: " + id + "\nName: " + name + "\ngpa: " + gpa + "\nThesis: " +thesis;
		}
	

}
