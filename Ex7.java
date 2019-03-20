// 7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner;
public class Ex7 {
public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  int input;
  int i;
  int result;

  System.out.print("Input a number. We'll multiply it unti 10: ");
  input = keyboard.nextInt();

  for (i=1; i<=10; i++) {
    result = input * i;
    System.out.println(input + " * " + i + " = " + result );
  }


  }

}
