// WAP to take input string from the user and enter 0 for uppercase and 1 for lowercase  
import java.util.Scanner;

public class Changecase {
    public static void main(String args[]) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter choise '0' for uppercase & '1' for lowercase: ");
        int i = sc.nextInt();
        switch (i) {
            case 0:
                {
                    System.out.println(s.toUpperCase());
                    break;
                }
            case 1:
                {
                    System.out.println(s.toLowerCase());
                    break;
                }
        }
    }
}
