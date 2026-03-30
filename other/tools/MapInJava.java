package other.tools;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {
  public static void main(String[] args) {
    Map<String, Integer> students = new HashMap<>();

    students.put("Navin", 56);
    students.put("Harsh", 23);
    students.put("Sushil", 67);
    students.put("Kiran", 92);
    students.put("Harsh", 49);

    System.out.println(students.keySet());

    for(String key : students.keySet()) {
      System.out.println(key + " : " + students.get(key));
    }
  }
}
// Note: 
/*
Agr hm multiple threads use kar arhe hain to hamian hashTable() use karne
chiye kuke ye synchronized hote hai.
*/