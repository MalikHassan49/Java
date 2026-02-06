class Mobile {
  String brand;
  int price;
  static String name;

  public Mobile() {
    brand = "";
    price = 200;
    System.out.println("in constructor");
  }

  static {
    name = "Phone";
    System.out.println("in static block");
  }

  public void show() {
    System.out.println(brand + " : " + price + " : " + name);
  }

  public static void show1(Mobile obj) {
    System.out.println(obj.brand + " : " + obj.price + " : " + name);
  }
}


public class StaticVariable {
  public static void main(String [] args) throws ClassNotFoundException {
    // Mobile.name = "SmartPhone";  ye static block ko execute kardege.
    Class.forName("Mobile");
    // Mobile obj1 = new Mobile();

    // obj1.brand = "Apple";
    // obj1.price = 1500;
    // Mobile.name = "SmartPhone";

    // Mobile obj2 = new Mobile();

    // obj2.brand = "Samsung";
    // obj2.price = 1700;
    
    // obj1.show();
    // obj2.show();

    // Mobile.show1(obj1);
  }
}
