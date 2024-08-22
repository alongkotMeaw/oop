package lapP_7;

public class BallB extends BallA{
	protected char ballName = 'B';
	public void inflate(double volume) {
    	this.volume = volume;
    }
	
	public char getBallname() {
		return ballName;
	}
	
	public void roll() {
	    roll = "smoothly.";
	}

}
