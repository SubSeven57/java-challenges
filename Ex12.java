// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Ex12 {
public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  //pi rad 2
  int numberOne;
  int numberTwo;
  int numberThree;
  float average = 0f;

  System.out.print("Enter first digit: ");
  numberOne = keyboard.nextInt();

  System.out.print("Enter second digit: ");
  numberTwo = keyboard.nextInt();

  System.out.print("Enter third digit: ");
  numberThree = keyboard.nextInt();

  average = ((numberOne + numberTwo + numberThree) / 3);

  System.out.println("The average is: " + average);
  }
}
