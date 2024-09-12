package lap10_calculater;

public class compute {
	private Integer result = 0;

	public Integer cal(String opera) {
		System.out.println("opera sent to compute" + opera);
		result = 0; //set zero for new round compute
		
		

		switch (opera.charAt(1)) { // to acess op |ex input 7+7
		case '+': {
			result = result + (opera.charAt(0) - '0') + (opera.charAt(2) - '0');
			break;
		}
		case '-': {
			result = result + (opera.charAt(0) - '0') - (opera.charAt(2) - '0');
			break;
		}
		case '*': {
			result = result + ((opera.charAt(0) - '0') * (opera.charAt(2) - '0'));
			break;
		}
		case '/': {
			result = result + ((opera.charAt(0) - '0') / (opera.charAt(2) - '0'));
			break;
		}
		default:
			System.out.println("in compute out of case");

		}
		return result;
	}

}
