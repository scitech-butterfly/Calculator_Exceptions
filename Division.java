// Division.java

public class Division{
  try {
            System.out.print("Enter numerator: ");
            double a = sc.nextDouble();
            System.out.print("Enter denominator: ");
            double b = sc.nextDouble();

            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            double result = a / b;
            System.out.println("Result = " + result);
  }
}
