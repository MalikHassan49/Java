package javaBasics;
public class ConditionalOperators {
  public static void main(String [] args) {
    int a = 10;
    int b = 20;
    int x = 8;
    int y = 7;
    int j = 9;

    // if(a > b && x < 7) {
    //   System.out.println("Hello");
    // }
    // else {
    //   System.out.println("Bye");
    // }

    // if(x > y)
    //   System.out.println(x);
    // else
    //   System.out.println(y);

    // if(a < b && x < y && j == 8) {
    //   System.out.println("That's code is working");
    // }

    if(x > y && x > j)
      System.out.println(x);
    else if(y > j)
      System.out.println(y);
    else 
      System.out.println(j);
  }
}