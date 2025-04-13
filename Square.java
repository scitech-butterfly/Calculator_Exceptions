// Square.java
import java.util.*;

public class Square{
  public static void performSquare() {
        try {
            Scanner sc = new Scanner();
            System.out.print("Enter a number: ");
            double a = sc.nextDouble();
            double result = a * a;
            System.out.println("Square = " + result);
        } catch (Exception e) {
            System.out.println("Error in calculating square: " + e.getMessage());
        }
    }
}
