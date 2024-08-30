package lap_7_2;
public class Milk extends Product{
	private int volumn;
	public Milk(int price) {
		super(price);
		super.name = "Milk";
	}
	public String getInfo() {
		return volumn + " CC ";
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
}
