public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = {90, 85, 70, 60, 95};

        System.out.println("First mark: " + marks[0]);

        for(int i = 0; i < marks.length; i++) {
          System.out.println("Mark" + (i+1) + ":" + marks[i]);
        }
    }
}