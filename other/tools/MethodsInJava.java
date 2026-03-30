import java.util.Arrays;
import java.util.List;

public class MethodsInJava {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(4,5,7,6,2,3);
    int sum = 0;
    for(int n : nums) {
      if (n % 2 == 0) {
        n = n * 2;
        sum = sum + n;
      }
    }
    System.out.println("Sum: " + sum);
  }
}