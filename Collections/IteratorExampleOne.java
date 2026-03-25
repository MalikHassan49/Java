package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorExampleOne {
  public static void main(String args[]) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    // iterator declaration
    // Iterator i = list.iterator();
    Iterator<Integer> i = list.iterator();
    // without using loop
    // System.out.println("Without using loop: ");
    // System.out.println(i.next());
    // System.out.println(i.next());
    // System.out.println(i.next());
    // System.out.println(i.next());
    // ---> By using loop
    System.out.println("By using loop: ");
    while (i.hasNext()) {
      System.out.println(i.next());
    }
  }
}
