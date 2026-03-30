package javaBasics;

class Calculator {
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public int add(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  public double add(double num1, int num2) {
    return num1 + num2;
  }
}

public class MethodOverloading {
  public static void main(String [] args) {
    Calculator obj = new Calculator();
    int r1 = obj.add(2, 3);
    int r2 = obj.add(4, 8, 2);
    double r3 = obj.add(5.8, 8);

    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
  }
}