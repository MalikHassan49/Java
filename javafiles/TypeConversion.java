public class TypeConversion {
  public static void main(String [] args) {
    byte b = 127;
    // int a = 256;
    int a = 12;
    // b = byte(a); not allowed because java see the variable type and their range
    // a = b;  implicit type casting
    b = (byte) a;  // explicit type casting because the value of a is in range of b that's why we convert it.
    System.out.println(b);

    float f = 5.6f;
    int x = (int) f;
    System.out.println(x);

    byte n = 127;
    int j = 257;
    n = (byte) j;
    System.out.println(n);

    byte h = 10;
    byte k = 30;
    // int result = h * k;  // type promotion
    // System.out.println(result);
    
    int num = 7;
    // int result = ++num;  // pre-inrement (first incremnet the value then fetch)
    int result = num++;    // post-increment (first fetch the value then increment)
    System.out.println(result);
    System.out.println(num);

  }

}