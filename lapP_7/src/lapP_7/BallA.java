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
	

}
