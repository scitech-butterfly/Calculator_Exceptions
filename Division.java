// Division.java
import java.util.*;

public class Division{
  public static void performDivision() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter numerator: ");
            double a = sc.nextDouble();
            System.out.print("Enter denominator: ");
            double b = sc.nextDouble();

            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            double result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error in division: " + e.getMessage());
        }
    }
}
