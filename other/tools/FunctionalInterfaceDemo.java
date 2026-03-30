package other.tools;

@FunctionalInterface
interface A {
  void show();
}

// class B implements A {
//   public void show() {
//     System.out.println("in show");
//   }
// }

public class FunctionalInterfaceDemo {
  public static void main(String [] args) {
    A obj = new A() {
      public void show() {
        System.out.println("in A show");
      }
    };
    obj.show();
  }
}
