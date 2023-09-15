//WAP to check weather a given character is vowel or consonant
import java.util.Scanner;

class A {

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

    System.out.println(" enter Char:-  ");

    char c = sc.next().charAt(0);

    if(c == 'a'|| c == 'A'||c == 'e' || c == 'E'||c == 'i'||c == 'I'||c == 'o'|| c == 'O'|| c == 'u'|| c == 'U')

    System.out.println("the is"+c+" is vowel");

    else

    System.out.println("tie is"+c+ " is consonant");

    }

}
