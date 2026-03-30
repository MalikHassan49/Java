package other.tools;

// enum Day {
//   Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
// }

enum Status {
  Running, Pending, Failed, Success;
}

public class Enum {
  public static void main(String [] args) {
    // Day[] d = Day.values();

    // for(Day days: d) {
    //   System.out.println(days + " " + days.ordinal());
    // }

    Status s = Status.Pending;

    System.out.println(s.getClass().getSuperclass());
    // switch(s) {
    //   case Running:
    //     System.out.println("All good");
    //     break;

    //   case Failed:
    //     System.out.println("Try Again");
    //     break;
    //   case Pending:
    //     System.out.println("Please wait");
    //     break;
    //   default:
    //     System.out.println("Done");
    // }

    if(s == Status.Running)
      System.out.println("All good");

    else if(s == Status.Failed)
      System.out.println("Try Again");

    else if(s == Status.Pending)
      System.out.println("Please wait");

    else
      System.out.println("Done");
  }
}
