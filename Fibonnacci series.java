// Fibonnacci range series user input 
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of fibonacci series: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            n3 = n1 + n2;
            a = n3;
            System.out.println(a);
            n1 = n2;
            n2 = n3;
        }
    }
}
