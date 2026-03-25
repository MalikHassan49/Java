package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
  public static void main(String args[]) {
    List<Integer> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    System.out.println(l);
    l.remove(0);
    System.out.println(l);
    l.clear();
    System.out.println(l);
  }
}
