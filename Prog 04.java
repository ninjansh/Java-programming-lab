//WAP to print sum all the number to any given integer number (range addition)
import java.util.Scanner;

class A {

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

    System.out.println(" enter range:-  ");

    int n=sc.nextInt();

    float sum=0;

    for(int i =1;i<=n;i++)

    {

        sum = sum+i;

    }

    System.out.println(sum);

    }

}
