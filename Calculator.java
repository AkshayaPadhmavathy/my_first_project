import java.util.Scanner;
public class Calculator{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, sum, sub, mul;
    double div;
    System.out.println("Enter first number:");
    a = sc.nextInt();
    System.out.println("Enter second number:");
    b = sc.nextInt();
    sum = a + b;
    sub = a - b;
    mul = a * b;
    div = (double)a / b;
    System.out.println("Addition = " + sum);
    System.out.println("Subtraction = " + sub);
    System.out.println("Multiplication = " + mul);
    System.out.println("Division = " + div);
    sc.close();
  }
}
