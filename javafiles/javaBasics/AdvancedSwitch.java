package javaBasics;

public class AdvancedSwitch {
  public static void main(String [] args) {
    String day = "Monday";
    String result = "";
    // switch(day) {
    //   case "Saturday", "Sunday", "Monday", "Tuesday":
    //     System.out.println("6am");
    //     break;
    //   case "Wednesday":
    //     System.out.println("7am");
    //     break;
    //   default:
    //     System.out.println("8am");
    // }

    // Advanced Switch
    // switch(day) {
    //   case "Saturday", "Sunday" -> System.out.println("6am");
    //   case "Monday" -> System.out.println("7am");
    //   default -> System.out.println("8am");
    // }

      // switch(day) {
      //   case "Saturday", "Sunday" -> result = "6am";
      //   case "Monday" -> result = "7am";
      //   default -> result = "8am";
      // }
      // System.out.println(result);


      // result = switch(day) {
      //   case "Saturday", "Sunday" -> "6am";
      //   case "Monday" -> "7am";
      //   default -> "8am";
      // };

      System.out.println(result);
      result = switch(day) {
        case "Saturday", "Sunday": yield "6am";
        case "Monday" : yield "7am";
        default : yield "8am";
      };
      System.out.println(result);
  }
}