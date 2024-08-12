package test;





public class test {
	private int x = 5;
	public static int f = 10;

	public static void testStatic() {
		System.out.println(ConsoleColors.RED + "static in filed" + ConsoleColors.RESET);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test static method");
		System.out.print("call static in filed by test static testStatic();  = ");
		testStatic();
		System.out.print("call static in class by p1.testStatic();  = ");
		p1.testStatic();
		System.out.println("static attibute");
		System.out.println("attibute in filed call by var name " + ConsoleColors.RED +  f + ConsoleColors.RESET);
		System.out.println("attibute in class by class.var name " + ConsoleColors.GREEN + p1.f  + ConsoleColors.RESET);
        System.out.println("test create opject");
        p1 p = new p1();
        System.out.println(ConsoleColors.PURPLE + p.getCon_1() + "\n" + p.getCon_2() + ConsoleColors.RESET);
        
        p1 p2 = new p1("s2222","s22222");
        System.out.println(ConsoleColors.PURPLE + p2.getCon_1() + "\n" + p2.getCon_2() + ConsoleColors.RESET);
	}

}
