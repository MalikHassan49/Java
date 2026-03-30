package other.tools;

class A {
  public void show() {
    System.out.println("in A show");
  }
}

public class AnonymousInnerClass {
  public static void main(String[] args) {
    A obj = new A()
    {                               // Anonymous inner class
      public void show() {
        System.out.println("in B show");
      }
    };
    obj.show();
  }
}
