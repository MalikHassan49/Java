package Collections;

import java.util.Vector;

public class VectorExampleOne {
  public static void main(String args[]) {
    Vector<Integer> v = new Vector<>();
    System.out.println(v.capacity());

    v.add(1);
    v.add(2);
    v.add(3);
    v.add(4);
    v.add(5);
    v.add(6);
    v.add(7);
    v.add(8);
    v.add(9);
    v.add(10);
    v.add(11);
    v.add(12);
    v.add(13);
    v.add(14);
    System.out.println(v.capacity());
  }
}
