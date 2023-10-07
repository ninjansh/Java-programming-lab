//Demonstrate the use of static variable in java
import java.util.Scanner;

public class StaticVariableDemo {



    static int staticVar = 0;



    public StaticVariableDemo() {

        staticVar++;

    }



    public static void main(String[] args) {

       

        StaticVariableDemo instance1 = new StaticVariableDemo();

        StaticVariableDemo instance2 = new StaticVariableDemo();

        StaticVariableDemo instance3 = new StaticVariableDemo();



        System.out.println("Static variable value: " + StaticVariableDemo.staticVar);



    }

}
