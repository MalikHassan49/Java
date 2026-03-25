package MapInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
  public static void main(String args[]) {
    Map<String, String> map = new HashMap<>();
    map.put("MyName: ", "Ali");
    map.put("LName: ", "Hassan");
    map.put("Designation: ", "Professor");
    System.out.println(map.get("LName: "));
    System.out.println(map.get("FName: "));
    System.out.println(map);
  }
}
