package other.tools;

abstract class A {
  public abstract void show();  // abstract method

  public void talk() {
    System.out.println("SomeOne is talking...");
  }
}


public class AbstractAndAnonymousInnerClass {
  public static void main(String[] args) {
    A obj = new A() {   // Anonymous class => internally child class of A but without name.
      public void show() {
        System.out.println("real implementation of show");
      }
    };
    obj.show();
    obj.talk();
  }
}
