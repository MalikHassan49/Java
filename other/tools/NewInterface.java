package other.tools;

abstract class Computer {
  public abstract void code();
}

class Laptop extends Computer {
  public void code() {
    System.out.println("Code, Compile, Run");
  }
}

class Desktop extends Computer {
  public void code() {
    System.out.println("Code, Compile, Run : faster");
  }
}


class Developer {
  public void DevCode(Computer any) {
    any.code();
  }
}

public class NewInterface {
  public static void main(String[] args) {
    Developer dev = new Developer();
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    dev.DevCode(desk);
    dev.DevCode(lap);
  }
}
