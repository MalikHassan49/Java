class Students {
  int rollNo;
  String name;
  int marks;
}

public class ArrayOfObjects {
  public static void main(String [] args) {
    Students students[] = new Students[3];

    Students s1 = new Students();
    s1.rollNo = 1;
    s1.name = "Ali";
    s1.marks = 77;

    Students s2 = new Students();
    s2.rollNo = 2;
    s2.name = "Usman";
    s2.marks = 56;

    Students s3 = new Students();
    s3.rollNo = 3;
    s3.name = "Sara";
    s3.marks = 98;

    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    // for(int i = 0; i < students.length; i++) {
    //   System.out.print(students[i].rollNo + " ");
    //   System.out.print(students[i].name + " ");
    //   System.out.print(students[i].marks + " ");
    //   System.out.println();
    // }

    // Enhanced for loop
    for(Students s : students) {
      System.out.print(s.name + " ");
      System.out.print(s.rollNo + " ");
      System.out.print(s.marks + " ");
      System.out.println();
    }
  } 
}