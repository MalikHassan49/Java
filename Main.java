import java.lang.*;  // automatically import by java 

import other.tools.*;
import other.*;


public class Main {
  public static void main(String [] args) {
    AdvCalcu obj = new AdvCalcu();
    int r1 = obj.add(4, 9);
    int r2 = obj.sub(7,3);
    int r3 = obj.multi(9,7);
    int r4 = obj.div(15,3);

    A obj1 = new A();

    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
  }
}

