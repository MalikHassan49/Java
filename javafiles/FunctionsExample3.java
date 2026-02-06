import java.util.Scanner;

public class FunctionsExample3 {

  public static int square(int n) {
    return n * n;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(system.in);

    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    int result = square(num);

    System.out.println("Square = " + result);
  }
}