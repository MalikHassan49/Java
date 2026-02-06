public class Strings {
  public static void main(String [] args) {
    // String name = new String();  this will return a blank line

    // String name = new String("hassan"); 
    String name = "hassan"; // it work's same like above expression

    // System.out.println("Hello " + name);      

    // System.out.println(name.hashCode());     

    // System.out.println(name.concat(" raza"));        
    
    name = name + " raza";

    // System.out.println(name);

    String s1 = "Hassan";
    String s2 = "Hassan";

    // System.out.println(s1 == s2);

    StringBuffer sb = new StringBuffer("hassan");
    // System.out.println(sb.capacity());
    // sb.append("abcdabcdabcdabcda");
    // System.out.println(sb.capacity());

    sb.append(" raza");

    sb.insert(0, "Hello ");

    sb.substring(0, 4);
    System.out.println(sb);
  }
}