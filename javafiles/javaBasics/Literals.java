package javaBasics;

public class Literals {
  public static void main(String [] args) {
    int a = 10;       // decimal
    int b = 0b1010;   // binary
    int c = 012;      // octal
    int d = 0xA;      // hexadecimal

    // int num = 10_00_00_00;
      //  float num = 56.623f;
      //  double num = 12e10;
      char ch = 'a';
      ch += 1;  // Compound Assignment
      // ch = ch + 1; error because char + int = int
       System.out.println(ch);
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    // System.out.println(d);
  }
}