import java.util.Scanner;

public class PostfixTester
{
    public static void main(String[] args)
    {
        String expression, again;
        Scanner in = new Scanner(System.in);

        System.out.println("Postfix Expression Evaluator – Jacob Edwards");
        
        do
        {
 			System.out.print("\nPost-fix Expression: ");
            expression = in.nextLine();

            try
            {
            	System.out.println("Result = " + PostfixEvaluator.evaluate(expression));
            } 
            catch (ArithmeticException ae)
            {
            	System.out.println("ERROR: " + ae.getMessage());            	
            }

            System.out.print("\nEvaluate another expression [Y/N]? ");
            again = in.nextLine();
        }
        while (again.equalsIgnoreCase("y"));
        
        in.close();
  }
}
