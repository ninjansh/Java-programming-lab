//Demonstrate the use of scanner class for taking Input/Output from user in java
import java.util.Scanner;



public class ScannerInputOutputDemo {

    public static void main(String[] args) {

    

        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter your name: ");



        String name = scanner.nextLine();



        System.out.print("Enter your age: ");



        int age = scanner.nextInt();



        System.out.println("Hello, " + name + "! You are " + age + " years old.");



        scanner.close();

    }

}
