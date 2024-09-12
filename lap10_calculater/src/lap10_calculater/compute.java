package lap10_calculater;

import java.util.Stack;

public class compute {
	private Integer result = 0;
	

	calecpression converter = new calecpression();
	Stack<Integer> stack = new Stack<>();

	public Integer cal(String opera) {
		String exprepressionAfterCaleecpression = converter.convertExpression(opera);

		System.out.println("opera sent to compute" + exprepressionAfterCaleecpression);
		result = 0; // set zero for new round compute
		for (Character ch : exprepressionAfterCaleecpression.toCharArray()) {
			if (Character.isDigit(ch)) {
				// Push the digit onto the stack
				stack.push(Character.getNumericValue(ch));
			} else {
				// It's an operator, so pop two values and apply the operator
				int num2 = stack.pop();
				int num1 = stack.pop();
				int result = 0;

				switch (ch) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				case '^':
					result = (int) Math.pow(num1, num2);
					break;
				default:
					System.out.println("Unknown operator: " + ch);
				}

				stack.push(result);
			}
		}
		return stack.pop();

	}

}
