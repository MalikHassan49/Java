public class GenericWithTwoParams <F, S> {
  F param1;
  S param2;
  GenericWithTwoParams (F p1, S p2) {
    param1 = p1;
    param2 = p2;
  }

  public void show() {
    System.out.println(param1);
    System.out.println(param2);
  }

  public static void main(String args[]) {
    GenericWithTwoParams<Integer, Double> params = new GenericWithTwoParams<>(4, 6.2);
    params.show();

  }
}
