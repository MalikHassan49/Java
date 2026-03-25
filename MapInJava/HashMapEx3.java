package MapInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
  public static void main(String args[]) {
    Map<String, String> map = new HashMap<>();
    map.put("FName: ", "Hassan");
    map.put("LName: ", "Ali");

    Set<String> keys = map.keySet();
    for (String k : keys) {
      System.out.println(k + " " + map.get(k));
    }
  }
}
