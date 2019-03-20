import java.util.Scanner;

public class Ex5 {
public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  int inputOne;
  int inputTwo;
  int result;

  System.out.print("Enter first number: ");
  inputOne = keyboard.nextInt();

  System.out.print("Enter second number: ");
  inputTwo = keyboard.nextInt();

  result = inputOne * inputTwo;

  System.out.println(inputOne + " * " + inputTwo + " = " + result );
  }
}   //End of class
