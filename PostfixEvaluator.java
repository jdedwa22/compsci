import java.util.Scanner;

public class PostfixEvaluator
{
	public static int evaluate(String expr)
	{
		ArrayStack<Integer> stack = new ArrayStack<>(100);
		Scanner parser = new Scanner(expr);

		while (parser.hasNext())
		{
			String token = parser.next();

			if ("+-*/%^><=&|".indexOf(token) >= 0)
			{
				Integer op2 = stack.pop();
				Integer op1 = stack.pop();
				if (op1 == null || op2 == null)
				{
					throw new java.lang.ArithmeticException("Insufficient operands for " + token + ".");
				}
				stack.push(evaluateDoubleOperator(token.charAt(0), op1, op2));
			}
			else if ("~!".indexOf(token) >= 0)
			{
				Integer op1 = stack.pop();
				if (op1 == null)
				{
					throw new java.lang.ArithmeticException("No operands for " + token + ".");
				}
				stack.push(evaluateSingleOperator(token.charAt(0), op1));
			}
			else if (token.equals("?"))
			{
				Integer op3 = stack.pop();
				Integer op2 = stack.pop();
				Integer op1 = stack.pop();
				if (op1 == null || op2 == null || op3 == null) {
					throw new java.lang.ArithmeticException("Insufficient operands for " + token + ".");
				}
				stack.push(evaluateTernaryOperator(op1, op2, op3));
			}
			else
			{
				stack.push(Integer.parseInt(token));
			}
		}

		if (stack.size() != 1)
		{
			throw new java.lang.ArithmeticException("" + (stack.size() - 1) + " too few operators.");
		}

		return stack.pop();
	}

	private static int evaluateDoubleOperator(char operation, int op1, int op2)
	{
		switch (operation)
		{
			case '+': return op1 + op2;
			case '-': return op1 - op2;
			case '*': return op1 * op2;
			case '/': return op1 / op2;
			case '%': return op1 % op2;
			case '^': return (int)Math.pow(op1, op2);
			case '>':
				if (op1 > op2)
				{
					return 1;
				}
				return 0;
			case '<':
				if (op1 < op2)
				{
					return 1;
				}
				return 0;
			case '=':
				if (op1 == op2)
				{
					return 1;
				}
				return 0;
			case '&':
				if (op1 != 0 && op2 != 0)
				{
					return 1;
				}
				return 0;
			case '|':
				if (op1 != 0 || op2 != 0)
				{
					return 1;
				}
				return 0;
			default:  return 0;
		}
	}
	private static int evaluateSingleOperator(char operation, int op1)
	{
		switch (operation)
		{
			case '~': return op1 - (2 * op1);
			case '!':
				int total = op1;
				for (int i = op1; i > 1; i--)
				{
					total *= (i - 1);
				}
				return total;
			default: return 0;
		}
	}
	private static int evaluateTernaryOperator(int op1, int op2, int op3)
	{
		return (op1 != 0) ? op2 : op3;
	}
}
