package lapP_7;

public class BallC extends BallA{
	protected char ballName = 'C';
	public void inflate(double volume) {
    	this.volume = volume;
    }
	
	public char getBallname() {
		return ballName;
	}
	
	public void roll() {
	    roll = "very smoothly.";
	}
}
