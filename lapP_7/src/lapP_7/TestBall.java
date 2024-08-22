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
		System.out.println(a.getTrademark() + "is a trademark of ball " + a.getBallname());
		System.out.println(a.getTrademark() + "'s ball is inflted "+ a.volume +" cu.ft.");
		System.out.println(a.getTrademark()  + " rolls " + a.getRool());
		
		System.out.println(b.getTrademark() + "is a trademark of ball " + b.getBallname());
		System.out.println(b.getTrademark() + "'s ball is inflted "+ b.volume +" cu.ft.");
		System.out.println(b.getTrademark() + " rolls " + b.getRool());
		
		System.out.println(c.getTrademark() + "is a trademark of ball " + c.getBallname());
		System.out.println(c.getTrademark() + "'s ball is inflted "+ c.volume +" cu.ft.");
		System.out.println(c.getTrademark() + " rolls " + c.getRool());
		

	}

}
