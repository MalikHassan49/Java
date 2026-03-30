package other.tools;

 // Run time polymorphism

class A {
  public void show() {
    System.out.println("in A show");
  }
}
class B extends A {
  public void show() {
    System.out.println("in B show");
  }
}
class C extends A {
  public void show() {
    System.out.println("in C show");
  }
}

// class D {
//   public void show() {
//     System.out.println("in D show");
//   }
// }


public class Polymorphism {
  public static void main(String[] args) {

    // Dynamic method dispatch but this is possible only for inheritance
    A obj = new A();
    obj.show();

    obj = new B();
    obj.show();

    obj = new C();
    obj.show();

    // obj = new D();
    // obj.show();     this is not possible because it is not the paret of inheritance means A,B,C
  }
}
