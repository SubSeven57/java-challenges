/*
Write a Java program that has the user enter three decimal numbers. The program then outputs
whether they are entered in strictly increasing order, strictly decreasing order, or neither.

Enter value: 3.75
Enter value: 5.9
Enter value: 11.3

INCREASING!

*/

import java.util.Scanner;

public class Problem4 {
public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float inputOne = 0f;
        float inputTwo = 0f;
        float inputThree = 0f;

        System.out.print("Enter value: ");
        inputOne = keyboard.nextFloat();
        System.out.print("Enter value: ");
        inputTwo = keyboard.nextFloat();
        System.out.print("Enter value: ");
        inputThree = keyboard.nextFloat();

        if ((inputOne < inputTwo) && (inputTwo < inputThree)) {
          System.out.println("\nINCREASING!");
        }

        else if ((inputOne > inputTwo) && (inputTwo > inputThree)) {
          System.out.println("\nDECREASING!");
        }

        else {
          System.out.println("\nNEITHER!");
        }
      }
}
