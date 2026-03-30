package other.tools;

@FunctionalInterface
interface A {
  int add(int i, int j);
}

public class LambdaExpression {
  public static void main(String [] args) {
    // A obj = (i) -> System.out.println("in A show " + i);
    // obj.show(5);
    A obj = (i,j) -> i + j;
    int result = obj.add(5, 7);
    System.out.println(result);
  }
}
