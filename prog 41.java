// to count even and odd in array
import java.util.Arrays;
 class a
 {
     public static void main (String[]args)
     {
         int a[]={2000,1998,1990,2002};
         int n=a.length;
         int counteven=0, countodd=0;
         for (int i=0;i<n;i++)
         {
             if(a[i]%2==0)
             counteven+=1;
             else
             countodd+=1;
         }
          System.out.println("even count: "+ counteven);
          System.out.println("odd count: "+ countodd);
     }
     }
// save as 
