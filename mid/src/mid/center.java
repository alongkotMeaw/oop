package mid;


public class center {
	private String center_name;
	private String adress;
	private int count_injection = 0;
	//private  int[] num; // arry! น่าจะวัตถุ วัคว๊นเป็น array
	private injection[] injection; 
	public center(String name,String adress,int num) {
		this.adress = adress;
		this.center_name = name;
		injection = new injection[num]; // array of injection for stall ...
		System.out.printf("Create opject VacineCenter <<%s>> <<%s>> create injection array <<%d>>\n\n",name,adress,num);
	}
	
	public void  addedinjection (injection set) {
		if(count_injection <= injection.length) // check for install
		    injection[count_injection] = set;
		count_injection++; // move index
	}
	
	public injection getInjectionByIndex(int x) {
		return injection[x];
	}
	public injection[] getAllInjection(int x) {
		return injection;
	}
	
	//get set 
	public String getCenter_name() {
		return center_name;
	}
	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

}
