//WAP in java to demonstrate using instance/class variable in a java program by creating a simple public class
import java.util.Scanner;

      public class VariableDemo {

  static int classVariable = 10;

        int instanceVariable = 20;



    public static void main(String[] args) {

        VariableDemo instance1 = new VariableDemo();

        VariableDemo instance2 = new VariableDemo();



        instance1.instanceVariable = 30;

        instance2.instanceVariable = 40;



        System.out.println("Class variable: " + VariableDemo.classVariable);



        System.out.println("Instance 1 variable: " + instance1.instanceVariable);

        System.out.println("Instance 2 variable: " + instance2.instanceVariable);

    }

}
