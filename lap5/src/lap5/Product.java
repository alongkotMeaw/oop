package lap5;

public class Product {
	//atibute
	private String code;
	private String name;
	private int price;
	
	
	//defal constructer
	public  Product() {}
	
	//constructer
	public Product(String code,String name, int price) {
		this.name = name;
		this.price = price;
		this.code = code;
	}
	
	//method
	//get
	public String get_name() {
		return this.name;
	}
	public int get_price() {
		return this.price;
	}
	public String get_code() {
		return this.code;
	}
	public void show() {
		System.out.println("" +name  + " (" +  code + ") "+ price);  //มาเเก้ตำหหน่งที่สติงยาวไม่เท่ากัน
		
	}
}
