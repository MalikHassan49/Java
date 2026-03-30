package javaBasics;

public class FunctionsExample2 {

  public static int addNumbers(int a, int b) {
    return a + b;
  }
  public static void main(String[] args) {
    int sum = addNumbers(5, 7);
    System.out.println("Sum = " + sum);
  }
}