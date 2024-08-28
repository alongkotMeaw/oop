package lapP_7;

public class TestBall {

	public static void main(String[] args) {
		BallA a = new BallA();
		BallB b = new BallB();
		BallC c = new BallC();
		a.roll();
		b.roll();
		c.roll();
		a.inflate(1.0);
		b.inflate(1.1);
		c.inflate(1.2);
	    System.out.println(a.toString());
	    System.out.println(b.toString());
	    System.out.println(c.toString());
		
	}

}
