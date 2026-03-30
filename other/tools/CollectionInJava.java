package other.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
// import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionInJava {
  public static void main(String [] args) {
    // Collection<Integer> nums = new ArrayList<>();
    // List<Integer> nums = new ArrayList<>();
    // Set<Integer> nums = new HashSet<>();  // return unique value but not sorted
    // Set<Integer> nums = new TreeSet<>();  // return unique with sorted
    Collection<Integer> nums = new TreeSet<>(); 


    nums.add(69);
    nums.add(47);
    nums.add(2);
    nums.add(90);
    nums.add(17);
    nums.add(17);

    Iterator<Integer> values = nums.iterator();
    while (values.hasNext()) {
      System.out.println(values.next());
    }

    // System.out.println(nums.get(1));
    // System.out.println(nums.indexOf(0));

    // for(int n : nums) {
    //   System.out.println(n);
    // }

    // System.out.println(nums);
  }
}
