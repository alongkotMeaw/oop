package lapP_7;

public class BallA extends Ball implements Rollable{
	protected char ballName = 'A';
    protected double volume;
    protected String roll;
	public void inflate(double volume) {
    	this.volume = volume;
    }
<<<<<<< HEAD
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
	
	
	
	


	
	
=======
	
	public void roll() {
	    roll = "rather smoothly.";
	}

	
	
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getRool() {
		return roll;
	}

	public void setRool(String rool) {
		this.roll = rool;
	}

	public void Ball(String ball){
		tradeMark = ball;
	}
	
	public String getTrademark() {
		return tradeMark;
	}
	
	public char getBallname() {
		return ballName;
	}
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657
	

}
