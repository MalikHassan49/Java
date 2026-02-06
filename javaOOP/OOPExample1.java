class Student {
  String name;
  int age;

  void printInfo() {
    System.out.println("Name: " + name + ", Age: " + age);
  }

}
  // Main class
  public class OOPExample1 {
    public static void main(String[] args) {
      Student s1 = new Student();
      s1.name = "Hassan";
      s1.age = 21;

      Student s2 = new Student();
      s2.name = "Ali";
      s2.age = 19;

      // Method call
      s1.printInfo();
      s2.printInfo();
    }
  } 
