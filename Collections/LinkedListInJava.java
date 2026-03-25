package Collections;

import java.util.LinkedList;

public class LinkedListInJava {
  public static void main(String args[]) {
    LinkedList<Integer> list = new LinkedList<>();

    System.out.println(list.size());
    list.add(55);
    System.out.println(list.size());
    list.add(55);
    System.out.println(list.size());
    list.add(55);
    System.out.println(list.size());
    list.add(55);
    System.out.println(list.size());
    list.add(55);

    for (Integer i : list) {
      System.out.println(i);
    }
  }
}
