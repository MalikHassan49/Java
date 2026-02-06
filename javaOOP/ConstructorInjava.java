class Student {
  String name;
  int age;

  Student(String n, int a) {
    name = n;
    age = a;
  }

    void printInfo() {
      System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorInjava {
    public static void main(String[] args) {
      Student s1 = new Student("Haider", 24);
      Student s2 = new Student("Usman", 20);

      s1.printInfo();
      s2.printInfo();
    }
}