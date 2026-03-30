package other.tools;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResouces {
  public static void main(String [] args) throws NumberFormatException, IOException {
    int num = 0;

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {  // try block automatically close the resources means br.close();
      num = Integer.parseInt(br.readLine());
      System.out.println(num);
    } 
  }

  // Prefer to use this approach
  // public static void main(String [] args) throws NumberFormatException, IOException {
  //   int num = 0;
  //   BufferedReader br = null;
  //   try {
  //     InputStreamReader in = new InputStreamReader(System.in);
  //      br = new BufferedReader(in);
  //     num = Integer.parseInt(br.readLine());
  //   }
  //   finally {  // finally resources ko close karne ke liye sue hote ha. aur chiye exception aye ye na aye finally zaroor chalte ha.
  //     br.close();
  //   }
  // }
}
