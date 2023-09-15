//WAP in java to create a class box with private members as length,breath,height. Create two methods getdimension(),setdimension() to set and get values. Create instances of this class to call the methods
import java.util.Scanner;



public class Box {

    private double length;

    private double breadth;

    private double height;



    public Box(double length, double breadth, double height) {

        this.length = length;

        this.breadth = breadth;

        this.height = height;

    }



    public void getDimensions() {

        System.out.println("Length: " + length);

        System.out.println("Breadth: " + breadth);

        System.out.println("Height: " + height);

    }



    public void setDimensions(double length, double breadth, double height) {

        this.length = length;

        this.breadth = breadth;

        this.height = height;

    }



    public static void main(String[] args) {

        

        Box myBox = new Box(5.0, 3.0, 2.0);



        System.out.println("Initial Box Dimensions:");

        myBox.getDimensions();



        myBox.setDimensions(6.0, 4.0, 3.0);



        System.out.println("\nUpdated Box Dimensions:");

        myBox.getDimensions();

    }

}

