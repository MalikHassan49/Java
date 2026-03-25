public class GenericsMethod {
    public <T> void genericsMethod(T data) {
      System.out.println("GenericsMethod:");
      System.out.println("Demo data " + data);
    }

  public static void main(String args[]) {
    GenericsMethod demo = new GenericsMethod();
    demo.<String>genericsMethod("Full Stack Web developer");
    demo.genericsMethod("DevOps Engineer");
    demo.<Integer>genericsMethod(55);
  }
}
