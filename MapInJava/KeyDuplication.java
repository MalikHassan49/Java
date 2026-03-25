package MapInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyDuplication {
 public static void main(String args[]) {
  Map<String, String> map = new HashMap<>();
  map.put("FName: ", "Ali");
  map.put("LName: ", "Hassan");
  map.put("FName: ", "Haider");
  map.put("FirstName: ", "Haider");
  Set<String> keys = map.keySet();
  for (String k : keys) {
    System.out.println(k + " " + map.get(k));
  }
} 
}
