package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorForModification {
  public static void main(String args[]) {
    List<String> list = new ArrayList<>();
    list.add("MERN");
    list.add("Developer");
    ListIterator<String> li = list.listIterator();
    while (li.hasNext()) {
      String e = li.next();
        if (e.contains("MERN")) {
          li.set(e + " Stack ");
        }
    }
    li = list.listIterator();
    while (li.hasNext()) {
      System.out.print(li.next());
    }
    System.out.println();
    while (li.hasPrevious()) {
      System.out.println(li.previous());
    }
  }
}
