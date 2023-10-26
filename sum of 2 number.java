// sum of 2 number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ob2 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = ob2.nextInt();
        System.out.println("Enter the second number:");
        int b = ob2.nextInt();
        int c = a + b;
        System.out.println("The sum of the two numbers is: " + c);
    }
}
