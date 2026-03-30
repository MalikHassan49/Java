package javaBasics;

class A extends Object  {
  public A() {  // default constructor
    super();
    System.out.println("in A default");
  }

  public A(int a) {
    super();
    System.out.println("in A int");
  }
}

class B extends A {
   public B() {  // default constructor
    super();  // execute the constructor of parent class
    System.out.println("in B default");
  }

  public B(int b) {
    this();   // this will execute the constructor of same class
    System.out.println("in B int");
  }
}


public class ThisAndSuper {
  public static void main(String [] args) {
    B obj = new B(5);
  }
}
