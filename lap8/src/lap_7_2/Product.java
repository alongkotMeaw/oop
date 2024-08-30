package lap_7_2;
public class Product {
	protected String ID;
	protected String name;
	protected int price;
	protected int weight;
	protected int count = 1;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Product(String id, String name, int price) {
		this.ID = id;
		this.name = name;
		this.price = price;
	}
	public Product(int price) {
		this.price = price;
	}
	public String getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getInfo() {
		return weight + " Gram ";
	}
}
