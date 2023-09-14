//to take name and print amailid
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Year of admission: ");
        int i=sc.nextInt();
        String year=String.valueOf(i);
        System.out.println("Enter enrollment number: ");
        String enroll=sc1.nextLine();
        String Enroll=enroll.substring(0,4);
        String j=(name.concat(year)).concat(Enroll);
        System.out.println( j+"@acropolis.in");
    }
}
