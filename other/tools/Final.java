package other.tools;

final class Calc {
  public final void show() {
    System.out.println("in Calc show");
  }

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}

class AdvCalc extends Calc {
  public void show() {
    System.out.println("in AdvCalc show");
  }
}


public class Final {
  public static void main(String[] args) {
    // final int num = 5;
    // num = 8;

    // System.out.println(num);

    AdvCalc obj = new AdvCalc();
    obj.show();
    obj.add(2, 8);
  }
}
