/*
Write a Java program that prompts the user to enter three integers a, b, and c. As output the
program is to display the number of integers entered by the user that are odd. The output statement must
exactly match the sample output statements provided below:

Enter a: 32
Enter b: 47
Enter c: 59

Two integers were odd.
*/

import java.util.Scanner;

public class Problem6 {
public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a;
        int b;
        int c;

        int counter = 0;

        System.out.print("Enter a: ");
        a = keyboard.nextInt();
        System.out.print("Enter b: ");
        b = keyboard.nextInt();
        System.out.print("Enter c: ");
        c = keyboard.nextInt();

        a = a % 2;
        b = b % 2;
        c = c % 2;

        if (a != 0) {
          counter++;
        }

        if (b != 0) {
          counter++;
        }

        if (c != 0) {
          counter++;
        }

        if (counter == 3) {
          System.out.println("\nThree intergers were odd.");
        }

        else if (counter == 2) {
          System.out.println("\nTwo intergers were odd.");
        }

        else if (counter == 1) {
          System.out.println("\nOne interger was odd.");
        }

        else {
          System.out.println("\nNo intergers were odd.");
        }

        }
}
