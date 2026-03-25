package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
  public static void main(String args[]) {
    List<Integer> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    for (Integer integer : l) {
      System.out.println(integer);
    }
    System.out.println(l);
  }
}
