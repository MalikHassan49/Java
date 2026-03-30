import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsInJava {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4, 5, 7, 6, 2, 3);

    // Consumer<Integer> num = new Consumer<Integer>() {
    // public void accept(Integer n) {
    // System.out.println(n);
    // }
    // };

    // Consumer<Integer> num = n -> System.out.println(n);

    // Stream<Integer> s1 = nums.stream();
    // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
    // Stream<Integer> s3 = s2.map(n -> n * 2);
    // int result = s3.reduce(0, (c, e) -> c + e);

    // Predicate<Integer> p = new Predicate<Integer>() {
    //   public boolean test(Integer n) {
    //     if(n % 2 == 0)
    //       return true;
    //     else
    //       return false;
    //   }
    // };

    // Predicate<Integer> p = n -> n % 2 == 0;

    // Function<Integer, Integer> fun = new Function<Integer,Integer>() {

    //   public Integer apply(Integer n) {
    //     return n * 2;
    //   }
      
    // };

    // Function<Integer, Integer> fun = n ->  n * 2;

    // int result = nums.stream()
    //     // .filter(n -> n % 2 == 0)
    //     .filter(n -> n % 2 == 0)
    //     // .map(n -> n * 2)
    //     // .map(fun)
    //     .map(n ->  n * 2)
    //     .reduce(0, (c, e) -> c + e);

    // System.out.println(result);

    Stream<Integer> sortedValues = nums.stream()
                            .filter(n -> n % 2 == 0)
                            .sorted();

    sortedValues.forEach(n -> System.out.println(n));

    // s3.forEach(n -> System.out.println(n));

    // s2.forEach(n -> System.out.println(n));

    // s1.forEach(n -> System.out.println(n));
    // nums.forEach(n -> System.out.println(n));

    // nums.forEach(n -> System.out.println(n));

    // for(int i = 0; i < nums.size(); i++) {
    // System.out.println(nums.get(i));
    // }

    // for(int n : nums) {
    // System.out.println(n);
    // }

    // int sum = 0;
    // for(int n : nums) {
    // if (n % 2 == 0) {
    // n = n * 2;
    // sum = sum + n;
    // }
    // }
    // System.out.println("Sum: " + sum);
  }
}

// Note:
/*
 * -> stream(); hamain Stream interface ke ak object return karte ha aur us ke
 * andar nums ke
 * sare elements store ho jate hain aur s1 us object ko point karte ha.
 * -> Hm jo bhi change s1 main karege ge wo nums ko effect nahi karege ge hm koi
 * bhi operation
 * perform kar sakte hain s1 pr.
 * -> is ke ilawa stream yani s1 ko hm ak hi martabe use kar sakte hain multiple
 * times
 * us ko use nahi kar sakte.
 * 
 */