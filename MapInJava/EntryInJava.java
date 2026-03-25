package MapInJava;

import java.util.HashMap;
import java.util.Map;

public class EntryInJava {
  public static void main(String args[]) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Apple");
    map.put(2, "Orange");
    map.put(3, "");
    map.put(4, "Mango");
    for (Map.Entry<Integer, String> m : map.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
  }
}
