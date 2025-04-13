// Cube.java

import java.util.*;

public class Cube{
  public static void performCube() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            double a = sc.nextDouble();
            double result = a * a * a;
            System.out.println("Cube = " + result);
        } catch (Exception e) {
            System.out.println("Error in calculating cube: " + e.getMessage());
        }
    }
}
