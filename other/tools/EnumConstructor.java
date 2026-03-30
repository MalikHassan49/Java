package other.tools;

enum Laptop {
  MacBook(2000), XPS(2200), Lenovo, ThinkPad(1800);

  private int price;

  private Laptop() {
    this.price = 500;
    System.out.println("in default Laptop " + this.name());
  }

  Laptop (int price) {
    this.price = price;
    System.out.println("in parameterized Laptop " + this.name());
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  
}

public class EnumConstructor {
  public static void main(String[] args) {
    // Laptop lap = Laptop.MacBook;
    // lap.setPrice(3000);
    // System.out.println(lap + " : " + lap.getPrice());

    for(Laptop lap : Laptop.values()) {
      System.out.println(lap + " : " + lap.getPrice());
    }
  }
}
