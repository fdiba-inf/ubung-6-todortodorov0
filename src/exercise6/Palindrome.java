package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int a = number;
        int b = a;
        int count = 1;
        assert number > 0 : "Fehler";
        while ((number / 10) != 0) {
          count++;
          number = number / 10;
        }
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
          array[i] = a % 10;
          a = a / 10;
        }
        int c = 0;
        for (int j = 0; j < array.length; j++) {
          c = c * 10;
          c = c + array[j];
        }
        if (c == b) {
          System.out.println("Palindrome: true");
        } else {
          System.out.println("Palindrome: false");
        }
    }
}