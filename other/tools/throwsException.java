package other.tools;

class A {
  public void show()throws ClassNotFoundException {
    Class.forName("show");
  }
}

public class throwsException {
  static {
    System.out.println("Class loaded");
  }

  public static void main(String [] args) {
    A obj = new A();
    try {
      obj.show();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
