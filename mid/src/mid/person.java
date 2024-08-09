package mid;

public class person {
	private String id;
	private String name;
	private char gender;
	private int age;
	private String bodytype;
	//construct
	public  person(String id,String name,char gender,int age,String bodytype) {
		this.id = id;
		this.age = age;
		this.bodytype = bodytype;
		this.gender = gender;
		this.name = name;
		System.out.printf("Created opject Person<<%s>><<%s>><<%c>><<%d >><<%s >>\n\n",id,name,gender,age,bodytype);
	}
	//checkmrna
	public static void checkMRNA(person p_check) {
		
	}

}
