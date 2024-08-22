package lap6_2;

public class Product {
	//atibute
	private String code;
	private String name;
	private int price;
	protected int weigth;
	protected int volume;
	
	
	//defal constructer
	public  Product() {}
	
	//constructer
	public Product(String code,String name, int price) {
		this.name = name;
		this.price = price;
		this.code = code;
	}
	public Product(String name,int price) {
		this.name = name;
        this.price = price;
    }
	
	
	//method
		//set
	public void setVolumn(int Volume) {
		this.volume = Volume;
	}
	public void setWeight(int weigth) {
		this.weigth = weigth;
	}
	public void set_price() {
		this.price += this.price;
	}
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
	public int get_volume() {
		return this.volume;
	}
	public int get_Weigth() {
		return this.weigth;
	}
}
