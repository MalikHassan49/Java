package other.tools;

class Student {
  public void show() {
    System.out.println("in Student class");
  }

  // @Override
  // public String toString() {
  //   System.out.println("override toString");
  //   return "Override";
  // }
}

public class ObjectClass {
  public static void main(String[] args) {
    Student s = new Student();
    System.out.println(s.toString());
  }
}
