// 11. Write a Java program to print the area and perimeter of a circle.
import java.util.Scanner;

public class Ex11 {
public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  //pi rad 2
  double radius;
  double pi = Math.PI;
  double area;
  double perimeter;

  System.out.print("Enter your radius: ");
  radius = keyboard.nextDouble();

  area = pi * Math.pow(radius, 2);
  perimeter =  (2 *  pi) * radius;

  System.out.println("The perimeter is: " + perimeter + " and the area is " + area );



  }
}
