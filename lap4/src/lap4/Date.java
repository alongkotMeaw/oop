package lap4;

public class Date {
	//attribute
	private int day = 19;
	private int month = 7;
	private int year = 2024;
	//defalconstructor
	public  Date() {
		
	}
	
	//constructor 
	public  Date(int day,int month,int year) { 
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	
	public void getter() {
		System.out.printf("\nday = %d \nmonth = %d \nyear = %d\n",this.day,this.month,this.year + 543);
		
	}
	public void setter(int day,int month,int year) {
		if(day > 0 || day < 32)
			this.day = day;
		if(month > 0 || month < 13)
			this.month = month;
		this.year = year;
		
	}
	public int get_date() {
		return this.day;
		
	}
	public void set_day(int day) {
		this.day = day;
		
	}
	

}
