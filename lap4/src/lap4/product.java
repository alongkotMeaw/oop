package lap4;

public class product {
	//Attribute
	private Double price;
	private int code;
	private String name;
	//defal constructer
	public product() {
		
	}
	//constructer
	public  product(int code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
		
	}
	
	//out
	public int get_code() {
		return this.code;
		
	}
	
	public String get_name() {
		return this.name;
		
	}
	
	public double get_price() {
		return this.price;
		
	}
	
	public void show() {
		System.out.println("Product code" + this.code + "\n" + "name:" + this.name + " , Price: " + this.price);
		
	}

}
