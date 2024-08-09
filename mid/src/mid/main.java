package mid;

public class main {

	public static void main(String[] args) {
		//center 
		center c1 = new center("SCG BangSue ",": 1 Siam Cement Road Bangkok",10);
		center c2 = new center("SCB","9 Ratchadaphisek Road, Chatychak, Bangkok",10);
		//vacine
		vacine v1 = new vacine("AZD1222", "AstraZeneca", 6.5, 20);
		vacine v2 = new vacine("DNT162b2", "Pfizer, Inc., and BioNTech", 6.5, 20);
		//person
		person p1 = new person("421536521751", "Jonh Doe", 'M', 18, "Fat"); 
		person p2 = new person("123456789911", "Jonh Dear", 'M', 65, "Hypertension");

	}

}
