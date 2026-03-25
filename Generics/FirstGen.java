import java.lang.Integer;

public class FirstGen <T> {
  T data;
  FirstGen(T data) {
    this.data = data;
  }

  void show() {
    System.out.println(data);
  }

  public static void main(String args[]) {
    // FirstGen<Integer> fg = new FirstGen<Integer>("Hello");  // compile-time error
    FirstGen<Integer> fg = new FirstGen<Integer>(5);
    fg.show();
  }
}