class Computer {
  public void PlayMusic() {
    System.out.println("Music playing...");
  }

  public String getMeAPen(int cost) {
    if(cost >= 10)
      return "Pen";

    return "Nothing";
  }
}


public class Methods {
  public static void main(String [] args) {
    Computer obj = new Computer();
    obj.PlayMusic();
    String str = obj.getMeAPen(99);

    System.out.println(str);
  }
}