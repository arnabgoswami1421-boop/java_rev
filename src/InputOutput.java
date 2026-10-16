import java.util.Scanner;

/**
 *     Java  input /output mechanism is needed for taking input from user using keybaord
 *     and displaying the output
 *
 *
 *     Java has many ways to take input but common ways are -
 *         1. Scanner Class
 *         2. Console
 *         3. String Tokens
 *
 *       Scanner sc = new Scanner(System.in)
 *       Scanner class does not have no argument constructor so we have to pass System.in always else it will throw error
 *
 *       Scanner class is part of Util package
 *
 *       sc.nextInt - for Integer
 *       sc.nextLong() - for Boolean
 *       sc.nextDecimal() - for Decimal values
 *       sc.next() - for single word
 *       sc.nextLine() - for complete Line
 *
 *       Output -
 *
 *       We have 3 common ways to print Outputs
 *         1. System.out.print - it will print with out line
 *         2. System.out.println- it will add lines (/n)
 *         3.System.out.printf -  for formatting
 *
 *
 * Example Program for all Illustration
 *
 */

public class InputOutput
{
     public static void main(String[] args){

         System.out.print("Hello World");

         System.out.println("Hello World");

         System.out.printf("Hello World");

         // output - HelloWorldHelloWorld
                     //HelloWorld

         //input
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter Your Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Your Age: ");
         int age = sc.nextInt();

         System.out.print("Enter Your Gender: ");
         String gender = sc.next();

         System.out.println("Your Name is "+name);
         System.out.println("Your Age is "+age);
         System.out.println("Your Gender is "+gender);


     }


}