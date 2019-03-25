/*
Write a Java program that prompts the user to enter integers from the keyboard one
at a time. The program stops reading integers once the user enters the same value
three times consecutively (meaning three times, one after the other). Once input
is completed the program is to display the message "Same entered 3 in a row"
*/

import java.util.Scanner;

public class Problem3 {
public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int input;
        int temp;
        int counter = 1;

        boolean run = true;

        System.out.print("Enter an interger: ");
        input = keyboard.nextInt();
        temp = input;
        do {
                System.out.print("Enter an interger: ");
                input = keyboard.nextInt();

                if (input == temp) {
                        counter++;
                }

                else {
                        counter = 1;
                }

                temp = input;

                if (counter == 3) {
                        System.out.println("Same interger 3 times in a row");
                        run = false;
                }

        } while(run == true);
}
}
