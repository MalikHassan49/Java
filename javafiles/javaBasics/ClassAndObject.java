
package javaBasics;

class Calculator {
  public int r;

  public int add(int num1, int num2) {
    r = num1 + num2;
    return r;
  }
}


public class ClassAndObject {
  public static void main(String [] args) {
    int num1 = 4;
    int num2 = 6;

    Calculator calc = new Calculator();
    int result = calc.add(num1, num2);

    System.out.println(result);
  }
}