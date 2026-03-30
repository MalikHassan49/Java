package other.tools;

class Outer {
  int age;
  public void show() {
    System.out.println("in Outer show");
  }

    static class Inner {
    public void config() {
      System.out.println("in Inner config");
    }
  }
}

public class InnerClass {
  public static void main(String [] args) {
    Outer obj = new Outer();
    obj.show();

    // Outer.Inner obj1 = Outer.new Inner();  agr Inner class static ne ho to Outer ke object ki zaroorat hoti hai.

    Outer.Inner obj1 = new Outer.Inner();  // agr Inner class static ho to outer ke object ki zaroorat nahi
    obj1.config();

  }
}
