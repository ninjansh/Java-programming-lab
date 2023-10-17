// Arithematic and number format exception
import java.util.Scanner;
public class Test
{
    	public static void main(String[] args)
    	{
    	    Scanner scn=new Scanner(System.in);
    	    try
    	    {
    	        int n=Integer .parseInt(scn.nextLine());
    	        if(99%n==0)
    	         System.out.println(n+" is ta factor of 99");
    	        }
    	        catch(ArithmeticException ex)
    	        {
    	            System.out.println("Arithmetic "+ex);
    	        }
    	        catch(NumberFormatException ex)
    	        {
    	            System.out.println("Number Format Exception "+ex);
    	        }
    	    }
    	}
// save as "Test.java"
