// Calculate area and perimeter of circle
import java.util.Scanner;

public class area {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius=s.nextDouble();
        double perimeter;
        double area;
        perimeter=2*Math.PI*radius;
        area=Math.PI*Math.pow(radius, 2);
        System.out.println("Perimeter of the circle is: " + perimeter);
        System.out.println("Area of the circle is: " + area);
    }
}
