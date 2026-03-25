package Collections;

import java.util.Set;
import java.util.TreeSet;

// TreeSet maintains order

public class TreeSetInJava {
  public static void main(String args[]) {
    Set<Integer> values = new TreeSet<>();
    values.add(66);
    values.add(44);
    values.add(99);
    values.add(55);
    values.add(55);
    for (Integer v : values) {
      System.out.println(v);
    }
  }
}
