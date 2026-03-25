package Collections;

import java.util.Set;
import java.util.HashSet;

// duplicates are not allowed in set
// hashSet does not maintain order

public class HashSetInJava {
  public static void main(String args[]) {
    Set<Integer> s = new HashSet<>();
    s.add(66);
    s.add(44);
    s.add(99);
    s.add(88);
    s.add(88);
    for (Integer i : s) {
      System.out.println(i);
    }
  }
}
