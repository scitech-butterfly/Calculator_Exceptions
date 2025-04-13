// SquareRoot.java

import java.util.*;

public class SquareRoot{
  public static void performSquareRoot() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            double a = sc.nextDouble();

            if (a < 0) {
                throw new ArithmeticException("Cannot compute square root of a negative number.");
            }

            double result = Math.sqrt(a);
            System.out.println("Square Root = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error in calculating square root: " + e.getMessage());
        }
    }
}
