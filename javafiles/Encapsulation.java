class Human {
  private int age;
  private String name;

  public Human() {   // default constructor
    age = 12;
    name = "John";
  }

  public Human(int age, String name) {
    this.age = age;
    this.name = name;
  }
  

  public int getAge() {
    return age;
  }



  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}


public class Encapsulation {
  public static void main(String [] args) {
    // new Human();  anonymous object
    Human obj = new Human();
    Human obj1 = new Human(22, "Ali");
    System.out.println(obj.getAge() + " : " + obj.getName());
    System.out.println(obj1.getAge() + " : " + obj1.getName());
    // obj.setAge(22);
    // obj.setName("Hassan");
    // System.out.println(obj.getAge() + " : " + obj.getName());

  }
}


// Naming Convention

// camel casing

// class - Calc, Runnable
// variables and methods - show(), name

// constants - PIE, BRAND

// constructor - Human()

// variable - showMyMarks