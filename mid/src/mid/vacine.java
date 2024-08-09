package mid;

public class vacine {
	private String code;
	private String name;
	private double valume;
	private injection[] injection; 
	
	public vacine(String code,String name,double valume,int num) {
		this.code = code;
		this.valume = valume;
		this.name = name;
		this.injection = new injection[num];
		System.out.printf("Creted object Vaccine<<%s>><<%s>><<%.1f cc>> Create Injection array <<%d>>\n\n",code,name,valume,num);
	}

}
