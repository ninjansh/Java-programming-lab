//WAP to print greatest common divider (GCD) of 2 numbers (not running)
import java.util.Scanner;

class A {

    public static void main(String[] args)

    {

        int gcd= 1;

        int n1 = 30;

        int n2 = 45;

        for(int i=1;i<=n1 && i<=n2;i++)

        {

            if ( n1%i==0&&n2%i==0)

            gcd = i;

            {

                System.out.println(" GCD OF " +n1+ " and " +n2+ " is " +gcd);

                

            }

            

        }

    }

}
