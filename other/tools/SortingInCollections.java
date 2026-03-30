package other.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

// compareTo Comparable interface ke method ha
  public int compareTo(Student that) {
     if(this.age > that.age)
          return 1;
        else
          return -1;
  }

}

public class SortingInCollections {
  public static void main(String[] args) {
    // List<Integer> nums = new ArrayList<>();
    // // Agr main apni logic se sort karne chachte hoon to Comparator use karuege
    // // Comparator ak interface ha aur compare suke method
    // // Main nums array ko last digit ki base pr sort karne chachte hoon
    // Comparator<Integer> com = new Comparator<Integer>() {
    // public int compare(Integer i, Integer j) {
    // if(i % 10 > j % 10)
    // return 1;
    // else
    // return -1;
    // }
    // };

    // nums.add(56);
    // nums.add(45);
    // nums.add(12);
    // nums.add(34);

    // // Collections is a class
    // Collections.sort(nums, com);
    // System.out.println(nums);

    // Comparator<String> strCom = new Comparator<String>() {
    // public int compare(String s1, String s2) {
    // if(s1.length() > s2.length())
    // return 1;
    // else
    // return -1;
    // }
    // };

    // List<String> str = new ArrayList<>();

    // str.add("Hassan");
    // str.add("Ali Hassan Khan");
    // str.add("Muzamil");
    // str.add("Inamuallah");

    // Collections.sort(str, strCom);

    // System.out.println(str);

    // Comparator<Student> studsCom = new Comparator<Student>() {
    //   public int compare(Student s1, Student s2) {
    //     if(s1.age > s2.age)
    //       return 1;
    //     else
    //       return -1;
    //   }
    // };

    Comparator<Student> studsCom =(s1, s2) -> {return s1.age > s2.age ? 1 : -1;};

    List<Student> studs = new ArrayList<>();

    studs.add(new Student(23, "Ali"));
    studs.add(new Student(20, "Usman Haider"));
    studs.add(new Student(25, "Abdul Hadi"));
    studs.add(new Student(19, "Hira"));

    Collections.sort(studs, studsCom);
    // Collections.sort(studs);

    for(Student s : studs) {
      System.out.println(s);
    }
  }
}
// Note
/*
-> Integer ko Collections.sort(nums) is liye directly sort kardete ha kuke wo Comparable
ko implement karte ha.
-> Student ko is liye directly sort nahi karte kuke Student ne Comparable ko
implement nehi kiye jb Student Comparable ko implement karege to wo bhi directly
sort ho gye ge.

*/