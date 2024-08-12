package midBook;

/*
 * 
		Staff staff = new Staff("St01", "Vince", lib1);
		Customer cus1 = new Customer ("C01", "]non");
 */
public class Staff {
	private String code;
	private String name;
	private Libary Liin;
	public  Staff(String code , String name,Libary liIn) {
		this.code = code;
		this.name = name;
		this.Liin = liIn;
	}
	
	public void checkOut(Customer In) {
		System.out.println("Customer " + In.getName() + " borow " + In.getCount() + " of " + In.getLimit() +"Book limit");
		In.printall();
	}
	
	
	
	//get set
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
