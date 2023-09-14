// Switch case in java 
import java.util.Scanner;
  class Main{
   public static void main(String args[]){
       String s1="Your name";
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice: 0,1  ");
         int choice=sc.nextInt();
        switch (choice){
             case 0:
             System.out.println(s1.toLowerCase());
             break;
             case 1:
                System.out.println(s1.toUpperCase());
                break;
         }
    }
  }
