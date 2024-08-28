package lapP_7;

public class BallA extends Ball implements Rollable{
	protected char ballName = 'A';
    protected double volume;
    protected String roll;
	public void inflate(double volume) {
    	this.volume = volume;
    }
	public void roll() {
	    roll = "rather smoothly.";
	}
	public char getBallName() {
		return ballName;
	}
	public String toString(BallA A) {
		return "is a trademark of ball " + A.getBallName() + "\n"  + tradeMark +"'s ball is inflted "+ volume +" cu.ft.\n" + tradeMark+ " rolls " + roll;
	}
	public static void testBall(BallA a,double b) {
		a.inflate(b);
		a.roll();
		System.out.println(a.toString(a));
	}
	
	
	
	


	
	
	

}
