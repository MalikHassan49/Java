package javaBasics;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five numbers");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("You entered: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}