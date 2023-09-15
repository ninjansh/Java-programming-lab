//WAP in java to swap two numbers using temporary variable
 import java.util.Scanner;



public class SwapNumbers {

    public static void main(String[] args) {

        // Declare and initialize two numbers

        int num1 = 5;

        int num2 = 10;



        System.out.println("Before swapping:");

        System.out.println("num1 = " + num1);

        System.out.println("num2 = " + num2);



        // Swap the numbers using a temporary variable

        int temp = num1;

        num1 = num2;

        num2 = temp;



        System.out.println("After swapping:");

        System.out.println("num1 = " + num1);

        System.out.println("num2 = " + num2);

    }

}
