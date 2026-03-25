import java.util.ArrayList;
import java.util.List;

public class SecondGenExample {
  public static void main(String args[]) {
    List list = new ArrayList<>();
    list.add("Developer");

    // String str1 = list.get(0); cannot work because compiler does not know the type of list index
    String str2 = (String) list.get(0);
    System.out.println(str2);


    List<String> li = new ArrayList<>();
    li.add("MERN Developer");
    li.add("Backend Developer");
    String str3 = li.get(0);
    String str4 = li.get(1);

    System.out.println(str3);
    System.out.println(str4);
  }
}
