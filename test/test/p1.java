package test;



public class p1 {
	private String con_1;
	private String con_2;
	public p1() {
		this("alo", "kot");
		
	}
	
	public  p1(String c,String c2) {
		this.con_1 = c;
		this.con_2 = c2;
		if(c == "alo" && c2 == "kot")
		    System.out.println(ConsoleColors.RED + "construct call by this( , ) in Defal con " + ConsoleColors.RESET + ConsoleColors.CYAN + "in defal con only use one this ang call only constructer method can't use this( , )" + ConsoleColors.RESET);
		else
			System.out.println(ConsoleColors.GREEN + "construct call by normal" + ConsoleColors.RESET);
	}
	
	
	//method
	
	public void name(String c1,String c2) {
		System.out.println("1");
	}
	
	
	
	//static
    public static void testStatic() {
        System.out.println(ConsoleColors.GREEN + "static in opject" + ConsoleColors.RESET);
    }
    public static int f = 15;

    //get set
    public String getCon_1() {
		return con_1;
	}

	public void setCon_1(String con_1) {
		this.con_1 = con_1;
	}

	public String getCon_2() {
		return con_2;
	}

	public void setCon_2(String con_2) {
		this.con_2 = con_2;
	}


	
}
