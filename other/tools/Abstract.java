package other.tools;

abstract class Car {
  public abstract void drive();  // abstract method
  public abstract void fly();

  public void playMusic() {
    System.out.println("music is played in Car");
  }
}

abstract class WagonR extends Car {
  public void drive() {
    System.out.println("WagonR is drived");
  }

  public void turn() {
    System.out.println("WagonR takes turn");
  }
}

class UpdatedWagonR extends WagonR {     // concrete class
  public void fly() {
    System.out.println("Flying...");
  }
}


public class Abstract {
  public static void main(String [] args) {
    Car obj = new UpdatedWagonR();

    obj.drive();
    obj.playMusic();
    obj.fly();
  }
}
