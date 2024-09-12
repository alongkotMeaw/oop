package lap10_calculater;

import java.util.Stack;

public class calecpression {
    static Stack<Character> stack = new Stack<>();
    static int maxPriority;
    static String expressionAfterConversion;

    public String convertExpression(String expression) {
        expressionAfterConversion = ""; // Set "" for a new round

        for (char ch : expression.toCharArray()) {
            switch (ch) {
                case '+':
                    push(ch, 1);
                    break;
                case '-':
                    push(ch, 1);
                    break;
                case '*':
                    push(ch, 2);
                    break;
                case '/':
                    push(ch, 2);
                    break;
                default:
                    expressionAfterConversion += ch; // Append operand to result
                    break;
            }
        }
        pop(); // Pop remaining operators
        return expressionAfterConversion;
    }

    static void pop() {
        while (!stack.isEmpty()) {
            expressionAfterConversion += stack.pop();
        }
    }

    static void push(char op, int prio) {
        while (!stack.isEmpty() && getPriority(stack.peek()) >= prio) {
            expressionAfterConversion += stack.pop();
        }
        stack.push(op);
    }

    static int getPriority(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}
