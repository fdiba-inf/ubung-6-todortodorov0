package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
          String pass = input.next();
          int a = 0;
          boolean valid = false;
          
          if (pass.length() < 8) {
            valid = false;
            continue;
          } else {
            for (int i = 0; i < pass.length(); i++) {
              if (Character.isDigit(pass.charAt(i))) {
                a++; 
              }
              if (!Character.isLetterOrDigit(pass.charAt(i))) {
                valid = false;
                break;
              }
            }
          }
          if (a >= 2) {
            break;
          }
        } while (true);
        System.out.println("Password valid!");
    }
}