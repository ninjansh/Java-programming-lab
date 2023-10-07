//Demonstrate the use of static method in java
import java.util.Scanner;

public class StaticMethodDemo {

    

    static void printMessage() {

        System.out.println("This is a static method.");

    }



    public static void main(String[] args) {



        StaticMethodDemo.printMessage();



        StaticMethodDemo instance = new StaticMethodDemo();

        instance.printMessage();

    }

}
