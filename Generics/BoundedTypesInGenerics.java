public class BoundedTypesInGenerics<T extends Number> {
  T data;
  BoundedTypesInGenerics(T data) {
    this.data = data;
  }

  public void show() {
    System.out.println(data);
  }

  public static void main(String args[]) {
    // Integer type
    BoundedTypesInGenerics<Integer> p1 = new BoundedTypesInGenerics<Integer>(5);
    // Double type
    BoundedTypesInGenerics<Double> p2 = new BoundedTypesInGenerics<Double>(9.8);
    p1.show();
    p2.show();
    // With String type it shows compile time error because bounded type restriction
    // BoundedTypesInGenerics<String> p3 = new BoundedTypesInGenerics<String>("DevOps");
  }
}
