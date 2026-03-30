package other.tools;

class Laptop {
  String model;
  int price;

  public String toString() {
    return model + " : " + price;
  }

  public boolean equals(Laptop o) {
    if (this == o) return true;

    if (o == null || getClass() != o.getClass()) return false;

    Laptop l = (Laptop) o;

    return price == l.price && model.equals(l.model);
  }
}


public class ObjectClassOne {
  public static void main(String [] args) {
    Laptop obj1 = new Laptop();
    obj1.model = "Lenove 12";
    obj1.price = 1200;

    Laptop obj2 = new Laptop();
    obj2.model = "Lenove 10";
    obj2.price = 1200;

    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj1.equals(obj2));  // by default equals can alse compare memory reference that's why we can override it manually. 

  }
}
