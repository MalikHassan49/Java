package other.tools;

interface A {
  int age = 22;       // by default public static final
  String area = "Mianwali";   

  void show();     //  by default public abstract
  void talk(); 

}

interface X extends A {
  void run();
}

class B implements A,X {
  public void show() {
    System.out.println("in B show");
  }

  public void talk() {
    System.out.println("Someone talks");
  }

  public void run() {
    System.out.println("running...");
  }
}

public class Interface {
  public static void main(String [] args) {
    A obj = new B();
    X obj1 = (X) obj;
    obj1.show();
    obj1.talk();
    obj1.run();
    // B obj = new B();
    // obj.show();
    // obj.talk();
    // obj.run();

    // A obj = new B();
    // obj.show();
    // obj.talk();
  



    // System.out.println(A.age);
  }
}
