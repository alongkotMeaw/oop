package lap10_calculater;

import java.util.Stack;

public class compute {

	public Double cal(String opera) {
		String num1 = "";
		String num2 = "";

		System.out.println("opera sent to compute" + opera);
		double result = 0f;
		boolean checck = true;
		String sum_op = "";
		for (int i = 0;i < opera.length();i++ ) {
			Character ch = opera.charAt(i);
			for (Character op : "+-/*".toCharArray()) {
				if (ch == op) {
					sum_op = sum_op + op;
					checck = false;
					ch = opera.charAt(++i); // move to next text
					break;
				}
			}
			
			if (checck)
				num1 = num1 + ch;
			else
				num2 = num2 + ch;
		}

		System.out.println("numafter cal num1  " + num1 + " num2  " + num2 + " op " + sum_op);

		switch (sum_op.charAt(0)) {
		case '+':
			// Float.parseFloat(str);
			result = Double.parseDouble(num1) + Double.parseDouble(num2);
			break;
		case '-':
			result = Double.parseDouble(num1) - Double.parseDouble(num2);
			break;
		case '*':
			result = Double.parseDouble(num1) * Double.parseDouble(num2);
			break;
		case '/':
			result = Double.parseDouble(num1) / Double.parseDouble(num2);
			break;
		case '^':
			result = Math.pow(Double.parseDouble(num1), Double.parseDouble(num2));
			break;
		default:
			System.out.println("Unknown operator: " + sum_op);
		}
		return result;

	}
}
