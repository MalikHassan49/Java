public class Stars3 {
  public static void main(String[] args) {
    for (int i = 1; i < 5; i++) {
      if (i == 4) {
        break;
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int k = 6 - (i * 2); k > 0; k--) {
        System.out.print(" ");
      }
      for (int l = 0; l < i; l++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
