package Collections;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
  public static void main(String args[]) {
    List<Integer> values = new ArrayList<>();
    values.add(1);
    values.add(2);
    values.add(3);
    values.add(4);
    values.add(5);
    int sum = 0;
  for (Integer v : values) {
    System.out.println(v + " ");
    sum = sum + v;
  }
  System.out.println("Sum : " + sum);

  }
}
